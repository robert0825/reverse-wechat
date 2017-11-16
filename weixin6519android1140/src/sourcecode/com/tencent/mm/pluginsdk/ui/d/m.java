package com.tencent.mm.pluginsdk.ui.d;

import android.view.View;
import com.tencent.gmtrace.GMTrace;

public class m
  extends l
{
  private a tEB;
  private Object tag;
  
  public m()
  {
    GMTrace.i(1208899076096L, 9007);
    GMTrace.o(1208899076096L, 9007);
  }
  
  public m(Object paramObject, a parama)
  {
    super(2, null);
    GMTrace.i(1209033293824L, 9008);
    this.tEB = parama;
    this.tag = paramObject;
    GMTrace.o(1209033293824L, 9008);
  }
  
  public m(Object paramObject, a parama, int paramInt)
  {
    super(2, null);
    GMTrace.i(1209167511552L, 9009);
    this.tEB = parama;
    this.tag = paramObject;
    wY(paramInt);
    GMTrace.o(1209167511552L, 9009);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(1209301729280L, 9010);
    if (this.tEB != null) {
      this.tEB.bq(this.tag);
    }
    GMTrace.o(1209301729280L, 9010);
  }
  
  public static abstract interface a
  {
    public abstract void bq(Object paramObject);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\d\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */