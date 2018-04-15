package br.com.sample.felipebelluco.reusableviewholder;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import br.com.sample.felipebelluco.reusableviewholder.BR;

public class GenericViewHolder extends RecyclerView.ViewHolder {
    private final ViewDataBinding binding;

    public GenericViewHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Object item) {
        binding.setVariable(BR.item, item);
        binding.executePendingBindings();
    }

}
