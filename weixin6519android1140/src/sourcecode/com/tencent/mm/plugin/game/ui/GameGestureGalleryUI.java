package com.tencent.mm.plugin.game.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.game.model.ak;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMGallery;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.g;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.MMGestureGallery;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameGestureGalleryUI
  extends MMActivity
  implements View.OnTouchListener, j.a
{
  private a lYb;
  private MMGallery lYc;
  private MMGestureGallery lYd;
  float lYe;
  float lYf;
  boolean lYg;
  float lYh;
  private com.tencent.mm.y.w lYi;
  private List<String> lYj;
  private int lYk;
  private AdapterView.OnItemSelectedListener lYl;
  private String thumbUrl;
  
  public GameGestureGalleryUI()
  {
    GMTrace.i(12777796141056L, 95202);
    this.lYe = 0.0F;
    this.lYf = 0.0F;
    this.lYg = false;
    this.lYh = 1.0F;
    this.lYj = new ArrayList();
    this.lYk = -1;
    this.lYl = new AdapterView.OnItemSelectedListener()
    {
      public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(12750415724544L, 94998);
        GameGestureGalleryUI.a(GameGestureGalleryUI.this, paramAnonymousInt);
        GameGestureGalleryUI.this.sq(GameGestureGalleryUI.a(GameGestureGalleryUI.this) + 1 + " / " + GameGestureGalleryUI.b(GameGestureGalleryUI.this).size());
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GameGestureGalleryUI", "pos:" + paramAnonymousInt);
        GMTrace.o(12750415724544L, 94998);
      }
      
      public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
      {
        GMTrace.i(12750549942272L, 94999);
        GMTrace.o(12750549942272L, 94999);
      }
    };
    GMTrace.o(12777796141056L, 95202);
  }
  
  protected final void MP()
  {
    GMTrace.i(12778601447424L, 95208);
    this.thumbUrl = getIntent().getStringExtra("thumbUrl");
    String str = bg.nl(getIntent().getStringExtra("nowUrl"));
    this.vKB.bXF();
    String[] arrayOfString = getIntent().getStringArrayExtra("urlList");
    int i;
    if ((arrayOfString == null) || (arrayOfString.length == 0))
    {
      this.lYj = new ArrayList();
      this.lYj.add(str);
      i = 0;
    }
    for (;;)
    {
      if (i < this.lYj.size())
      {
        if (str.equals(this.lYj.get(i))) {
          this.lYk = i;
        }
      }
      else
      {
        a(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(12726927622144L, 94823);
            GameGestureGalleryUI.this.finish();
            GMTrace.o(12726927622144L, 94823);
            return true;
          }
        });
        this.lYb = new a();
        if (!g.bZs()) {
          break label247;
        }
        this.lYd = ((MMGestureGallery)findViewById(R.h.bCs));
        this.lYd.setVisibility(0);
        this.lYd.setVerticalFadingEdgeEnabled(false);
        this.lYd.setHorizontalFadingEdgeEnabled(false);
        this.lYd.setAdapter(this.lYb);
        this.lYd.setSelection(this.lYk);
        this.lYd.setOnItemSelectedListener(this.lYl);
        GMTrace.o(12778601447424L, 95208);
        return;
        this.lYj = Arrays.asList(arrayOfString);
        break;
      }
      i += 1;
    }
    label247:
    this.lYc = ((MMGallery)findViewById(R.h.bCt));
    this.lYc.setVisibility(0);
    this.lYc.setAdapter(this.lYb);
    this.lYc.setSelection(this.lYk);
    this.lYc.setOnItemSelectedListener(this.lYl);
    GMTrace.o(12778601447424L, 95208);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12778467229696L, 95207);
    int i = R.i.cEr;
    GMTrace.o(12778467229696L, 95207);
    return i;
  }
  
  public final void k(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(12778869882880L, 95210);
    if ((this.lYj == null) || (this.lYj.size() == 0))
    {
      GMTrace.o(12778869882880L, 95210);
      return;
    }
    paramBitmap = (String)this.lYj.get(0);
    if ((paramBitmap.hashCode().equals(paramString)) && (this.lYb != null)) {
      this.lYb.notifyDataSetChanged();
    }
    GMTrace.o(12778869882880L, 95210);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12777930358784L, 95203);
    super.onCreate(paramBundle);
    this.lYi = new com.tencent.mm.y.w(false);
    j.a(this);
    MP();
    GMTrace.o(12777930358784L, 95203);
  }
  
  public void onDestroy()
  {
    GMTrace.i(12778064576512L, 95204);
    super.onDestroy();
    this.lYi.Ax();
    GMTrace.o(12778064576512L, 95204);
  }
  
  public void onPause()
  {
    GMTrace.i(12778198794240L, 95205);
    super.onPause();
    GMTrace.o(12778198794240L, 95205);
  }
  
  public void onResume()
  {
    GMTrace.i(12778333011968L, 95206);
    super.onResume();
    GMTrace.o(12778333011968L, 95206);
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(12778735665152L, 95209);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GameGestureGalleryUI", "Main onTouch event.getAction():" + paramMotionEvent.getAction());
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    }
    for (;;)
    {
      GMTrace.o(12778735665152L, 95209);
      return false;
      this.lYe = g.G(paramMotionEvent);
      if (this.lYe > 5.0F)
      {
        this.lYg = true;
        continue;
        if (this.lYg)
        {
          this.lYf = g.G(paramMotionEvent);
          if (this.lYf >= 5.0F)
          {
            float f = this.lYf - this.lYe;
            if (f != 0.0F)
            {
              if (Math.abs(f) > 5.0F)
              {
                f /= 854.0F;
                paramView = new ScaleAnimation(this.lYh, this.lYh + f, this.lYh, this.lYh + f, 1, 0.5F, 1, 0.5F);
                paramView.setDuration(100L);
                paramView.setFillAfter(true);
                paramView.setFillEnabled(true);
                this.lYh += f;
                this.lYc.getSelectedView().setLayoutParams(new Gallery.LayoutParams((int)(480.0F * this.lYh), (int)(854.0F * this.lYh)));
                this.lYe = this.lYf;
              }
              GMTrace.o(12778735665152L, 95209);
              return true;
              this.lYg = false;
            }
          }
        }
      }
    }
  }
  
  final class a
    extends BaseAdapter
  {
    public a()
    {
      GMTrace.i(12676193320960L, 94445);
      GMTrace.o(12676193320960L, 94445);
    }
    
    public final int getCount()
    {
      GMTrace.i(12676327538688L, 94446);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GameGestureGalleryUI", "lstpicurl:" + GameGestureGalleryUI.b(GameGestureGalleryUI.this).size());
      int i = GameGestureGalleryUI.b(GameGestureGalleryUI.this).size();
      GMTrace.o(12676327538688L, 94446);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(12676461756416L, 94447);
      GMTrace.o(12676461756416L, 94447);
      return Integer.valueOf(paramInt);
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(12676595974144L, 94448);
      long l = paramInt;
      GMTrace.o(12676595974144L, 94448);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(12676730191872L, 94449);
      if (paramView == null)
      {
        paramViewGroup = new a();
        paramView = View.inflate(GameGestureGalleryUI.this, R.i.czP, null);
        paramViewGroup.lYn = ((ProgressBar)paramView.findViewById(R.h.bUy));
        paramViewGroup.eKZ = ((ImageView)paramView.findViewById(R.h.image));
        paramView.setTag(paramViewGroup);
      }
      Bitmap localBitmap;
      for (;;)
      {
        paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        paramViewGroup.lYn.setVisibility(8);
        localBitmap = j.a(new ak((String)GameGestureGalleryUI.b(GameGestureGalleryUI.this).get(paramInt)));
        if ((localBitmap == null) || (localBitmap.isRecycled())) {
          break label243;
        }
        if (!g.bZs()) {
          break;
        }
        paramViewGroup.eKZ.setVisibility(8);
        paramView = new MultiTouchImageView(GameGestureGalleryUI.this, localBitmap.getWidth(), localBitmap.getHeight());
        paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        paramView.setImageBitmap(localBitmap);
        GMTrace.o(12676730191872L, 94449);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
      }
      paramViewGroup.eKZ.setImageBitmap(localBitmap);
      paramViewGroup.eKZ.setVisibility(0);
      paramViewGroup.eKZ.setScaleType(ImageView.ScaleType.MATRIX);
      for (;;)
      {
        GMTrace.o(12676730191872L, 94449);
        return paramView;
        label243:
        paramViewGroup.lYn.setVisibility(0);
        if (!bg.nm(GameGestureGalleryUI.c(GameGestureGalleryUI.this))) {
          localBitmap = j.a(new ak(GameGestureGalleryUI.c(GameGestureGalleryUI.this)));
        }
        if ((localBitmap == null) || (localBitmap.isRecycled()))
        {
          paramViewGroup.eKZ.setVisibility(8);
        }
        else
        {
          paramViewGroup.eKZ.setImageBitmap(localBitmap);
          paramViewGroup.eKZ.setVisibility(0);
        }
      }
    }
    
    final class a
    {
      ImageView eKZ;
      ProgressBar lYn;
      
      a()
      {
        GMTrace.i(12727061839872L, 94824);
        GMTrace.o(12727061839872L, 94824);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameGestureGalleryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */