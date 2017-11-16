package com.tencent.mm.ui.base;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.l;

public final class m
  extends AlertDialog
{
  private ListView Ev;
  private View jBw;
  public BaseAdapter jDh;
  private Context mContext;
  public AdapterView.OnItemClickListener tFM;
  private CharSequence tX;
  
  public m(Context paramContext)
  {
    super(paramContext, a.l.eme);
    GMTrace.i(3358261772288L, 25021);
    this.mContext = paramContext;
    if (a.ed(this.mContext)) {}
    for (this.jBw = View.inflate(this.mContext, a.h.gfm, null);; this.jBw = View.inflate(this.mContext, a.h.gfl, null))
    {
      this.Ev = ((ListView)this.jBw.findViewById(a.g.list));
      GMTrace.o(3358261772288L, 25021);
      return;
    }
  }
  
  public final void dismiss()
  {
    GMTrace.i(3358798643200L, 25025);
    try
    {
      super.dismiss();
      GMTrace.o(3358798643200L, 25025);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MMListDialog", "dismiss exception, e = " + localException.getMessage());
      GMTrace.o(3358798643200L, 25025);
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3358395990016L, 25022);
    super.onCreate(paramBundle);
    setContentView(this.jBw);
    GMTrace.o(3358395990016L, 25022);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    GMTrace.i(3358530207744L, 25023);
    if (paramCharSequence != null)
    {
      this.tX = paramCharSequence;
      GMTrace.o(3358530207744L, 25023);
      return;
    }
    this.tX = null;
    GMTrace.o(3358530207744L, 25023);
  }
  
  public final void show()
  {
    GMTrace.i(3358664425472L, 25024);
    if (this.tX != null) {
      this.tX.length();
    }
    if (this.tFM != null) {
      this.Ev.setOnItemClickListener(this.tFM);
    }
    if (this.jDh != null) {
      this.Ev.setAdapter(this.jDh);
    }
    super.show();
    GMTrace.o(3358664425472L, 25024);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */