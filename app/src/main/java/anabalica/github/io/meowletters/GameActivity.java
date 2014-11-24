package anabalica.github.io.meowletters;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TableLayout;
import android.widget.RelativeLayout.LayoutParams;


/**
 * This is the activity that starts or continues the game. It is an educational
 * game for children to practice the knowledge of an alphabet.
 *
 * @author Ana Balica
 */
public class GameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        this.setGameGridHeight();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Set the height of the TableLayout gameGrid to be the same as its width
     */
    private void setGameGridHeight() {
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        int width = displayMetrics.widthPixels;
        int height = width;

        TableLayout gameGrid = (TableLayout) findViewById(R.id.gameGrid);
        gameGrid.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, height));
    }
}
