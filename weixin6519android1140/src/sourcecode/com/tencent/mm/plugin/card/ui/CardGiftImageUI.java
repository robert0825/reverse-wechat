package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.plugin.card.b.a.a;
import com.tencent.mm.plugin.card.model.CardGiftInfo;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.f;
import com.tencent.mm.ui.tools.g;
import com.tencent.mm.ui.tools.g.b;
import com.tencent.mm.ui.tools.l;

@com.tencent.mm.ui.base.a(3)
public class CardGiftImageUI
  extends MMActivity
  implements a.a
{
  private String eMk;
  private l iok;
  private CardGiftInfo jFE;
  private ImageView jFF;
  private RelativeLayout jFG;
  private MMGestureGallery jFH;
  private ProgressBar jFI;
  private ae jFJ;
  private Bundle jFK;
  private boolean jFL;
  private g jFM;
  private int jFN;
  private int jFO;
  private int jFP;
  private int jFQ;
  private a jFR;
  
  public CardGiftImageUI()
  {
    GMTrace.i(5024977518592L, 37439);
    this.jFJ = new ae(Looper.getMainLooper());
    this.jFL = false;
    this.jFN = 0;
    this.jFO = 0;
    this.jFP = 0;
    this.jFQ = 0;
    GMTrace.o(5024977518592L, 37439);
  }
  
  protected final void MP()
  {
    GMTrace.i(5025245954048L, 37441);
    this.jFF = ((ImageView)findViewById(R.h.bCu));
    this.jFF.setLayerType(2, null);
    this.jFI = ((ProgressBar)findViewById(R.h.bGS));
    this.jFG = ((RelativeLayout)findViewById(R.h.bGZ));
    this.jFH = ((MMGestureGallery)findViewById(R.h.bCs));
    this.jFH.setVerticalFadingEdgeEnabled(false);
    this.jFH.setHorizontalFadingEdgeEnabled(false);
    this.jFR = new a((byte)0);
    this.jFH.setAdapter(this.jFR);
    this.jFH.xhF = new MMGestureGallery.f()
    {
      public final void alM()
      {
        GMTrace.i(4975048523776L, 37067);
        CardGiftImageUI.this.alL();
        GMTrace.o(4975048523776L, 37067);
      }
    };
    this.jFH.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(4988738732032L, 37169);
        h.a(CardGiftImageUI.this, CardGiftImageUI.a(CardGiftImageUI.this).bpI());
        GMTrace.o(4988738732032L, 37169);
        return true;
      }
    });
    this.jFM = new g(this);
    GMTrace.o(5025245954048L, 37441);
  }
  
  public final void aH(String paramString, int paramInt)
  {
    GMTrace.i(5026319695872L, 37449);
    this.jFJ.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5007529213952L, 37309);
        if (CardGiftImageUI.f(CardGiftImageUI.this).getVisibility() != 0) {
          CardGiftImageUI.f(CardGiftImageUI.this).setVisibility(0);
        }
        GMTrace.o(5007529213952L, 37309);
      }
    });
    GMTrace.o(5026319695872L, 37449);
  }
  
  public final void alL()
  {
    GMTrace.i(5026051260416L, 37447);
    this.jFM.p(this.jFO, this.jFN, this.jFP, this.jFQ);
    this.jFM.a(this.jFG, this.jFF, new g.b()
    {
      public final void onAnimationEnd()
      {
        GMTrace.i(4986054377472L, 37149);
        new ae().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(4974511652864L, 37063);
            CardGiftImageUI.this.finish();
            CardGiftImageUI.this.overridePendingTransition(0, 0);
            GMTrace.o(4974511652864L, 37063);
          }
        });
        GMTrace.o(4986054377472L, 37149);
      }
      
      public final void onAnimationStart()
      {
        GMTrace.i(4985920159744L, 37148);
        GMTrace.o(4985920159744L, 37148);
      }
    }, null);
    GMTrace.o(5026051260416L, 37447);
  }
  
  public final void bF(String paramString1, final String paramString2)
  {
    GMTrace.i(5026453913600L, 37450);
    this.jFJ.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4929682931712L, 36729);
        if (CardGiftImageUI.f(CardGiftImageUI.this).getVisibility() != 8) {
          CardGiftImageUI.f(CardGiftImageUI.this).setVisibility(8);
        }
        CardGiftImageUI.a(CardGiftImageUI.this, paramString2);
        CardGiftImageUI.g(CardGiftImageUI.this);
        CardGiftImageUI.h(CardGiftImageUI.this).notifyDataSetChanged();
        GMTrace.o(4929682931712L, 36729);
      }
    });
    GMTrace.o(5026453913600L, 37450);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(5025917042688L, 37446);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.CardGiftImageUI", "dispatchKeyEvent");
      alL();
      GMTrace.o(5025917042688L, 37446);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(5025917042688L, 37446);
    return bool;
  }
  
  public final void fail(String paramString)
  {
    GMTrace.i(17261070909440L, 128605);
    GMTrace.o(17261070909440L, 128605);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5026185478144L, 37448);
    int i = R.i.cqY;
    GMTrace.o(5026185478144L, 37448);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5025111736320L, 37440);
    if (getIntent().getExtras() != null) {
      getIntent().getExtras().setClassLoader(getClass().getClassLoader());
    }
    super.onCreate(paramBundle);
    this.vKB.bXF();
    this.jFK = paramBundle;
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(1024, 1024);
    }
    this.jFE = ((CardGiftInfo)getIntent().getParcelableExtra("key_gift_into"));
    if (this.jFE == null) {}
    for (paramBundle = "null";; paramBundle = this.jFE.toString())
    {
      w.d("MicroMsg.CardGiftImageUI", "cardGiftInfo:%s", new Object[] { paramBundle });
      w.i("MicroMsg.CardGiftImageUI", "imgPath:%s", new Object[] { this.eMk });
      MP();
      com.tencent.mm.plugin.card.b.a.a(this);
      if ((this.jFE == null) || (bg.nm(this.jFE.jya))) {
        break;
      }
      com.tencent.mm.plugin.card.b.a.f(this.jFE.jya, this.jFE.jyd, this.jFE.jym, 2);
      GMTrace.o(5025111736320L, 37440);
      return;
    }
    w.e("MicroMsg.CardGiftImageUI", "fromUserContentPicUrl is null");
    GMTrace.o(5025111736320L, 37440);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5025782824960L, 37445);
    super.onDestroy();
    com.tencent.mm.plugin.card.b.a.b(this);
    GMTrace.o(5025782824960L, 37445);
  }
  
  protected void onPause()
  {
    GMTrace.i(5025648607232L, 37444);
    super.onPause();
    GMTrace.o(5025648607232L, 37444);
  }
  
  protected void onResume()
  {
    GMTrace.i(5025514389504L, 37443);
    super.onResume();
    if (this.jFR != null) {
      this.jFR.notifyDataSetChanged();
    }
    GMTrace.o(5025514389504L, 37443);
  }
  
  public void onStart()
  {
    GMTrace.i(5025380171776L, 37442);
    Bundle localBundle = this.jFK;
    if (!this.jFL)
    {
      this.jFL = true;
      if (Build.VERSION.SDK_INT >= 12) {
        break label70;
      }
      w.e("MicroMsg.CardGiftImageUI", "version is %d, no animation", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
    }
    for (;;)
    {
      super.onStart();
      GMTrace.o(5025380171776L, 37442);
      return;
      label70:
      this.jFN = getIntent().getIntExtra("img_top", 0);
      this.jFO = getIntent().getIntExtra("img_left", 0);
      this.jFP = getIntent().getIntExtra("img_width", 0);
      this.jFQ = getIntent().getIntExtra("img_height", 0);
      this.jFM.p(this.jFO, this.jFN, this.jFP, this.jFQ);
      if (localBundle == null) {
        this.jFG.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
        {
          public final boolean onPreDraw()
          {
            GMTrace.i(4939078172672L, 36799);
            CardGiftImageUI.c(CardGiftImageUI.this).getViewTreeObserver().removeOnPreDrawListener(this);
            CardGiftImageUI.e(CardGiftImageUI.this).a(CardGiftImageUI.c(CardGiftImageUI.this), CardGiftImageUI.d(CardGiftImageUI.this), null);
            GMTrace.o(4939078172672L, 36799);
            return true;
          }
        });
      }
    }
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(4959210831872L, 36949);
      GMTrace.o(4959210831872L, 36949);
    }
    
    public final int getCount()
    {
      GMTrace.i(4959345049600L, 36950);
      GMTrace.o(4959345049600L, 36950);
      return 1;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(4959479267328L, 36951);
      GMTrace.o(4959479267328L, 36951);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(4959613485056L, 36952);
      long l = paramInt;
      GMTrace.o(4959613485056L, 36952);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(4959747702784L, 36953);
      Object localObject = j.nf(CardGiftImageUI.b(CardGiftImageUI.this));
      if (localObject == null)
      {
        w.w("MicroMsg.CardGiftImageUI", "get image fail");
        if (paramView != null)
        {
          localObject = paramView;
          if (!(paramView instanceof MultiTouchImageView)) {}
        }
        else
        {
          localObject = View.inflate(paramViewGroup.getContext(), R.i.cGD, null);
          ((ImageView)((View)localObject).findViewById(R.h.bGN)).setImageResource(R.k.cLY);
          ((View)localObject).setLayoutParams(new Gallery.LayoutParams(-1, -1));
        }
        GMTrace.o(4959747702784L, 36953);
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
        GMTrace.o(4959747702784L, 36953);
        return paramView;
        paramView = (MultiTouchImageView)paramView;
        paramView.eo(((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\CardGiftImageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */