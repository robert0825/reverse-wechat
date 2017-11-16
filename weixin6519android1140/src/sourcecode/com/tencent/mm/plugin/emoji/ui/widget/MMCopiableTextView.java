package com.tencent.mm.plugin.emoji.ui.widget;

import android.content.Context;
import android.text.ClipboardManager;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class MMCopiableTextView
  extends EditText
  implements View.OnLongClickListener
{
  private final String TAG;
  private int iPp;
  private int kvw;
  
  public MMCopiableTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11361530675200L, 84650);
    this.TAG = "MicroMsg.MMCopiableTextView";
    init();
    GMTrace.o(11361530675200L, 84650);
  }
  
  public MMCopiableTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11361664892928L, 84651);
    this.TAG = "MicroMsg.MMCopiableTextView";
    init();
    GMTrace.o(11361664892928L, 84651);
  }
  
  private void init()
  {
    GMTrace.i(11361799110656L, 84652);
    setOnLongClickListener(this);
    setLongClickable(true);
    GMTrace.o(11361799110656L, 84652);
  }
  
  protected boolean getDefaultEditable()
  {
    GMTrace.i(11362067546112L, 84654);
    GMTrace.o(11362067546112L, 84654);
    return false;
  }
  
  protected void onCreateContextMenu(ContextMenu paramContextMenu)
  {
    GMTrace.i(11361933328384L, 84653);
    GMTrace.o(11361933328384L, 84653);
  }
  
  public boolean onLongClick(View paramView)
  {
    GMTrace.i(11362201763840L, 84655);
    paramView = getEditableText().toString();
    if ((!bg.nm(paramView)) && (this.iPp > 0) && (this.kvw > 0) && (this.kvw > this.iPp))
    {
      ClipboardManager localClipboardManager = (ClipboardManager)getContext().getSystemService("clipboard");
      if (localClipboardManager != null)
      {
        localClipboardManager.setText(paramView.substring(this.iPp, this.kvw).trim());
        w.i("MicroMsg.MMCopiableTextView", "copy text :%s", new Object[] { localClipboardManager.getText() });
      }
      Toast.makeText(getContext(), R.l.cSq, 0).show();
    }
    GMTrace.o(11362201763840L, 84655);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\widget\MMCopiableTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */