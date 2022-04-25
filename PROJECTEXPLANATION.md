# Projects

This MineField lab serves as an example of concurrent programming and Syncrhonization. Threads are spawned and run alongside each other, also known as "searchers."
A "MineField" is generated of size 1000x1000 and a set number of bombs are spawned on the field.
#numberOfBombs + 1 searchers are spawned so that there's guaranteed to be a winner.
Each searcher randomly visits a tile on the board and checks if there is a bomb. If there is a bomb then the bomb and the searcher is removed.
Because threads are running simultaneously, order must be kept on the MineField so two searchers can't land on the same bomb at the same time.
As a result, the MineField is synchronized so that changes to the MineField itself have to happen in order, even if threads are being run in no particular order.
