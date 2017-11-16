package com.tencent.mm.plugin.gallery.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.plugin.gallery.model.GalleryItem.AlbumItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.c;
import com.tencent.mm.plugin.gallery.model.e;
import com.tencent.mm.plugin.gallery.model.g.a;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;

public class ImageFolderMgrView
  extends LinearLayout
  implements AdapterView.OnItemClickListener, g.a
{
  boolean Ne;
  a lDQ;
  FrameLayout lDR;
  private View lDS;
  private ListView lDT;
  private b lDU;
  boolean lDV;
  
  public ImageFolderMgrView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11943632961536L, 88987);
    this.lDQ = null;
    this.Ne = false;
    this.lDV = false;
    setOrientation(1);
    this.lDR = new FrameLayout(getContext());
    paramContext = new LinearLayout.LayoutParams(-1, -1);
    this.lDR.setVisibility(8);
    addView(this.lDR, paramContext);
    this.lDS = new View(getContext());
    this.lDS.setBackgroundColor(-872415232);
    this.lDS.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11956517863424L, 89083);
        ImageFolderMgrView.c(ImageFolderMgrView.this);
        GMTrace.o(11956517863424L, 89083);
      }
    });
    paramContext = new FrameLayout.LayoutParams(-1, -1);
    this.lDR.addView(this.lDS, paramContext);
    this.lDT = new ListView(getContext());
    this.lDT.setCacheColorHint(0);
    this.lDT.setBackgroundResource(R.e.aOz);
    this.lDT.setSelector(R.g.aXW);
    this.lDT.setOnItemClickListener(this);
    int i = getResources().getDimensionPixelSize(R.f.aQE);
    this.lDT.setPadding(i, i / 3, i, i * 2 / 3);
    paramContext = new FrameLayout.LayoutParams(-1, -2);
    paramContext.topMargin = getResources().getDimensionPixelSize(R.f.aPN);
    paramContext.gravity = 80;
    this.lDR.addView(this.lDT, paramContext);
    this.lDU = new b(getContext(), c.aCL().aDp());
    this.lDT.setAdapter(this.lDU);
    GMTrace.o(11943632961536L, 88987);
  }
  
  private void eM(boolean paramBoolean)
  {
    GMTrace.i(15618782789632L, 116369);
    if (this.Ne == paramBoolean)
    {
      w.d("MicroMsg.ImageFolderMgrView", "want to expand, but same status, expanded %B", new Object[] { Boolean.valueOf(this.Ne) });
      GMTrace.o(15618782789632L, 116369);
      return;
    }
    if (this.lDV)
    {
      w.d("MicroMsg.ImageFolderMgrView", "want to expand[%B], but now in animation", new Object[] { Boolean.valueOf(paramBoolean) });
      GMTrace.o(15618782789632L, 116369);
      return;
    }
    if (this.Ne)
    {
      this.lDV = true;
      localAnimation = AnimationUtils.loadAnimation(getContext(), R.a.aLE);
      localAnimation.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(11942693437440L, 88980);
          ImageFolderMgrView.a(ImageFolderMgrView.this).setVisibility(8);
          ImageFolderMgrView.a(ImageFolderMgrView.this, false);
          ImageFolderMgrView.b(ImageFolderMgrView.this);
          GMTrace.o(11942693437440L, 88980);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(11942559219712L, 88979);
          GMTrace.o(11942559219712L, 88979);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(11942425001984L, 88978);
          GMTrace.o(11942425001984L, 88978);
        }
      });
      this.lDT.startAnimation(localAnimation);
      localAnimation = AnimationUtils.loadAnimation(getContext(), R.a.aLt);
      this.lDS.startAnimation(localAnimation);
      GMTrace.o(15618782789632L, 116369);
      return;
    }
    this.lDV = true;
    this.lDR.setVisibility(0);
    Animation localAnimation = AnimationUtils.loadAnimation(getContext(), R.a.aLs);
    this.lDS.startAnimation(localAnimation);
    localAnimation = AnimationUtils.loadAnimation(getContext(), R.a.aLG);
    localAnimation.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(11940545953792L, 88964);
        ImageFolderMgrView.a(ImageFolderMgrView.this, true);
        ImageFolderMgrView.b(ImageFolderMgrView.this);
        GMTrace.o(11940545953792L, 88964);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(11940411736064L, 88963);
        GMTrace.o(11940411736064L, 88963);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(11940277518336L, 88962);
        GMTrace.o(11940277518336L, 88962);
      }
    });
    this.lDT.startAnimation(localAnimation);
    GMTrace.o(15618782789632L, 116369);
  }
  
  public final void A(ArrayList<GalleryItem.AlbumItem> paramArrayList)
  {
    GMTrace.i(11944035614720L, 88990);
    b localb = this.lDU;
    localb.lDx = paramArrayList;
    if ((localb.lDx != null) && (!localb.lDx.isEmpty()) && (((GalleryItem.AlbumItem)localb.lDx.get(0)).lBB != null))
    {
      Iterator localIterator = localb.lDx.iterator();
      paramArrayList = null;
      while (localIterator.hasNext())
      {
        GalleryItem.AlbumItem localAlbumItem = (GalleryItem.AlbumItem)localIterator.next();
        if (paramArrayList == null)
        {
          paramArrayList = localAlbumItem;
        }
        else
        {
          if (paramArrayList.lBB.lBF >= localAlbumItem.lBB.lBF) {
            break label156;
          }
          paramArrayList = localAlbumItem;
        }
      }
    }
    label156:
    for (;;)
    {
      break;
      if (paramArrayList != null) {
        localb.lDy.lBB = paramArrayList.lBB;
      }
      c.aCM().t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11921889689600L, 88825);
          ImageFolderMgrView.d(ImageFolderMgrView.this).notifyDataSetChanged();
          GMTrace.o(11921889689600L, 88825);
        }
        
        public final String toString()
        {
          GMTrace.i(11922023907328L, 88826);
          String str = super.toString() + "|onQueryAlbumFinished";
          GMTrace.o(11922023907328L, 88826);
          return str;
        }
      });
      GMTrace.o(11944035614720L, 88990);
      return;
    }
  }
  
  public final void aDy()
  {
    GMTrace.i(15618648571904L, 116368);
    if (!this.Ne) {}
    for (boolean bool = true;; bool = false)
    {
      eM(bool);
      GMTrace.o(15618648571904L, 116368);
      return;
    }
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(11944169832448L, 88991);
    paramAdapterView = this.lDU.or(paramInt);
    if (paramAdapterView == null)
    {
      w.d("MicroMsg.ImageFolderMgrView", "get folder failed:" + paramInt);
      GMTrace.o(11944169832448L, 88991);
      return;
    }
    if (this.lDQ != null) {
      this.lDQ.b(paramAdapterView);
    }
    this.lDU.lDz = bg.aq(paramAdapterView.lBA, "");
    this.lDT.setSelection(0);
    this.lDU.notifyDataSetChanged();
    this.lDS.performClick();
    GMTrace.o(11944169832448L, 88991);
  }
  
  public static abstract interface a
  {
    public abstract void b(GalleryItem.AlbumItem paramAlbumItem);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\ui\ImageFolderMgrView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */