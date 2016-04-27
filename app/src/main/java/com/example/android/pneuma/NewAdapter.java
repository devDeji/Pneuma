package com.example.android.pneuma;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import customfonts.MyTextView;

@SuppressWarnings("unchecked")
public class NewAdapter extends BaseExpandableListAdapter {

    private final Context context;
    public ArrayList<String> groupItem, tempChild;
    public ArrayList<Object> childItem = new ArrayList<Object>();
    public LayoutInflater minflater;
    public Activity activity;

    public NewAdapter(Context context, ArrayList<String> grList, ArrayList<Object> childItem) {
        this.context = context;
        groupItem = grList;
        this.childItem = childItem;
    }

    public void setInflater(LayoutInflater mInflater, Activity act) {
        this.minflater = mInflater;
        activity = act;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public View getChildView(final int groupPosition, final int childPosition,
                             boolean isLastChild, View v, ViewGroup parent) {
        tempChild = (ArrayList<String>) childItem.get(groupPosition);
        MyTextView text = null;
        if (v == null) {
            v = new MyTextView(context);
        }
        text = (MyTextView) v;
        text.setTextSize(15.0f);
        text.layout(25, 25, 25, 25);
        text.setPadding(10, 10, 10, 10);
        String uri = "drawable/user";
        int imageResource = R.drawable.user;
        int imageResources = v.getContext().getResources().getIdentifier(uri, null, v.getContext().getPackageName());
        Drawable image = v.getContext().getResources().getDrawable(imageResource);
        text.setCompoundDrawables(image, null, null, null);
        text.setCompoundDrawablePadding(16);
        text.setText("     " + tempChild.get(childPosition));
        v.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (groupPosition) {
                    case 0:
                        switch (childPosition) {
                            case 0:
                                Toast.makeText(v.getContext(), "Clicked On 0 Child on 0 grp" + v.getTag() + "group:" + groupItem.get(groupPosition),
                                        Toast.LENGTH_SHORT).show();
                                break;
                            case 1:
                                Toast.makeText(v.getContext(), "Clicked On 1 Child on 0 grp" + v.getTag() + "child:" + childItem.get(childPosition),
                                        Toast.LENGTH_SHORT).show();
                                break;
                            case 2:
                                Toast.makeText(v.getContext(), "Clicked On 2 Child on 0 grp" + v.getTag(),
                                        Toast.LENGTH_SHORT).show();
                                break;
                            case 3:
                                Toast.makeText(v.getContext(), "Clicked On 3 Child on 0 grp" + v.getTag(),
                                        Toast.LENGTH_SHORT).show();
                                break;
                        }

                        break;
                    case 1:
                        switch (childPosition) {
                            case 0:
                                Toast.makeText(v.getContext(), "Clicked On 0 Child on 1 grp" + v.getTag(),
                                        Toast.LENGTH_SHORT).show();
                                break;
                            case 1:
                                Toast.makeText(v.getContext(), "Clicked On 1 Child on 1 grp" + v.getTag(),
                                        Toast.LENGTH_SHORT).show();
                                break;
                            case 2:
                                Toast.makeText(v.getContext(), "Clicked On 2 Child on 1 grp" + v.getTag(),
                                        Toast.LENGTH_SHORT).show();
                                break;
                            case 3:
                                Toast.makeText(v.getContext(), "Clicked On 3 Child on 1 grp" + v.getTag(),
                                        Toast.LENGTH_SHORT).show();
                                break;
                        }
                        break;
                    case 2:
                        switch (childPosition) {
                            case 0:
                                Toast.makeText(v.getContext(), "Clicked On 0 Child on 2 grp" + v.getTag(),
                                        Toast.LENGTH_SHORT).show();
                                break;
                            case 1:
                                Toast.makeText(v.getContext(), "Clicked On 1 Child on 2 grp" + v.getTag(),
                                        Toast.LENGTH_SHORT).show();
                                break;
                            case 2:
                                Toast.makeText(v.getContext(), "Clicked On 2 Child on 2 grp" + v.getTag(),
                                        Toast.LENGTH_SHORT).show();
                                break;
                            case 3:
                                Toast.makeText(v.getContext(), "Clicked On 3 Child on 2 grp" + v.getTag(),
                                        Toast.LENGTH_SHORT).show();
                                break;
                        }
                        break;
                    case 3:
                        switch (childPosition) {
                            case 0:
                                Toast.makeText(v.getContext(), "Clicked On 0 Child on 3 grp" + v.getTag(),
                                        Toast.LENGTH_SHORT).show();
                                break;
                            case 1:
                                Toast.makeText(v.getContext(), "Clicked On 1 Child on 3 grp" + v.getTag(),
                                        Toast.LENGTH_SHORT).show();
                                break;
                            case 2:
                                Toast.makeText(v.getContext(), "Clicked On 2 Child on 3 grp" + v.getTag(),
                                        Toast.LENGTH_SHORT).show();
                                break;
                            case 3:
                                Toast.makeText(v.getContext(), "Clicked On 3 Child on 3 grp" + v.getTag(),
                                        Toast.LENGTH_SHORT).show();
                                break;
                        }
                        break;
                }
            }
        });


		/*convertView.setOnClickListener(new OnClickListener() {
            @Override
			public void onClick(View v) {
				Toast.makeText(v.getContext(), tempChild.get(childPosition),
						Toast.LENGTH_SHORT).show();
			}
		});
		convertView.setTag(tempChild.get(childPosition));
		*/
        return v;
    }


    @Override
    public int getChildrenCount(int groupPosition) {
        return ((ArrayList<String>) childItem.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return null;
    }

    @Override
    public int getGroupCount() {
        return groupItem.size();
    }

    @Override
    public void onGroupCollapsed(int groupPosition) {
        super.onGroupCollapsed(groupPosition);
    }

    @Override
    public void onGroupExpanded(int groupPosition) {
        super.onGroupExpanded(groupPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = new TextView(context);
        }
        ((TextView) convertView).setCompoundDrawablePadding(20);
        int imageResource2 = R.drawable.user;
        Drawable image2 = convertView.getResources().getDrawable(imageResource2);
        ((TextView) convertView).setCompoundDrawables(null, null, null, image2);
        convertView.setPadding(30, 30, 30, 30);
        ((TextView) convertView).setAllCaps(true);
        ((TextView) convertView).setTextSize(30);
        ((TextView) convertView).setText("                   " + groupItem.get(groupPosition));
        convertView.setTag(groupItem.get(groupPosition));
        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

}
