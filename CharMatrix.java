/*
 * Implements a 2-D array of characters
 */

public class CharMatrix
{
    // Fields:
    char[][] m;  // this is the grid

    /*
     * Constructor: creates a grid with dimensions rows, cols,
     * and fills it with spaces
     */
    public CharMatrix(int rows, int cols) {
        m = new char[rows][cols];
        fillRect(0, 0, rows-1, cols-1, ' ');
    }

    /*
     * Constructor: creates a grid with dimensions rows , cols ,
     * and fills it with the fill  character
     */
    public CharMatrix(int rows, int cols, char fill) {
        m = new char[rows][cols];
        fillRect(0, 0, rows-1, cols-1, fill);
    }

    /*
     * Returns the number of rows in grid
     */
    public int numRows() {
        return m.length;
    }

    /*
     * Returns the number of columns in grid
     */
    public int numCols() {
        return m[0].length;
    }

    /*
     * Returns the character at the indexes [row, col]
     */
    public char charAt(int row, int col){
        return m[row][col];
    }

    /*
     * Sets the character at index [row, col] to ch
     */
    public void setCharAt(int row, int col, char ch) {
        m[row][col]=ch;
    }

    /*
     * Returns true if the character at row, col is a SPACE,
     * false otherwise
     */
    public boolean isEmpty(int row, int col) {
        if(m[row][col]==' ')
            return true;
        else
            return false;
    }

    /*
     * Fills the given rectangle with the fill characters.
     * row0, col0 is the upper left corner and row1, col1 is the
     * lower right corner of the rectangle.
     */
    public void fillRect(int row0, int col0, int row1, int col1, char fill) {
        for(int r=row0; r<=row1; r++){
            for(int c=col0; c<=col1; c++){
                m[r][c]=fill;
            }
        }
    }

    /*
     * Fills the given rectangle with the SPACE characters.
     * row0, col0 is the upper left corner and row1, col1 is the
     * lower right corner of the rectangle.
     */
    public void clearRect(int row0, int col0, int row1, int col1) {
        fillRect(row0, col0, row1, col1, ' ');
    }

    /*
     * Returns the count of all non-SPACE characters in row.
     */
    public int countInRow(int row) {
        int x=0;
        for(int c=0; c<m[0].length; c++){
            if(m[row][c]!=' ')
                x++;
        }
        return x;
    }

    /*
     * Returns the count of all non-SPACE characters in col.
     */
    public int countInCol(int col) {
        int y=0;
        for(int r=0; r<m.length; r++){
            if(m[r][col]!=' ')
                y++;
        }
        return y;
    }

    /*
     * Displays the contents of the matrix m
     */
    public void display () {
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[0].length; c++) {
                System.out.print(m[r][c]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main (String[] args) {
        CharMatrix matrix = new CharMatrix(3, 4, 'm');

        //program in your test cases here. Invoke methods from the
        //object called matrix, like this:
        System.out.println("orginal matrix: ");
        matrix.display();
        
        //System.out.println("Number of rows: ");
        //System.out.println(matrix.numRows());
        
        //System.out.println("Number of columns: ");
        //System.out.println(matrix.numCols());
        
        //System.out.println("Print selected char: ");
        //System.out.println(matrix.charAt(0,0));
        
        //System.out.println("first char set to 'a': ");
        //matrix.setCharAt(0,0,'a');
        //matrix.display();

        //System.out.println("Fill top 2x3 rec with 'a': ");
        //matrix.fillRect(0,0,1,2,'a');
        //matrix.display();

        System.out.println("clear top 2x3 rec: ");
        matrix.clearRect(0,0,1,2);
        matrix.display();
        //System.out.println("count number of non-space chars in first row: ");
        //System.out.println(matrix.countInRow(0));
        //System.out.println("count number of non-space chars in first column: ");
        //System.out.println(matrix.countInCol(0));

        System.out.println("return true if the selected char is empty space: ");
        System.out.println("top left corner: ");
        System.out.println(matrix.isEmpty(0,0));
        System.out.println("bottom left corner: ");
        System.out.println(matrix.isEmpty(2,1));
    }

}



