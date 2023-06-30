package sg.edu.np.mad.week4recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class BrandViewHolder extends RecyclerView.ViewHolder {
    TextView txt;

    public BrandViewHolder(View itemView){
        super(itemView);
        txt = itemView.findViewById(R.id.textView);
    }
}
