package com.tencent.mm.plugin.favorite.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.base.MMTagPanel.a;
import com.tencent.mm.ui.base.MMTagPanel.d;
import java.util.Iterator;
import java.util.LinkedList;

public class FavTagPanel
  extends MMTagPanel
{
  public LinkedList<MMTagPanel.d> lgW;
  a lgX;
  public View.OnClickListener lgY;
  
  public FavTagPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6450369789952L, 48059);
    this.lgW = new LinkedList();
    this.lgX = null;
    this.lgY = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(6447953870848L, 48041);
        if (((Integer)paramAnonymousView.getTag()).intValue() == 0)
        {
          FavTagPanel.a(FavTagPanel.this, (TextView)paramAnonymousView);
          if (FavTagPanel.a(FavTagPanel.this) != null)
          {
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(6459496595456L, 48127);
                FavTagPanel.a(FavTagPanel.this);
                ((TextView)paramAnonymousView).getText().toString();
                GMTrace.o(6459496595456L, 48127);
              }
            });
            GMTrace.o(6447953870848L, 48041);
          }
        }
        else
        {
          FavTagPanel.b(FavTagPanel.this, (TextView)paramAnonymousView);
          if (FavTagPanel.a(FavTagPanel.this) != null) {
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(6451309314048L, 48066);
                FavTagPanel.a(FavTagPanel.this).yg(((TextView)paramAnonymousView).getText().toString());
                GMTrace.o(6451309314048L, 48066);
              }
            });
          }
        }
        GMTrace.o(6447953870848L, 48041);
      }
    };
    GMTrace.o(6450369789952L, 48059);
  }
  
  public FavTagPanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6450235572224L, 48058);
    this.lgW = new LinkedList();
    this.lgX = null;
    this.lgY = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(6447953870848L, 48041);
        if (((Integer)paramAnonymousView.getTag()).intValue() == 0)
        {
          FavTagPanel.a(FavTagPanel.this, (TextView)paramAnonymousView);
          if (FavTagPanel.a(FavTagPanel.this) != null)
          {
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(6459496595456L, 48127);
                FavTagPanel.a(FavTagPanel.this);
                ((TextView)paramAnonymousView).getText().toString();
                GMTrace.o(6459496595456L, 48127);
              }
            });
            GMTrace.o(6447953870848L, 48041);
          }
        }
        else
        {
          FavTagPanel.b(FavTagPanel.this, (TextView)paramAnonymousView);
          if (FavTagPanel.a(FavTagPanel.this) != null) {
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(6451309314048L, 48066);
                FavTagPanel.a(FavTagPanel.this).yg(((TextView)paramAnonymousView).getText().toString());
                GMTrace.o(6451309314048L, 48066);
              }
            });
          }
        }
        GMTrace.o(6447953870848L, 48041);
      }
    };
    GMTrace.o(6450235572224L, 48058);
  }
  
  protected final void ayY()
  {
    GMTrace.i(6450504007680L, 48060);
    if (this.ulN.size() > 0)
    {
      GMTrace.o(6450504007680L, 48060);
      return;
    }
    if (this.lgW.isEmpty())
    {
      GMTrace.o(6450504007680L, 48060);
      return;
    }
    String str = ((MMTagPanel.d)this.lgW.getLast()).wfB;
    yh(str);
    if (this.lgX != null) {
      this.lgX.yf(str);
    }
    cat();
    GMTrace.o(6450504007680L, 48060);
  }
  
  public final void yh(String paramString)
  {
    GMTrace.i(6450638225408L, 48061);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.FavTagPanel", "want to remove type, but it is null or empty");
      GMTrace.o(6450638225408L, 48061);
      return;
    }
    Iterator localIterator = this.lgW.iterator();
    while (localIterator.hasNext())
    {
      MMTagPanel.d locald = (MMTagPanel.d)localIterator.next();
      if (paramString.equals(locald.wfB))
      {
        this.lgW.remove(locald);
        removeView(locald.wfC);
        a(locald);
        cat();
        GMTrace.o(6450638225408L, 48061);
        return;
      }
    }
    w.w("MicroMsg.FavTagPanel", "want to remove type %s, but it not exsited!", new Object[] { paramString });
    GMTrace.o(6450638225408L, 48061);
  }
  
  public static abstract interface a
    extends MMTagPanel.a
  {
    public abstract void yf(String paramString);
    
    public abstract void yg(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\base\FavTagPanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */