package mychipccloud.chen.com.mychipcloud;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adroitandroid.chipcloud.ChipCloud;

/**
 * Created by thinkpad on 2017/9/29.
 */

public class CustomBottomSheetDialogFragment extends BottomSheetDialogFragment {
    private ChipCloud chipCloud, chipCloud2;
    private String[] rom = new String[]{"4GB+32GB", "4GB+64GB", "6GB+64GB", "6GB+128GB"};
    private String[] colors = new String[]{"魅海蓝", "星空灰", "琥珀金", "幻夜黑", "只更鸟蓝"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.content_bottom_sheet, container, false);
        chipCloud = (ChipCloud) v.findViewById(R.id.chip_cloud);
        chipCloud2 = (ChipCloud) v.findViewById(R.id.chip2_cloud);
        chipCloud.addChips(rom);
        chipCloud2.addChips(colors);
        return v;
    }

}
