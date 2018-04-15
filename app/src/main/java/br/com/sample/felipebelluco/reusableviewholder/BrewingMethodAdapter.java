package br.com.sample.felipebelluco.reusableviewholder;

import java.util.List;

public class BrewingMethodAdapter extends BaseAdapter {
    private final int layoutId;
    private final List<CoffeeBrewingMethod> items;

    public BrewingMethodAdapter(int layoutId, List<CoffeeBrewingMethod> items) {
        this.layoutId = layoutId;
        this.items = items;
    }

    @Override
    protected Object getItemForPosition(int position) {
        return items.get(position);
    }

    @Override
    protected int getLayoutIdForPosition(int position) {
        return layoutId;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
