package com.tencent.mm.plugin.luckymoney.ui;

import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  private List<b> mOt;
  private boolean mOu;
  private boolean mOv;
  private TextView mOw;
  
  public a()
  {
    GMTrace.i(9856278855680L, 73435);
    this.mOt = new LinkedList();
    this.mOu = false;
    this.mOv = false;
    GMTrace.o(9856278855680L, 73435);
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(9856413073408L, 73436);
    if (paramb == null)
    {
      GMTrace.o(9856413073408L, 73436);
      return;
    }
    this.mOt.add(paramb);
    GMTrace.o(9856413073408L, 73436);
  }
  
  public final boolean aMG()
  {
    GMTrace.i(9856815726592L, 73439);
    this.mOv = false;
    this.mOu = false;
    int i = 0;
    if (i < this.mOt.size())
    {
      Object localObject = (b)this.mOt.get(i);
      int j = ((b)localObject).aMI();
      if (j != 0)
      {
        ((b)localObject).onError();
        localObject = ((b)localObject).qd(j);
        if ((this.mOw != null) && (!bg.nm((String)localObject)))
        {
          if (!this.mOu) {
            this.mOw.setText((CharSequence)localObject);
          }
          this.mOw.setVisibility(0);
          this.mOu = true;
        }
        this.mOv = true;
      }
      for (;;)
      {
        i += 1;
        break;
        ((b)localObject).restore();
      }
    }
    if ((!this.mOv) && (this.mOw != null))
    {
      this.mOw.setVisibility(8);
      this.mOu = false;
    }
    boolean bool = this.mOv;
    GMTrace.o(9856815726592L, 73439);
    return bool;
  }
  
  public final boolean aMH()
  {
    GMTrace.i(9856949944320L, 73440);
    int i = 0;
    while (i < this.mOt.size())
    {
      if (((b)this.mOt.get(i)).aMI() != 0)
      {
        GMTrace.o(9856949944320L, 73440);
        return true;
      }
      i += 1;
    }
    GMTrace.o(9856949944320L, 73440);
    return false;
  }
  
  public final void clear()
  {
    GMTrace.i(9856681508864L, 73438);
    this.mOt.clear();
    this.mOw = null;
    GMTrace.o(9856681508864L, 73438);
  }
  
  public final void g(TextView paramTextView)
  {
    GMTrace.i(9856547291136L, 73437);
    if (paramTextView != null) {
      this.mOw = paramTextView;
    }
    GMTrace.o(9856547291136L, 73437);
  }
  
  public final void qn(String paramString)
  {
    GMTrace.i(9857084162048L, 73441);
    if ((this.mOw != null) && (!bg.nm(paramString)))
    {
      this.mOw.setText(paramString);
      this.mOw.setVisibility(0);
      this.mOu = true;
      GMTrace.o(9857084162048L, 73441);
      return;
    }
    if (this.mOw != null)
    {
      this.mOw.setVisibility(8);
      this.mOu = false;
    }
    GMTrace.o(9857084162048L, 73441);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */