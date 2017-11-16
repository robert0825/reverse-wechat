package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.a.f;
import com.tencent.mm.plugin.game.d.e;
import com.tencent.mm.plugin.game.d.e.a.a;
import com.tencent.mm.plugin.game.d.e.b;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.model.q.h;
import com.tencent.mm.plugin.game.model.r;
import com.tencent.mm.plugin.game.model.r.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.LinkedList;

public class GameMessageListUserIconView
  extends LinearLayout
{
  Context mContext;
  r maf;
  private f<String, Bitmap> mag;
  
  public GameMessageListUserIconView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(12740617830400L, 94925);
    this.mContext = paramContext;
    init();
    GMTrace.o(12740617830400L, 94925);
  }
  
  public GameMessageListUserIconView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12740752048128L, 94926);
    this.mContext = paramContext;
    init();
    GMTrace.o(12740752048128L, 94926);
  }
  
  private void c(ImageView paramImageView, String paramString)
  {
    GMTrace.i(12741423136768L, 94931);
    paramImageView = e.aGQ().h(paramImageView, paramString);
    if (paramImageView != null) {
      this.mag.put(paramString, paramImageView);
    }
    GMTrace.o(12741423136768L, 94931);
  }
  
  private void e(ImageView paramImageView, final String paramString)
  {
    GMTrace.i(12741288919040L, 94930);
    e.a.a locala = new e.a.a();
    locala.gKA = false;
    e.aGQ().a(paramImageView, paramString, locala.aGR(), new e.b()
    {
      public final void x(Bitmap paramAnonymousBitmap)
      {
        GMTrace.i(12727330275328L, 94826);
        if ((paramAnonymousBitmap != null) && (!paramAnonymousBitmap.isRecycled())) {
          GameMessageListUserIconView.a(GameMessageListUserIconView.this).put(paramString, paramAnonymousBitmap);
        }
        GMTrace.o(12727330275328L, 94826);
      }
    });
    GMTrace.o(12741288919040L, 94930);
  }
  
  private void init()
  {
    GMTrace.i(12741020483584L, 94928);
    if (this.maf == null) {
      this.maf = new r(this.mContext);
    }
    GMTrace.o(12741020483584L, 94928);
  }
  
  public final void a(q paramq, LinkedList<q.h> paramLinkedList, f<String, Bitmap> paramf)
  {
    GMTrace.i(12741154701312L, 94929);
    if ((paramq == null) || (bg.cc(paramLinkedList)))
    {
      setVisibility(8);
      GMTrace.o(12741154701312L, 94929);
      return;
    }
    this.mag = paramf;
    setVisibility(0);
    int i = this.mContext.getResources().getDimensionPixelSize(R.f.aQn);
    int j = this.mContext.getResources().getDimensionPixelSize(R.f.aPv);
    paramf = new LinearLayout.LayoutParams(i, i);
    paramf.rightMargin = j;
    Object localObject;
    while (getChildCount() < paramLinkedList.size())
    {
      localObject = new ImageView(this.mContext);
      ((ImageView)localObject).setLayoutParams(paramf);
      ((ImageView)localObject).setScaleType(ImageView.ScaleType.FIT_XY);
      ((ImageView)localObject).setOnClickListener(this.maf);
      addView((View)localObject);
    }
    i = 0;
    if (i < getChildCount())
    {
      paramf = (ImageView)getChildAt(i);
      String str;
      Bitmap localBitmap;
      if (i < paramLinkedList.size())
      {
        paramf.setVisibility(0);
        localObject = (q.h)paramLinkedList.get(i);
        if (!bg.nm(((q.h)localObject).lNK))
        {
          str = ((q.h)localObject).lNK;
          if (this.mag.ba(str))
          {
            localBitmap = (Bitmap)this.mag.get(str);
            if ((localBitmap == null) || (localBitmap.isRecycled()))
            {
              e(paramf, str);
              label259:
              if (bg.nm(((q.h)localObject).lNN)) {
                break label414;
              }
              paramf.setTag(new r.a(paramq, ((q.h)localObject).lNN, 6));
              paramf.setEnabled(true);
            }
          }
        }
      }
      for (;;)
      {
        i += 1;
        break;
        paramf.setImageBitmap(localBitmap);
        break label259;
        e(paramf, str);
        break label259;
        str = ((q.h)localObject).userName;
        if (bg.nm(str))
        {
          a.b.a(paramf, str);
          break label259;
        }
        if (!this.mag.ba(str))
        {
          c(paramf, str);
          break label259;
        }
        localBitmap = (Bitmap)this.mag.get(str);
        if ((localBitmap == null) || (localBitmap.isRecycled()))
        {
          c(paramf, str);
          break label259;
        }
        paramf.setImageBitmap(localBitmap);
        break label259;
        label414:
        paramf.setEnabled(false);
        continue;
        paramf.setVisibility(8);
      }
    }
    GMTrace.o(12741154701312L, 94929);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12740886265856L, 94927);
    super.onFinishInflate();
    init();
    GMTrace.o(12740886265856L, 94927);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameMessageListUserIconView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */