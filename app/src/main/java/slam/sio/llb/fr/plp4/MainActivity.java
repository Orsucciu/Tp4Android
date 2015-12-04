package slam.sio.llb.fr.plp4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import slam.sio.llb.fr.plp4.metier.Duo;
import slam.sio.llb.fr.plp4.metier.LesDuos;


public class MainActivity extends AppCompatActivity implements OnItemClickListener {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        LesDuos lesDuos = new LesDuos();

        ArrayList<HashMap<String, String>> liste = lesDuos.donneListe();
        SimpleAdapter adapter = new SimpleAdapter(this, liste, R.layout.liste_duo,
                new String[] { "garcon", "fille", "epoque" },
                new int[] {R.id.textView, R.id.textView2, R.id.textView3 });

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(MainActivity.this, "Clic sur "+
                        ((HashMap<String, String>) listView.getAdapter().getItem(position)).get("garcon"),
                Toast.LENGTH_SHORT).show();
    }
}