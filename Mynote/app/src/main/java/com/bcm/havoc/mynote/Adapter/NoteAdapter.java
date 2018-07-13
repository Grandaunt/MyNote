package com.bcm.havoc.mynote.Adapter;

import com.bcm.havoc.mynote.Entity.MathEntity;
import com.bcm.havoc.mynote.R;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class NoteAdapter extends BaseMultiItemQuickAdapter<MathEntity, BaseViewHolder> {
    public NoteAdapter(List<MathEntity> data) {
        super(data);
        addItemType(MathEntity.REC, R.layout.item_list_one);
        addItemType(MathEntity.REC, R.layout.item_list_two);
        addItemType(MathEntity.REC, R.layout.item_list_three);
        addItemType(MathEntity.REC, R.layout.item_list_four);
        addItemType(MathEntity.INF, R.layout.item_list_five);
        addItemType(MathEntity.CIR, R.layout.item_list_six);

    }

    @Override
    protected void convert(BaseViewHolder helper, MathEntity item) {
        switch (helper.getItemViewType()) {
            case MathEntity.REC:
//                helper.setText(R.id.tv_move_rec_title, item.getNoticeName())
////                            .setText(R.id.tv_move_rec_time, item.getActivityTime())
//                        .setText(R.id.tv_move_rec_time, item.getNoticeDescription())
//                        .setText(R.id.tv_move_rec_mark, "招聘会")
//                        .setText(R.id.tv_move_rec_show_time, item.getCreateTime());
//                ImageView logo = helper.getView(R.id.im_move_rec_im);
//                x.image().bind(logo, item.getImageUrl(), options1);
////                            .setImageUrl(R.id.im_move_rec_im, item.getTargetUrl());
                break;
            case MathEntity.INF:
//                helper.setText(R.id.tv_move_inf_title, item.getNoticeName())
//                        .setText(R.id.tv_move_inf_time, item.getCreateTime())
//                        .setText(R.id.tv_move_inf_content, item.getNoticeDescription())
//                        .setText(R.id.tv_move_inf_mark, "申请");
                break;
            case MathEntity.CIR:
//                helper.setText(R.id.tv_move_cir_title, item.getNickName())
//                        .setText(R.id.tv_move_cir_content, item.getContentText())
//                        .setText(R.id.tv_move_cir_time,"接头时间：" +item.getActivityTime() )
//                        .setText(R.id.tv_move_cir_address, "接头地点：" +item.getActivityAddress())
//                        .setText(R.id.tv_move_cir_mark, "圈子");
//                ImageView logo2 = helper.getView(R.id.im_move_cir_im);
//                x.image().bind(logo2, item.getImageUrl(), options1);
                break;
        }




    }
}
