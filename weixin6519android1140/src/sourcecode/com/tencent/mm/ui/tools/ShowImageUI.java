package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.plugin.gif.c;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.h.d;
import java.util.LinkedList;
import java.util.List;

public class ShowImageUI
  extends MMActivity
{
  private MMGestureGallery jFH;
  private boolean xjv;
  private a xjw;
  private boolean xjx;
  
  public ShowImageUI()
  {
    GMTrace.i(1914481672192L, 14264);
    GMTrace.o(1914481672192L, 14264);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1914615889920L, 14265);
    int i = R.i.cGC;
    GMTrace.o(1914615889920L, 14265);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1914750107648L, 14266);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("key_title");
    if (!bg.nm(paramBundle)) {
      sq(paramBundle);
    }
    this.xjv = getIntent().getBooleanExtra("key_favorite", false);
    this.xjx = getIntent().getBooleanExtra("show_menu", true);
    this.jFH = ((MMGestureGallery)findViewById(R.h.bCs));
    this.jFH.setVerticalFadingEdgeEnabled(false);
    this.jFH.setHorizontalFadingEdgeEnabled(false);
    this.xjw = new a((byte)0);
    this.xjw.imagePath = getIntent().getStringExtra("key_image_path");
    this.jFH.setAdapter(this.xjw);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2052054843392L, 15289);
        ShowImageUI.this.finish();
        GMTrace.o(2052054843392L, 15289);
        return true;
      }
    });
    if (this.xjx) {
      a(0, R.k.cNO, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2009642041344L, 14973);
          paramAnonymousMenuItem = new LinkedList();
          LinkedList localLinkedList = new LinkedList();
          if ((ShowImageUI.a(ShowImageUI.this)) && (d.LL("favorite")))
          {
            localLinkedList.add(Integer.valueOf(0));
            paramAnonymousMenuItem.add(ShowImageUI.this.getString(R.l.dSm));
            localLinkedList.add(Integer.valueOf(1));
            paramAnonymousMenuItem.add(ShowImageUI.this.getString(R.l.dNH));
            localLinkedList.add(Integer.valueOf(2));
            paramAnonymousMenuItem.add(ShowImageUI.this.getString(R.l.dUM));
          }
          for (;;)
          {
            dh localdh = new dh();
            localdh.eEV.eDr = ShowImageUI.this.getIntent().getLongExtra("key_message_id", -1L);
            a.vgX.m(localdh);
            if (localdh.eEW.eEu)
            {
              localLinkedList.add(Integer.valueOf(3));
              paramAnonymousMenuItem.add(ShowImageUI.this.getString(R.l.dgi));
            }
            com.tencent.mm.ui.base.h.a(ShowImageUI.this, "", paramAnonymousMenuItem, localLinkedList, "", false, new h.d()
            {
              public final void bT(int paramAnonymous2Int1, int paramAnonymous2Int2)
              {
                GMTrace.i(1959713046528L, 14601);
                switch (paramAnonymous2Int2)
                {
                }
                for (;;)
                {
                  GMTrace.o(1959713046528L, 14601);
                  return;
                  ShowImageUI.b(ShowImageUI.this);
                  GMTrace.o(1959713046528L, 14601);
                  return;
                  ShowImageUI localShowImageUI = ShowImageUI.this;
                  cf localcf = new cf();
                  long l = localShowImageUI.getIntent().getLongExtra("key_message_id", -1L);
                  if (-1L == l)
                  {
                    w.w("MicroMsg.ShowImageUI", "msg id error, try fav simple data");
                    com.tencent.mm.pluginsdk.model.e.a(localcf, localShowImageUI.getIntent().getIntExtra("key_favorite_source_type", 1), localShowImageUI.getIntent().getStringExtra("key_image_path"));
                  }
                  for (;;)
                  {
                    localcf.eDv.activity = localShowImageUI;
                    a.vgX.m(localcf);
                    GMTrace.o(1959713046528L, 14601);
                    return;
                    com.tencent.mm.pluginsdk.model.e.a(localcf, l);
                  }
                  ShowImageUI.c(ShowImageUI.this);
                  GMTrace.o(1959713046528L, 14601);
                  return;
                  ShowImageUI.d(ShowImageUI.this);
                }
              }
            });
            GMTrace.o(2009642041344L, 14973);
            return true;
            localLinkedList.add(Integer.valueOf(0));
            paramAnonymousMenuItem.add(ShowImageUI.this.getString(R.l.dSm));
            localLinkedList.add(Integer.valueOf(2));
            paramAnonymousMenuItem.add(ShowImageUI.this.getString(R.l.dUM));
          }
        }
      });
    }
    GMTrace.o(1914750107648L, 14266);
  }
  
  private final class a
    extends BaseAdapter
  {
    String imagePath;
    
    private a()
    {
      GMTrace.i(1991522648064L, 14838);
      GMTrace.o(1991522648064L, 14838);
    }
    
    public final int getCount()
    {
      GMTrace.i(1991656865792L, 14839);
      GMTrace.o(1991656865792L, 14839);
      return 1;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(1991791083520L, 14840);
      GMTrace.o(1991791083520L, 14840);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(1991925301248L, 14841);
      long l = paramInt;
      GMTrace.o(1991925301248L, 14841);
      return l;
    }
    
    public final View getView(int paramInt, final View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(1992059518976L, 14842);
      if (o.RH(this.imagePath))
      {
        localObject = paramViewGroup.getContext();
        paramViewGroup = this.imagePath;
        new com.tencent.mm.plugin.gif.e(paramViewGroup);
        if ((paramView == null) || (!(paramView instanceof MMAnimateView))) {}
        for (paramView = new MMAnimateView((Context)localObject);; paramView = (MMAnimateView)paramView)
        {
          paramView.cy(paramViewGroup, paramViewGroup);
          paramView.a(paramViewGroup, new com.tencent.mm.plugin.gif.h()
          {
            public final void invalidate()
            {
              GMTrace.i(1958236651520L, 14590);
              paramView.invalidate();
              GMTrace.o(1958236651520L, 14590);
            }
          });
          if ((paramView.getDrawable() != null) && ((paramView.getDrawable() instanceof c))) {
            ((c)paramView.getDrawable()).stop();
          }
          if ((paramView.getDrawable() != null) && ((paramView.getDrawable() instanceof c))) {
            ((c)paramView.getDrawable()).start();
          }
          GMTrace.o(1992059518976L, 14842);
          return paramView;
        }
      }
      Object localObject = j.nf(this.imagePath);
      if (localObject == null)
      {
        w.w("MicroMsg.ShowImageUI", "get image fail");
        if (paramView != null)
        {
          localObject = paramView;
          if (!(paramView instanceof MultiTouchImageView)) {}
        }
        else
        {
          localObject = View.inflate(paramViewGroup.getContext(), R.i.cGD, null);
        }
        ((ImageView)((View)localObject).findViewById(R.h.bGN)).setImageResource(R.k.cLY);
        ((View)localObject).setLayoutParams(new Gallery.LayoutParams(-1, -1));
        GMTrace.o(1992059518976L, 14842);
        return (View)localObject;
      }
      paramViewGroup = paramViewGroup.getContext();
      if ((paramView == null) || (!(paramView instanceof MultiTouchImageView))) {
        paramView = new MultiTouchImageView(paramViewGroup, ((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
      }
      for (;;)
      {
        paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        paramView.setImageBitmap((Bitmap)localObject);
        paramView.wgM = true;
        GMTrace.o(1992059518976L, 14842);
        return paramView;
        paramView = (MultiTouchImageView)paramView;
        paramView.eo(((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\ShowImageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */