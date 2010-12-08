package net.behoo.appmarket;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class AppUpdatePage extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.app_update_page);
		
		ListView lv = (ListView)findViewById(R.id.app_update_list);
		lv.setAdapter(new UpdateListAdapter(this));
	}
	
	private class UpdateListAdapter extends BaseAdapter {
		private Context mContext;
        private LayoutInflater mInflater;
        
        public UpdateListAdapter(Context context) {
            mContext = context;
            mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        public int getCount() {
            return 10;
        }

        public Object getItem(int position) {
            return position;
        }

        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            TextView text;
            
            if (convertView == null) {
                text = (TextView)mInflater.inflate(android.R.layout.simple_list_item_1, parent, false);
            } else {
                text = (TextView)convertView;
            }
            text.setText("込込込込込込込込");
            return text;
        }
    }
}
