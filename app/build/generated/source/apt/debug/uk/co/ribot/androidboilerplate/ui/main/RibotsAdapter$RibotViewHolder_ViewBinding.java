// Generated code from Butter Knife. Do not modify!
package uk.co.ribot.androidboilerplate.ui.main;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import uk.co.ribot.androidboilerplate.R;

public class RibotsAdapter$RibotViewHolder_ViewBinding<T extends RibotsAdapter.RibotViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public RibotsAdapter$RibotViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.hexColorView = Utils.findRequiredView(source, R.id.view_hex_color, "field 'hexColorView'");
    target.nameTextView = Utils.findRequiredViewAsType(source, R.id.text_name, "field 'nameTextView'", TextView.class);
    target.emailTextView = Utils.findRequiredViewAsType(source, R.id.text_email, "field 'emailTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.hexColorView = null;
    target.nameTextView = null;
    target.emailTextView = null;

    this.target = null;
  }
}
