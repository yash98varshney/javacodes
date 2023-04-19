package Backtracking;

public class rat_in_a_maze {
    
    public static boolean mazeSolve(int[][]maze ,int i,int j,int[][] path){
        int n=maze.length;
        // check i and j are valid cell or not 

        if(i<0 ||  i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1){
            return false;
        }

        //include current cell in path 
        path[i][j]=1;

        // check for destinationn cell in this case it is maze[n-1][n-1]

        if(i==n-1 && j==n-1){
            return true;
        }

        //Explore further in all direction Top Right Bottom Left

        if(mazeSolve(maze, i-1, j, path)){
            return true;
        }

        if(mazeSolve(maze, i, j+1, path)){
            return true;
        }

        if(mazeSolve(maze, i+1, j, path)){
            return true;
        }

        if(mazeSolve(maze, i, j-1, path)){
            return true;
        }
        return false;
    }
    public static boolean ratInAMaze(int[][] maze){
        int n=maze.length;
        int[][] path=new int[n][n];
        return (mazeSolve(maze, 0, 0, path));
    }
    public static void main(String[] args){
        int[][] maze={{1,1,0},{1,1,0},{1,1,1}};
        boolean pathPossible=ratInAMaze(maze);
        System.out.println(pathPossible);
    }
}
