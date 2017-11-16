package com.tencent.mm.ui.widget.celltextview.c;

import android.graphics.RectF;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.Iterator;

public final class d
{
  public float xtA;
  public int xtB;
  public int xtC;
  public float xtD;
  public float xtE;
  private ArrayList<e> xtx;
  private ArrayList<RectF> xty;
  public float xtz;
  
  public d()
  {
    GMTrace.i(18753437827072L, 139724);
    GMTrace.o(18753437827072L, 139724);
  }
  
  public final e Er(int paramInt)
  {
    GMTrace.i(18753840480256L, 139727);
    if (paramInt < 0)
    {
      GMTrace.o(18753840480256L, 139727);
      return null;
    }
    if (this.xtx != null)
    {
      e locale = (e)this.xtx.get(paramInt);
      GMTrace.o(18753840480256L, 139727);
      return locale;
    }
    GMTrace.o(18753840480256L, 139727);
    return null;
  }
  
  public final RectF Es(int paramInt)
  {
    GMTrace.i(18753974697984L, 139728);
    if (paramInt < 0)
    {
      GMTrace.o(18753974697984L, 139728);
      return null;
    }
    if (this.xty != null)
    {
      RectF localRectF = (RectF)this.xty.get(paramInt);
      GMTrace.o(18753974697984L, 139728);
      return localRectF;
    }
    GMTrace.o(18753974697984L, 139728);
    return null;
  }
  
  public final void Et(int paramInt)
  {
    GMTrace.i(19011941171200L, 141650);
    if (this.xtx == null)
    {
      GMTrace.o(19011941171200L, 141650);
      return;
    }
    int k = this.xtx.size();
    if (paramInt >= k)
    {
      GMTrace.o(19011941171200L, 141650);
      return;
    }
    int i = 0;
    while (i < k - paramInt)
    {
      this.xtx.remove(k - i - 1);
      Object localObject = (RectF)this.xty.remove(k - i - 1);
      if (localObject != null)
      {
        this.xtz -= ((RectF)localObject).width();
        if (this.xtA >= ((RectF)localObject).height())
        {
          this.xtA = 0.0F;
          localObject = this.xtx.iterator();
          int j = 0;
          if (((Iterator)localObject).hasNext())
          {
            e locale = (e)((Iterator)localObject).next();
            RectF localRectF = (RectF)this.xty.get(j);
            if (locale.getType() == 0) {}
            for (this.xtA = ((int)localRectF.height());; this.xtA = ((int)localRectF.height())) {
              do
              {
                j += 1;
                break;
              } while ((locale.getType() != 2) || (this.xtA != 0.0F));
            }
          }
        }
      }
      i += 1;
    }
    GMTrace.o(19011941171200L, 141650);
  }
  
  public final void a(e parame, RectF paramRectF)
  {
    GMTrace.i(18753572044800L, 139725);
    if (this.xtx == null) {
      this.xtx = new ArrayList(1);
    }
    if (this.xty == null) {
      this.xty = new ArrayList(1);
    }
    this.xtx.add(parame);
    this.xty.add(paramRectF);
    float f2 = this.xtz;
    if (paramRectF.width() < 0.0F) {}
    for (float f1 = 0.0F;; f1 = paramRectF.width())
    {
      this.xtz = (f1 + f2);
      if (parame.getType() != 0) {
        break;
      }
      this.xtA = ((int)paramRectF.height());
      GMTrace.o(18753572044800L, 139725);
      return;
    }
    if ((parame.getType() == 2) && (this.xtA == 0.0F)) {
      this.xtA = ((int)paramRectF.height());
    }
    GMTrace.o(18753572044800L, 139725);
  }
  
  public final void eL(int paramInt1, int paramInt2)
  {
    GMTrace.i(18753706262528L, 139726);
    this.xtB = paramInt1;
    this.xtC = paramInt2;
    GMTrace.o(18753706262528L, 139726);
  }
  
  public final int getSize()
  {
    GMTrace.i(18754243133440L, 139730);
    if ((this.xtx == null) || (this.xty == null))
    {
      GMTrace.o(18754243133440L, 139730);
      return 0;
    }
    int i = this.xtx.size();
    int j = this.xty.size();
    if (i < j)
    {
      GMTrace.o(18754243133440L, 139730);
      return i;
    }
    GMTrace.o(18754243133440L, 139730);
    return j;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\celltextview\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */