<pre><code>
import java.io.*;
import java.util.*;
import java.text.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Solution {

    // <\\s*(\\w+)(\\s*|>) <-- gets every tag
    // (?<=(\\s))(\\w+)*(?=(=)) <-- gets every attr

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int lines = Integer.parseInt(scan.nextLine());
        final Pattern tag_p = Pattern.compile("<\\s*(\\w+)(\\s*|>|\\n)");
        Map<String, List<String>> tagAttr = new HashMap<String, List<String>>();

        for (int i = 0; i < lines; i++) {

            String html = scan.nextLine();
            Matcher tags = tag_p.matcher(html);

            while (tags.find()) {
                String tag = tags.group(1);
                Pattern elem_p = Pattern.compile("<\\s*" + tag + ".*?>");
                Matcher elems = elem_p.matcher(html);
                if (!tagAttr.containsKey(tag))
                    tagAttr.put(tag, new ArrayList<String>());
                while (elems.find()) {
                    String elem = elems.group();
                    Pattern attr_p = Pattern.compile("(?<!(" + tag + "[a-z]))\\s(\\w+)(?=(=))");
                    Matcher attrs = attr_p.matcher(elem);
                    while (attrs.find()) {
                        String attr = attrs.group(2);
                        if (!tagAttr.get(tag).contains(attr)) {
                            tagAttr.get(tag).add(attr);
                        }
                    }
                }
            }
        }

        for (String i : tagAttr.keySet()) {
            Collections.sort(tagAttr.get(i));
        }

        TreeMap<String, List<String>> sorted = new TreeMap<>(tagAttr);
        Set<Entry<String, List<String>>> mappings = sorted.entrySet();

        for (Entry<String, List<String>> mapping : mappings) {
            System.out.println(mapping.getKey() + ":" + String.join(",", mapping.getValue()));
        }

    }
}
</code></pre>