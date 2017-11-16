package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.v;

public final class b
{
  private final String TAG;
  public TextView jHc;
  public View kgo;
  public String kgw;
  public ImageView kgx;
  public ImageView kgy;
  public Context mContext;
  
  public b(Context paramContext, int paramInt)
  {
    GMTrace.i(11356564619264L, 84613);
    this.TAG = "MicroMsg.emoji.BaseEmojiStoreItemViewHolder";
    this.mContext = paramContext;
    this.kgo = v.fb(this.mContext).inflate(paramInt, null);
    aqh();
    GMTrace.o(11356564619264L, 84613);
  }
  
  public b(Context paramContext, View paramView)
  {
    GMTrace.i(11356698836992L, 84614);
    this.TAG = "MicroMsg.emoji.BaseEmojiStoreItemViewHolder";
    this.mContext = paramContext;
    this.kgo = paramView;
    aqh();
    GMTrace.o(11356698836992L, 84614);
  }
  
  private void aqh()
  {
    GMTrace.i(11356833054720L, 84615);
    if (this.kgo == null)
    {
      w.w("MicroMsg.emoji.BaseEmojiStoreItemViewHolder", "initView failed. root is null.");
      GMTrace.o(11356833054720L, 84615);
      return;
    }
    this.kgx = ((ImageView)this.kgo.findViewById(R.h.bIL));
    this.jHc = ((TextView)this.kgo.findViewById(R.h.bJd));
    this.kgy = ((ImageView)this.kgo.findViewById(R.h.bIJ));
    GMTrace.o(11356833054720L, 84615);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */