package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.RadioGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.f.c.b;
import java.util.ArrayList;

public final class j
{
  public static abstract interface a
  {
    public abstract void Qr();
  }
  
  public static final class b
  {
    public Context mContext;
    public i oaD;
    public final i.a twQ;
    public String wbp;
    public String wbq;
    public boolean wbr;
    public boolean wbs;
    public RadioGroup wbt;
    private ArrayList<Integer> wbu;
    
    public b(Context paramContext)
    {
      GMTrace.i(21007087697920L, 156515);
      this.wbp = null;
      this.wbq = null;
      this.wbr = false;
      this.wbs = false;
      this.wbu = new ArrayList();
      this.mContext = paramContext;
      this.twQ = new i.a(this.mContext);
      this.twQ.lz(false);
      this.twQ.lA(false);
      this.twQ.a(new i.a.c()
      {
        public final CharSequence a(CharSequence paramAnonymousCharSequence, float paramAnonymousFloat)
        {
          GMTrace.i(20997021368320L, 156440);
          paramAnonymousCharSequence = b.c(j.b.this.mContext, paramAnonymousCharSequence, paramAnonymousFloat);
          GMTrace.o(20997021368320L, 156440);
          return paramAnonymousCharSequence;
        }
      });
      GMTrace.o(21007087697920L, 156515);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */