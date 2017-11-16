package com.tencent.mm.ui.chatting.gallery;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.k;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.n;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.chatting.c.a.a;
import com.tencent.mm.ui.chatting.c.a.b;
import com.tencent.mm.ui.p;

public class MediaHistoryGalleryUI
  extends MMActivity
  implements View.OnClickListener, a.b
{
  private RecyclerView Ub;
  private String iGc;
  private TextView jQZ;
  private ProgressDialog rxx;
  private long wHM;
  private View wLA;
  private View wLB;
  private View wLC;
  private boolean wLu;
  private View wLx;
  private View wLz;
  private a.a wOe;
  private TextView wOf;
  private boolean wOg;
  private boolean wOh;
  private int wOi;
  private boolean wOj;
  private int wOk;
  
  public MediaHistoryGalleryUI()
  {
    GMTrace.i(14959236874240L, 111455);
    this.wLu = false;
    this.wOi = -1;
    GMTrace.o(14959236874240L, 111455);
  }
  
  private void DA(int paramInt)
  {
    GMTrace.i(14961115922432L, 111469);
    if ((this.wOe.ceS()) && (paramInt > 0))
    {
      this.wLz.setEnabled(true);
      this.wLA.setEnabled(true);
      this.wLB.setEnabled(true);
      this.wLC.setEnabled(true);
      GMTrace.o(14961115922432L, 111469);
      return;
    }
    this.wLz.setEnabled(false);
    this.wLA.setEnabled(false);
    this.wLB.setEnabled(false);
    this.wLC.setEnabled(false);
    GMTrace.o(14961115922432L, 111469);
  }
  
  private void m(boolean paramBoolean, String paramString)
  {
    GMTrace.i(18823499481088L, 140246);
    w.i("MicroMsg.MediaHistoryGalleryUI", "[setProgress] isVisible:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      String str = paramString;
      if (paramString == null) {
        str = getString(R.l.bKJ);
      }
      this.rxx = r.b(this, str, true, 0, null);
      GMTrace.o(18823499481088L, 140246);
      return;
    }
    if ((this.rxx != null) && (this.rxx.isShowing()))
    {
      this.rxx.dismiss();
      this.rxx = null;
    }
    GMTrace.o(18823499481088L, 140246);
  }
  
  public final void CZ(int paramInt)
  {
    GMTrace.i(14960579051520L, 111465);
    sq(getString(R.l.dzp, new Object[] { Integer.valueOf(paramInt) }));
    DA(paramInt);
    GMTrace.o(14960579051520L, 111465);
  }
  
  public final void Da(int paramInt)
  {
    GMTrace.i(18823231045632L, 140244);
    ceR();
    m(false, "");
    int i = paramInt;
    if (paramInt == 0) {
      i = R.l.dzn;
    }
    if (this.wOj) {
      h.a(this, i, R.l.cUG, true, null);
    }
    this.wOj = false;
    GMTrace.o(18823231045632L, 140244);
  }
  
  protected final void MP()
  {
    GMTrace.i(14959773745152L, 111459);
    super.MP();
    this.wLx = findViewById(R.h.bOo);
    this.wLA = findViewById(R.h.cik);
    this.wLC = findViewById(R.h.aVV);
    this.wLB = findViewById(R.h.bZo);
    this.wLz = findViewById(R.h.byy);
    this.wLz.setTag(Integer.valueOf(1));
    this.wLA.setTag(Integer.valueOf(0));
    this.wLB.setTag(Integer.valueOf(3));
    this.wLC.setTag(Integer.valueOf(2));
    this.wLz.setOnClickListener(this);
    this.wLA.setOnClickListener(this);
    this.wLB.setOnClickListener(this);
    this.wLC.setOnClickListener(this);
    this.wOf = ((TextView)findViewById(R.h.bdJ));
    this.jQZ = ((TextView)findViewById(R.h.caE));
    this.Ub = ((RecyclerView)findViewById(R.h.bGh));
    this.Ub.setBackgroundColor(getResources().getColor(R.e.aMI));
    findViewById(R.h.brS).setBackgroundColor(getResources().getColor(R.e.aMI));
    this.Ub.a(this.wOe.fv(this));
    this.Ub.a(this.wOe.fw(this));
    this.Ub.a(this.wOe.an(this.iGc, this.wHM));
    this.Ub.Tc = true;
    this.Ub.TD = new RecyclerView.k()
    {
      public final void c(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(14964471365632L, 111494);
        super.c(paramAnonymousRecyclerView, paramAnonymousInt1, paramAnonymousInt2);
        GMTrace.o(14964471365632L, 111494);
      }
    };
    this.Ub.a(new RecyclerView.k()
    {
      private Runnable lDp;
      
      private void eL(boolean paramAnonymousBoolean)
      {
        GMTrace.i(14962323881984L, 111478);
        if (paramAnonymousBoolean)
        {
          MediaHistoryGalleryUI.a(MediaHistoryGalleryUI.this).removeCallbacks(this.lDp);
          if (MediaHistoryGalleryUI.a(MediaHistoryGalleryUI.this).getVisibility() != 0)
          {
            MediaHistoryGalleryUI.a(MediaHistoryGalleryUI.this).clearAnimation();
            Animation localAnimation = AnimationUtils.loadAnimation(MediaHistoryGalleryUI.this.vKB.vKW, R.a.aLs);
            MediaHistoryGalleryUI.a(MediaHistoryGalleryUI.this).setVisibility(0);
            MediaHistoryGalleryUI.a(MediaHistoryGalleryUI.this).startAnimation(localAnimation);
            GMTrace.o(14962323881984L, 111478);
          }
        }
        else
        {
          MediaHistoryGalleryUI.a(MediaHistoryGalleryUI.this).removeCallbacks(this.lDp);
          MediaHistoryGalleryUI.a(MediaHistoryGalleryUI.this).postDelayed(this.lDp, 256L);
        }
        GMTrace.o(14962323881984L, 111478);
      }
      
      public final void c(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(14962458099712L, 111479);
        super.c(paramAnonymousRecyclerView, paramAnonymousInt1, paramAnonymousInt2);
        Object localObject = (LinearLayoutManager)MediaHistoryGalleryUI.b(MediaHistoryGalleryUI.this).fv(MediaHistoryGalleryUI.this);
        paramAnonymousRecyclerView = (com.tencent.mm.ui.chatting.a.a)MediaHistoryGalleryUI.b(MediaHistoryGalleryUI.this).ceO();
        localObject = paramAnonymousRecyclerView.CU(((LinearLayoutManager)localObject).eZ());
        if (localObject == null)
        {
          GMTrace.o(14962458099712L, 111479);
          return;
        }
        paramAnonymousRecyclerView = paramAnonymousRecyclerView.fc(((com.tencent.mm.ui.chatting.a.a.c)localObject).gVB);
        MediaHistoryGalleryUI.a(MediaHistoryGalleryUI.this).setText(bg.aq(paramAnonymousRecyclerView, ""));
        GMTrace.o(14962458099712L, 111479);
      }
      
      public final void e(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt)
      {
        GMTrace.i(14962592317440L, 111480);
        if (1 == paramAnonymousInt) {
          eL(true);
        }
        for (;;)
        {
          if ((paramAnonymousRecyclerView.SW instanceof LinearLayoutManager))
          {
            if (((LinearLayoutManager)paramAnonymousRecyclerView.SW).eZ() == 0) {
              MediaHistoryGalleryUI.b(MediaHistoryGalleryUI.this).u(false, -1);
            }
            n.Jd().bi(paramAnonymousInt);
          }
          GMTrace.o(14962592317440L, 111480);
          return;
          if (paramAnonymousInt == 0) {
            eL(false);
          }
        }
      }
    });
    sq(this.wOe.Qb());
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(14965276672000L, 111500);
        MediaHistoryGalleryUI.this.finish();
        GMTrace.o(14965276672000L, 111500);
        return true;
      }
    });
    GMTrace.o(14959773745152L, 111459);
  }
  
  public final void ceQ()
  {
    GMTrace.i(14960847486976L, 111467);
    this.wOe.ceQ();
    sq(getString(R.l.dzp, new Object[] { Integer.valueOf(this.wOe.ceP()) }));
    this.wLx.setVisibility(0);
    this.wLx.startAnimation(AnimationUtils.loadAnimation(this, R.a.aLG));
    DA(this.wOe.ceP());
    AZ(0);
    a(0, getString(R.l.dyK), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(14958565785600L, 111450);
        MediaHistoryGalleryUI.this.ceR();
        GMTrace.o(14958565785600L, 111450);
        return true;
      }
    });
    GMTrace.o(14960847486976L, 111467);
  }
  
  public final void ceR()
  {
    GMTrace.i(14960981704704L, 111468);
    this.wOe.ceR();
    sq(this.wOe.Qb());
    this.wLx.setVisibility(8);
    this.wLx.startAnimation(AnimationUtils.loadAnimation(this, R.a.aLE));
    AZ(0);
    a(0, getString(R.l.dyL), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(14964202930176L, 111492);
        MediaHistoryGalleryUI.this.ceQ();
        GMTrace.o(14964202930176L, 111492);
        return true;
      }
    });
    GMTrace.o(14960981704704L, 111468);
  }
  
  public final void ceT()
  {
    GMTrace.i(18822962610176L, 140242);
    ceR();
    this.wOj = false;
    m(false, "");
    GMTrace.o(18822962610176L, 140242);
  }
  
  public final void ceU()
  {
    GMTrace.i(18822828392448L, 140241);
    this.wOj = true;
    m(true, getString(R.l.dCS));
    GMTrace.o(18822828392448L, 140241);
  }
  
  public final void ceV()
  {
    GMTrace.i(18823096827904L, 140243);
    ceR();
    this.wOj = false;
    m(false, "");
    String str = com.tencent.mm.compatible.util.e.fRZ.substring(com.tencent.mm.compatible.util.e.fRZ.indexOf("tencent/MicroMsg"));
    Toast.makeText(this, getString(R.l.dgZ, new Object[] { str }), 1).show();
    GMTrace.o(18823096827904L, 140243);
  }
  
  public final boolean ceW()
  {
    GMTrace.i(18823365263360L, 140245);
    boolean bool = this.wOj;
    GMTrace.o(18823365263360L, 140245);
    return bool;
  }
  
  public final View getChildAt(int paramInt)
  {
    GMTrace.i(14960444833792L, 111464);
    View localView = this.Ub.getChildAt(paramInt);
    GMTrace.o(14960444833792L, 111464);
    return localView;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(14960042180608L, 111461);
    int i = R.i.cBq;
    GMTrace.o(14960042180608L, 111461);
    return i;
  }
  
  public final void mj(boolean paramBoolean)
  {
    GMTrace.i(14960176398336L, 111462);
    if (paramBoolean)
    {
      m(true, null);
      GMTrace.o(14960176398336L, 111462);
      return;
    }
    this.wOk = ((GridLayoutManager)this.Ub.SW).fa();
    GMTrace.o(14960176398336L, 111462);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(18822694174720L, 140240);
    super.onBackPressed();
    w.i("MicroMsg.MediaHistoryGalleryUI", "[onBackPressed] ");
    if (this.wOj)
    {
      this.wOe.ceT();
      GMTrace.o(18822694174720L, 140240);
      return;
    }
    finish();
    GMTrace.o(18822694174720L, 140240);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(14960713269248L, 111466);
    this.wOe.CY(((Integer)paramView.getTag()).intValue());
    GMTrace.o(14960713269248L, 111466);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(14959371091968L, 111456);
    super.onCreate(paramBundle);
    this.wLu = true;
    paramBundle = getIntent();
    boolean bool;
    if (paramBundle.getIntExtra("kintent_intent_source", 0) == 1)
    {
      bool = true;
      this.wOg = bool;
      this.iGc = paramBundle.getStringExtra("kintent_talker");
      this.wOi = paramBundle.getIntExtra("kintent_image_index", -1);
      this.wOh = paramBundle.getBooleanExtra("key_is_biz_chat", false);
      this.wHM = getIntent().getLongExtra("key_biz_chat_id", -1L);
      switch (getIntent().getIntExtra("key_media_type", -1))
      {
      }
    }
    for (paramBundle = a.ag(this, com.tencent.mm.ui.chatting.c.a.c.wKn);; paramBundle = a.ag(this, com.tencent.mm.ui.chatting.c.a.c.wKn))
    {
      paramBundle.a(this);
      MP();
      this.wOe.u(true, this.wOi);
      GMTrace.o(14959371091968L, 111456);
      return;
      bool = false;
      break;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(14959639527424L, 111458);
    super.onDestroy();
    this.wOe.onDetach();
    GMTrace.o(14959639527424L, 111458);
  }
  
  protected void onResume()
  {
    GMTrace.i(14959505309696L, 111457);
    super.onResume();
    this.wOe.onResume();
    if (this.wLu)
    {
      if (!this.wOe.ceS()) {
        break label60;
      }
      ceQ();
    }
    for (;;)
    {
      this.wLu = false;
      GMTrace.o(14959505309696L, 111457);
      return;
      label60:
      ceR();
    }
  }
  
  public final void v(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(14960310616064L, 111463);
    w.i("MicroMsg.MediaHistoryGalleryUI", "[onDataLoaded] isFirst:%s addCount:%s mIntentPos:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt), Integer.valueOf(this.wOi) });
    if (paramBoolean)
    {
      m(false, null);
      this.Ub.fl().TS.notifyChanged();
      if (this.wOi != -1) {
        this.Ub.SW.aX(this.wOi);
      }
      while (paramInt <= 0)
      {
        this.jQZ.setVisibility(0);
        this.Ub.setVisibility(8);
        this.jQZ.setText(getString(R.l.dgY));
        GMTrace.o(14960310616064L, 111463);
        return;
        int i = this.Ub.fl().getItemCount();
        this.Ub.SW.aX(i - 1);
      }
      this.jQZ.setVisibility(8);
      this.Ub.setVisibility(0);
      GMTrace.o(14960310616064L, 111463);
      return;
    }
    if (paramInt > 0)
    {
      this.Ub.fl().R(0, paramInt);
      this.Ub.fl().P(paramInt, this.wOk + paramInt);
      GMTrace.o(14960310616064L, 111463);
      return;
    }
    this.Ub.fl().bc(0);
    GMTrace.o(14960310616064L, 111463);
  }
  
  private static final class a
  {
    public static a.a ag(Context paramContext, int paramInt)
    {
      GMTrace.i(14964605583360L, 111495);
      Object localObject = null;
      switch (MediaHistoryGalleryUI.6.wOn[(paramInt - 1)])
      {
      }
      for (paramContext = (Context)localObject;; paramContext = new com.tencent.mm.ui.chatting.d.e(paramContext))
      {
        GMTrace.o(14964605583360L, 111495);
        return paramContext;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\gallery\MediaHistoryGalleryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */