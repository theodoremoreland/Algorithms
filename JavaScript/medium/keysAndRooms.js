// There are N rooms and you start in room 0.  Each room has a distinct number in 0, 1, 2, ..., N-1, and each room may have some keys to access the next room. 
// Formally, each room i has a list of keys rooms[i], and each key rooms[i][j] is an integer in [0, 1, ..., N-1] where N = rooms.length.  A key rooms[i][j] = v opens the room with number v.
// Initially, all the rooms start locked (except for room 0). 
// You can walk back and forth between rooms freely.
// Return true if and only if you can enter every room.

// Example 1:
// Input: [[1],[2],[3],[]]
// Output: true

// Explanation:  
// We start in room 0, and pick up key 1.
// We then go to room 1, and pick up key 2.
// We then go to room 2, and pick up key 3.
// We then go to room 3.  Since we were able to go to every room, we return true.

// Example 2:
// Input: [[1,3],[3,0,1],[2],[0]]
// Output: false

// Explanation: We can't enter the room with number 2.

// Note:
// 1 <= rooms.length <= 1000
// 0 <= rooms[i].length <= 1000
// The number of keys in all rooms combined is at most 3000.

/**
 * @param {number[][]} rooms
 * @return {boolean}
 */
var canVisitAllRooms = function (rooms) {
    let keys = [...rooms[0]];
    rooms[0] = null; // immediately destroys first room
    let numOfRoomsVisited = 1;
    let numOfRooms = rooms.length;

    if (numOfRooms === 1) { return true; }

    function collectKeys(room) {
        try {
            for (let key of room) {
                keys.push(key);
            }
        }

        catch { }
    }

    function destroyRoom(idx) {
        rooms[idx] = null;
    }

    function destroyKey() {
        keys.splice(0, 1);
    }


    // asssumes there is a key and a corresponding room
    function useFirstKey(firstKey) {
        let room = rooms[firstKey];
        if (room !== undefined && room !== null) {
            collectKeys(room); // all keys from current room pushed into keys array
            destroyRoom(firstKey); // room becomes null
            numOfRoomsVisited += 1;
        }
        destroyKey(); // first key is removed from kys array  
    }

    do {
        let firstKey = keys[0];
        useFirstKey(firstKey);

    } while (keys.length > 0) // ends when there are no keys

    if (numOfRoomsVisited === numOfRooms) { return true; }
    else { return false; }

};