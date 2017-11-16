package com.tencent.mm.ui.chatting.gallery;

import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView<*>;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.a;
import com.tencent.mm.g.a.cf.b;
import com.tencent.mm.g.a.gj;
import com.tencent.mm.g.a.gk;
import com.tencent.mm.g.a.le;
import com.tencent.mm.g.a.nb;
import com.tencent.mm.g.a.nb.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.j;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.ue;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.chatting.a.b;
import com.tencent.mm.ui.chatting.a.c;
import com.tencent.mm.ui.chatting.a.d;
import com.tencent.mm.ui.chatting.ab;
import com.tencent.mm.ui.chatting.dx;
import com.tencent.mm.ui.chatting.dx.a;
import com.tencent.mm.ui.chatting.et;
import com.tencent.mm.ui.chatting.z;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.m;
import com.tencent.mm.y.s;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@com.tencent.mm.ui.base.a(19)
public class ImageGalleryGridUI
  extends MMActivity
  implements MenuItem.OnMenuItemClickListener, View.OnClickListener, ViewTreeObserver.OnPreDrawListener, AdapterView.OnItemClickListener, dx, g.b
{
  private String eDs;
  protected ae handler;
  public long juT;
  private TextView lCL;
  private boolean mIsPause;
  private Animation oTW;
  private boolean tIv;
  public boolean txk;
  private com.tencent.mm.sdk.b.c wIv;
  private View wLA;
  private View wLB;
  private View wLC;
  public int wLl;
  private GridView wLm;
  c wLn;
  private WeakReference<c.a> wLo;
  private Boolean wLp;
  private Boolean wLq;
  private TextView wLr;
  private Runnable wLs;
  private Runnable wLt;
  private boolean wLu;
  Runnable wLv;
  public View wLw;
  private View wLx;
  private int wLy;
  private View wLz;
  private long wzI;
  
  public ImageGalleryGridUI()
  {
    GMTrace.i(2420750942208L, 18036);
    this.wLs = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2433904279552L, 18134);
        if ((ImageGalleryGridUI.a(ImageGalleryGridUI.this) != null) && (ImageGalleryGridUI.a(ImageGalleryGridUI.this).getVisibility() != 4)) {
          ImageGalleryGridUI.a(ImageGalleryGridUI.this).setVisibility(4);
        }
        GMTrace.o(2433904279552L, 18134);
      }
    };
    this.wLt = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2463566397440L, 18355);
        if ((ImageGalleryGridUI.a(ImageGalleryGridUI.this) != null) && (ImageGalleryGridUI.a(ImageGalleryGridUI.this).getVisibility() != 0)) {
          ImageGalleryGridUI.a(ImageGalleryGridUI.this).setVisibility(0);
        }
        GMTrace.o(2463566397440L, 18355);
      }
    };
    this.wIv = new com.tencent.mm.sdk.b.c() {};
    this.wLu = false;
    this.tIv = false;
    this.wzI = 0L;
    this.wLv = new Runnable()
    {
      @TargetApi(12)
      public final void run()
      {
        GMTrace.i(2409745088512L, 17954);
        if (ImageGalleryGridUI.this.wLw != null)
        {
          ImageGalleryGridUI.this.wLw.setVisibility(8);
          ImageGalleryGridUI.this.wLw = null;
        }
        GMTrace.o(2409745088512L, 17954);
      }
    };
    this.wLw = null;
    this.wLy = -1;
    this.mIsPause = true;
    GMTrace.o(2420750942208L, 18036);
  }
  
  @TargetApi(11)
  private void Dp(int paramInt)
  {
    GMTrace.i(2421958901760L, 18045);
    Object localObject = getIntent();
    if (((Intent)localObject).getIntExtra("kintent_intent_source", 0) == 1) {}
    for (boolean bool = true;; bool = false)
    {
      this.wLp = Boolean.valueOf(bool);
      this.eDs = ((Intent)localObject).getStringExtra("kintent_talker");
      this.wLl = ((Intent)localObject).getIntExtra("kintent_image_index", 0);
      this.txk = ((Intent)localObject).getBooleanExtra("key_is_biz_chat", false);
      this.juT = getIntent().getLongExtra("key_biz_chat_id", -1L);
      this.wLq = Boolean.valueOf(true);
      sq(getString(R.l.cRB));
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2409476653056L, 17952);
          ImageGalleryGridUI.this.onBackPressed();
          GMTrace.o(2409476653056L, 17952);
          return true;
        }
      });
      this.wLx = findViewById(R.h.bOo);
      localObject = findViewById(R.h.byy);
      this.wLz = ((View)localObject);
      ((View)localObject).setOnClickListener(this);
      localObject = findViewById(R.h.cik);
      this.wLA = ((View)localObject);
      ((View)localObject).setOnClickListener(this);
      localObject = findViewById(R.h.bZo);
      this.wLB = ((View)localObject);
      ((View)localObject).setOnClickListener(this);
      localObject = findViewById(R.h.aVV);
      this.wLC = ((View)localObject);
      ((View)localObject).setOnClickListener(this);
      this.lCL = ((TextView)findViewById(R.h.bdJ));
      this.wLr = ((TextView)findViewById(R.h.bdH));
      if (paramInt != 0) {
        break label381;
      }
      this.wLm = ((GridView)findViewById(R.h.bGI));
      this.wLm.setOnItemClickListener(this);
      this.wLm.setNumColumns(3);
      localObject = new au();
      if (this.txk) {
        ((au)localObject).F(this.juT);
      }
      this.wLn = new c(this, (au)localObject, this.eDs);
      if (this.wLn.getCount() != 0) {
        break;
      }
      this.wLr.setVisibility(0);
      GMTrace.o(2421958901760L, 18045);
      return;
    }
    this.wLr.setVisibility(8);
    this.wLm.setAdapter(this.wLn);
    cfk();
    for (;;)
    {
      this.wLm.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        private Runnable lDp;
        
        private void eL(boolean paramAnonymousBoolean)
        {
          GMTrace.i(2435649110016L, 18147);
          if (paramAnonymousBoolean)
          {
            ImageGalleryGridUI.b(ImageGalleryGridUI.this).removeCallbacks(this.lDp);
            if (ImageGalleryGridUI.b(ImageGalleryGridUI.this).getVisibility() != 0)
            {
              ImageGalleryGridUI.b(ImageGalleryGridUI.this).clearAnimation();
              Animation localAnimation = AnimationUtils.loadAnimation(ImageGalleryGridUI.this.vKB.vKW, R.a.aLs);
              ImageGalleryGridUI.b(ImageGalleryGridUI.this).setVisibility(0);
              ImageGalleryGridUI.b(ImageGalleryGridUI.this).startAnimation(localAnimation);
              GMTrace.o(2435649110016L, 18147);
            }
          }
          else
          {
            ImageGalleryGridUI.b(ImageGalleryGridUI.this).removeCallbacks(this.lDp);
            ImageGalleryGridUI.b(ImageGalleryGridUI.this).postDelayed(this.lDp, 256L);
          }
          GMTrace.o(2435649110016L, 18147);
        }
        
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(2435917545472L, 18149);
          paramAnonymousAbsListView = ImageGalleryGridUI.this;
          Object localObject = (au)paramAnonymousAbsListView.wLn.getItem(paramAnonymousInt1);
          if (localObject == null) {}
          for (paramAnonymousAbsListView = null;; paramAnonymousAbsListView = com.tencent.mm.ui.gridviewheaders.a.chJ().a((Date)localObject, paramAnonymousAbsListView))
          {
            ImageGalleryGridUI.b(ImageGalleryGridUI.this).setText(paramAnonymousAbsListView);
            GMTrace.o(2435917545472L, 18149);
            return;
            localObject = new Date(((ce)localObject).field_createTime);
          }
        }
        
        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          GMTrace.i(2435783327744L, 18148);
          if (1 == paramAnonymousInt) {
            eL(true);
          }
          for (;;)
          {
            com.tencent.mm.ao.n.Jd().bi(paramAnonymousInt);
            GMTrace.o(2435783327744L, 18148);
            return;
            if (paramAnonymousInt == 0) {
              eL(false);
            }
          }
        }
      });
      GMTrace.o(2421958901760L, 18045);
      return;
      label381:
      if (this.wLn != null)
      {
        this.wLn.notifyDataSetChanged();
        cfk();
      }
    }
  }
  
  private void K(View paramView, int paramInt)
  {
    GMTrace.i(2423166861312L, 18054);
    if (this.wLn == null)
    {
      GMTrace.o(2423166861312L, 18054);
      return;
    }
    Intent localIntent = new Intent(this, ImageGalleryUI.class);
    localIntent.putExtra("key_biz_chat_id", this.juT);
    localIntent.putExtra("key_is_biz_chat", this.txk);
    localIntent.putExtra("intent.key.with.footer", true);
    au localau = (au)this.wLn.getItem(paramInt);
    if (localau == null)
    {
      GMTrace.o(2423166861312L, 18054);
      return;
    }
    int j = getResources().getConfiguration().orientation;
    int i = 0;
    paramInt = 0;
    int[] arrayOfInt = new int[2];
    if (paramView != null)
    {
      i = paramView.getWidth();
      paramInt = paramView.getHeight();
      paramView.getLocationInWindow(arrayOfInt);
    }
    localIntent.addFlags(536870912);
    localIntent.putExtra("img_gallery_msg_id", localau.field_msgId).putExtra("img_gallery_msg_svr_id", localau.field_msgSvrId).putExtra("img_gallery_talker", localau.field_talker).putExtra("img_gallery_chatroom_name", localau.field_talker).putExtra("img_gallery_orientation", j);
    if (paramView != null) {
      localIntent.putExtra("img_gallery_width", i).putExtra("img_gallery_height", paramInt).putExtra("img_gallery_left", arrayOfInt[0]).putExtra("img_gallery_top", arrayOfInt[1]).putExtra("img_gallery_enter_from_grid", true);
    }
    for (;;)
    {
      startActivity(localIntent);
      overridePendingTransition(0, 0);
      GMTrace.o(2423166861312L, 18054);
      return;
      localIntent.putExtra("img_gallery_back_from_grid", true);
    }
  }
  
  private boolean a(au paramau, com.tencent.mm.pluginsdk.model.app.f paramf)
  {
    GMTrace.i(2422495772672L, 18049);
    if ((!paramau.field_talker.endsWith("@qqim")) || (!paramf.field_packageName.equals("com.tencent.mobileqq")))
    {
      GMTrace.o(2422495772672L, 18049);
      return false;
    }
    w.d("MicroMsg.GalleryGridUI", "jacks open QQ");
    paramau = new Intent("android.intent.action.MAIN", null);
    paramau.addCategory("android.intent.category.LAUNCHER");
    paramau.addFlags(268435456);
    paramau.setClassName("com.tencent.mobileqq", as(this.vKB.vKW, "com.tencent.mobileqq"));
    paramau.putExtra("platformId", "wechat");
    at.AR();
    paramf = com.tencent.mm.y.c.xh().get(9, null);
    int i;
    if ((paramf != null) && ((paramf instanceof Integer))) {
      i = ((Integer)paramf).intValue();
    }
    for (;;)
    {
      int j;
      if (i != 0) {
        j = 0;
      }
      try
      {
        paramf = String.valueOf(i).getBytes("utf-8");
        byte[] arrayOfByte = "asdfghjkl;'".getBytes("utf-8");
        int m = arrayOfByte.length;
        int k = 0;
        i = j;
        j = k;
        while (j < m)
        {
          k = arrayOfByte[j];
          if (i >= paramf.length) {
            break;
          }
          paramf[i] = ((byte)(k ^ paramf[i]));
          j += 1;
          i += 1;
        }
        paramau.putExtra("tencent_gif", paramf);
        i = 0;
      }
      catch (UnsupportedEncodingException paramf)
      {
        try
        {
          for (;;)
          {
            startActivity(paramau);
            GMTrace.o(2422495772672L, 18049);
            return true;
            paramf = paramf;
            w.printErrStackTrace("MicroMsg.GalleryGridUI", paramf, "", new Object[0]);
          }
        }
        catch (Exception paramau)
        {
          for (;;) {}
        }
      }
    }
  }
  
  private static String as(Context paramContext, String paramString)
  {
    GMTrace.i(2422629990400L, 18050);
    paramContext = paramContext.getPackageManager();
    try
    {
      paramString = paramContext.getPackageInfo(paramString, 0);
      Intent localIntent = new Intent("android.intent.action.MAIN", null);
      localIntent.addCategory("android.intent.category.LAUNCHER");
      localIntent.setPackage(paramString.packageName);
      paramContext = (ResolveInfo)paramContext.queryIntentActivities(localIntent, 0).iterator().next();
      if (paramContext == null) {
        break label108;
      }
      paramContext = paramContext.activityInfo.name;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.GalleryGridUI", paramContext, "", new Object[0]);
        paramContext = null;
      }
    }
    GMTrace.o(2422629990400L, 18050);
    return paramContext;
  }
  
  private void b(cf paramcf)
  {
    GMTrace.i(2424374820864L, 18063);
    paramcf.eDv.activity = this;
    paramcf.eDv.eDC = 45;
    com.tencent.mm.sdk.b.a.vgX.m(paramcf);
    if ((paramcf.eDw.ret == -2) || (paramcf.eDw.ret > 0))
    {
      GMTrace.o(2424374820864L, 18063);
      return;
    }
    if (paramcf.eDw.ret <= 0)
    {
      ceR();
      if (14 != paramcf.eDv.type)
      {
        w.d("MicroMsg.GalleryGridUI", "not record type, do not report");
        GMTrace.o(2424374820864L, 18063);
        return;
      }
      if (paramcf.eDv.eDy == null)
      {
        w.e("MicroMsg.GalleryGridUI", "want to report record fav, but type count is null");
        GMTrace.o(2424374820864L, 18063);
        return;
      }
      com.tencent.mm.plugin.report.service.g.ork.i(11142, new Object[] { Integer.valueOf(paramcf.eDv.eDy.ulQ), Integer.valueOf(paramcf.eDv.eDy.ulR), Integer.valueOf(paramcf.eDv.eDy.ulS), Integer.valueOf(paramcf.eDv.eDy.ulT), Integer.valueOf(paramcf.eDv.eDy.ulU), Integer.valueOf(paramcf.eDv.eDy.ulV), Integer.valueOf(paramcf.eDv.eDy.ulW), Integer.valueOf(paramcf.eDv.eDy.ulX), Integer.valueOf(paramcf.eDv.eDy.ulY), Integer.valueOf(paramcf.eDv.eDy.ulZ), Integer.valueOf(paramcf.eDv.eDy.uma), Integer.valueOf(paramcf.eDv.eDy.umb), Integer.valueOf(paramcf.eDv.eDy.umc), Integer.valueOf(paramcf.eDv.eDy.umd), Integer.valueOf(paramcf.eDv.eDy.ume) });
    }
    GMTrace.o(2424374820864L, 18063);
  }
  
  private String bj(au paramau)
  {
    GMTrace.i(2422764208128L, 18051);
    String str = bg.aq(this.eDs, "");
    boolean bool = this.eDs.endsWith("@chatroom");
    if (!bool)
    {
      GMTrace.o(2422764208128L, 18051);
      return str;
    }
    if (bool)
    {
      paramau = bc.gP(paramau.field_content);
      if ((paramau == null) || (paramau.length() <= 0)) {}
    }
    for (;;)
    {
      GMTrace.o(2422764208128L, 18051);
      return paramau;
      paramau = str;
    }
  }
  
  private void bk(au paramau)
  {
    GMTrace.i(2423032643584L, 18053);
    long l1 = this.wzI;
    long l2 = System.currentTimeMillis();
    this.wzI = l2;
    if (l1 + 30000L < l2)
    {
      at.AR();
      this.tIv = com.tencent.mm.y.c.isSDCardAvailable();
    }
    if (!this.tIv)
    {
      u.fo(this.vKB.vKW);
      GMTrace.o(2423032643584L, 18053);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClassName(this.vKB.vKW, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
    localIntent.putExtra("app_msg_id", paramau.field_msgId);
    startActivity(localIntent);
    GMTrace.o(2423032643584L, 18053);
  }
  
  private static void cH(List<au> paramList)
  {
    GMTrace.i(2424106385408L, 18061);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      au localau = (au)paramList.next();
      com.tencent.mm.ui.chatting.a.a(a.c.wqy, a.d.wqD, localau, 0);
    }
    GMTrace.o(2424106385408L, 18061);
  }
  
  private static List<au> cL(List<au> paramList)
  {
    GMTrace.i(2424240603136L, 18062);
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      au localau = (au)paramList.next();
      if ((!b.aZ(localau)) && (!b.ba(localau))) {
        localArrayList.add(localau);
      }
    }
    GMTrace.o(2424240603136L, 18062);
    return localArrayList;
  }
  
  private void ceQ()
  {
    GMTrace.i(2423569514496L, 18057);
    sq(getString(R.l.dzp, new Object[] { Integer.valueOf(g.a.wMg.wKD.size()) }));
    g.a.wMg.wMe = true;
    if (this.wLn == null)
    {
      GMTrace.o(2423569514496L, 18057);
      return;
    }
    if (this.oTW == null) {
      this.oTW = AnimationUtils.loadAnimation(this, R.a.aLG);
    }
    c localc = this.wLn;
    localc.gRT = false;
    localc.notifyDataSetChanged();
    this.wLx.setVisibility(0);
    this.wLx.startAnimation(this.oTW);
    this.wLz.setEnabled(false);
    this.wLA.setEnabled(false);
    this.wLB.setEnabled(false);
    this.wLC.setEnabled(false);
    this.wLy = this.wLm.getPaddingBottom();
    this.wLm.setPadding(this.wLm.getPaddingLeft(), this.wLm.getPaddingTop(), this.wLm.getPaddingRight(), com.tencent.mm.br.a.V(this.vKB.vKW, R.f.aQM));
    com.tencent.mm.plugin.report.service.g.ork.i(11627, new Object[] { Integer.valueOf(2) });
    AZ(0);
    a(0, getString(R.l.dyK), this);
    GMTrace.o(2423569514496L, 18057);
  }
  
  private void cfk()
  {
    GMTrace.i(2422093119488L, 18046);
    int i = this.wLm.getFirstVisiblePosition();
    int j = this.wLm.getLastVisiblePosition();
    int k = this.wLl;
    if ((k >= i) && (k <= j))
    {
      GMTrace.o(2422093119488L, 18046);
      return;
    }
    this.wLm.setSelection(k);
    GMTrace.o(2422093119488L, 18046);
  }
  
  private void cfl()
  {
    GMTrace.i(2423703732224L, 18058);
    if ((!g.a.wMg.wKD.isEmpty()) && (g.a.wMg.wMe)) {}
    for (int i = 1; i != 0; i = 0)
    {
      this.wLz.setEnabled(true);
      this.wLA.setEnabled(true);
      this.wLB.setEnabled(true);
      this.wLC.setEnabled(true);
      GMTrace.o(2423703732224L, 18058);
      return;
    }
    this.wLz.setEnabled(false);
    this.wLA.setEnabled(false);
    this.wLB.setEnabled(false);
    this.wLC.setEnabled(false);
    GMTrace.o(2423703732224L, 18058);
  }
  
  private static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    GMTrace.i(2422898425856L, 18052);
    if ((paramString == null) || (paramString.length() == 0)) {
      paramString = null;
    }
    while (paramString == null)
    {
      GMTrace.o(2422898425856L, 18052);
      return null;
      paramString = com.tencent.mm.pluginsdk.model.app.g.aP(paramString, true);
      if (paramString == null) {
        paramString = null;
      } else {
        paramString = paramString.field_packageName;
      }
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      GMTrace.o(2422898425856L, 18052);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      w.printErrStackTrace("MicroMsg.GalleryGridUI", paramContext, "", new Object[0]);
      GMTrace.o(2422898425856L, 18052);
    }
    return null;
  }
  
  public final void a(dx.a parama)
  {
    GMTrace.i(14958968438784L, 111453);
    GMTrace.o(14958968438784L, 111453);
  }
  
  public final void b(dx.a parama)
  {
    GMTrace.i(14959102656512L, 111454);
    if (parama == dx.a.wFR)
    {
      this.wLn.QF();
      this.wLn.notifyDataSetChanged();
    }
    ceR();
    GMTrace.o(14959102656512L, 111454);
  }
  
  protected final boolean bXl()
  {
    GMTrace.i(2421153595392L, 18039);
    GMTrace.o(2421153595392L, 18039);
    return true;
  }
  
  public final void ccH()
  {
    GMTrace.i(14958834221056L, 111452);
    GMTrace.o(14958834221056L, 111452);
  }
  
  public final boolean ccI()
  {
    GMTrace.i(2424911691776L, 18067);
    GMTrace.o(2424911691776L, 18067);
    return true;
  }
  
  public final void ceR()
  {
    GMTrace.i(2423837949952L, 18059);
    g.a.wMg.wMe = false;
    sq(getString(R.l.cRB));
    if (this.wLn == null)
    {
      GMTrace.o(2423837949952L, 18059);
      return;
    }
    this.wLn.notifyDataSetChanged();
    if (this.wLy >= 0) {
      this.wLm.setPadding(this.wLm.getPaddingLeft(), this.wLm.getPaddingTop(), this.wLm.getPaddingRight(), this.wLy);
    }
    this.wLx.setVisibility(8);
    AZ(0);
    a(0, getString(R.l.dyL), this);
    GMTrace.o(2423837949952L, 18059);
  }
  
  public final void cfm()
  {
    GMTrace.i(2424509038592L, 18064);
    if ((this.wLn != null) && (this.mIsPause)) {
      this.wLn.wLe = true;
    }
    sq(getString(R.l.dzp, new Object[] { Integer.valueOf(g.a.wMg.wKD.size()) }));
    cfl();
    GMTrace.o(2424509038592L, 18064);
  }
  
  public final void clear()
  {
    GMTrace.i(2424643256320L, 18065);
    if ((this.wLn != null) && (this.mIsPause)) {
      this.wLn.wLe = true;
    }
    cfl();
    GMTrace.o(2424643256320L, 18065);
  }
  
  public void finish()
  {
    GMTrace.i(2422227337216L, 18047);
    super.finish();
    g.a.wMg.detach();
    GMTrace.o(2422227337216L, 18047);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2420885159936L, 18037);
    int i = R.i.bGI;
    GMTrace.o(2420885159936L, 18037);
    return i;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(2421824684032L, 18044);
    if (g.a.wMg.wMe)
    {
      ceR();
      GMTrace.o(2421824684032L, 18044);
      return;
    }
    if (this.wLp.booleanValue())
    {
      super.onBackPressed();
      GMTrace.o(2421824684032L, 18044);
      return;
    }
    if (this.wLl >= 0) {
      K(null, this.wLl);
    }
    finish();
    GMTrace.o(2421824684032L, 18044);
  }
  
  public void onClick(final View paramView)
  {
    GMTrace.i(2423972167680L, 18060);
    if (g.a.wMg.wKD.isEmpty())
    {
      GMTrace.o(2423972167680L, 18060);
      return;
    }
    boolean bool = this.eDs.toLowerCase().endsWith("@chatroom");
    final Object localObject2 = g.a.wMg.wKD;
    if ((localObject2 == null) || (((List)localObject2).isEmpty()))
    {
      GMTrace.o(2423972167680L, 18060);
      return;
    }
    if (paramView.getId() == R.h.aVV)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(11627, new Object[] { Integer.valueOf(5) });
      paramView = new TreeSet();
      localObject1 = ((List)localObject2).iterator();
      while (((Iterator)localObject1).hasNext()) {
        paramView.add(Long.valueOf(((au)((Iterator)localObject1).next()).field_msgId));
      }
      com.tencent.mm.ui.base.h.a(this, getString(R.l.din), "", getString(R.l.dmE), getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2413100531712L, 17979);
          w.i("MicroMsg.GalleryGridUI", "delete message");
          z.a(ImageGalleryGridUI.this, paramView, ImageGalleryGridUI.this);
          ImageGalleryGridUI.this.ceR();
          GMTrace.o(2413100531712L, 17979);
        }
      }, null);
      GMTrace.o(2423972167680L, 18060);
      return;
    }
    if (paramView.getId() == R.h.byy)
    {
      com.tencent.mm.plugin.report.service.g.ork.a(219L, 18L, 1L, true);
      final cf localcf = new cf();
      if (com.tencent.mm.pluginsdk.model.g.a(this.vKB.vKW, localcf, this.eDs, (List)localObject2, false, false))
      {
        b(localcf);
        cH((List)localObject2);
        GMTrace.o(2423972167680L, 18060);
        return;
      }
      if (((List)localObject2).size() > 1)
      {
        ActionBarActivity localActionBarActivity = this.vKB.vKW;
        if (localcf.eDv.eDB >= 0)
        {
          paramView = this.vKB.vKW.getString(R.l.dtH);
          if (localcf.eDv.eDB < 0) {
            break label418;
          }
        }
        label418:
        for (localObject1 = this.vKB.vKW.getString(R.l.diu);; localObject1 = this.vKB.vKW.getString(R.l.dNH))
        {
          com.tencent.mm.ui.base.h.a(localActionBarActivity, paramView, "", (String)localObject1, this.vKB.vKW.getString(R.l.dis), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(2468398235648L, 18391);
              if ((localcf.eDv.type == 14) && (localcf.eDv.eDx.ulB.size() == 0))
              {
                ImageGalleryGridUI.this.ceR();
                GMTrace.o(2468398235648L, 18391);
                return;
              }
              ImageGalleryGridUI.a(ImageGalleryGridUI.this, localcf);
              ImageGalleryGridUI.cM(localObject2);
              GMTrace.o(2468398235648L, 18391);
            }
          }, null);
          GMTrace.o(2423972167680L, 18060);
          return;
          paramView = this.vKB.vKW.getString(R.l.dtG);
          break;
        }
      }
      com.tencent.mm.ui.base.h.h(this.vKB.vKW, localcf.eDv.eDB, 0);
      GMTrace.o(2423972167680L, 18060);
      return;
    }
    if (paramView.getId() == R.h.cik)
    {
      com.tencent.mm.plugin.report.service.g.ork.a(219L, 19L, 1L, true);
      ab.a(this, (List)localObject2, bool, this.eDs, this);
      ceR();
      GMTrace.o(2423972167680L, 18060);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.i(11627, new Object[] { Integer.valueOf(3) });
    paramView = cL((List)localObject2);
    if (paramView.size() != ((List)localObject2).size())
    {
      com.tencent.mm.ui.base.h.a(this.vKB.vKW, R.l.dzf, R.l.cUG, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2437796593664L, 18163);
          b.c(ImageGalleryGridUI.this.vKB.vKW, paramView);
          ImageGalleryGridUI.this.ceR();
          GMTrace.o(2437796593664L, 18163);
        }
      }, null);
      GMTrace.o(2423972167680L, 18060);
      return;
    }
    Object localObject1 = (au)paramView.get(0);
    if ((((List)localObject2).size() == 1) && (localObject1 != null) && (((au)localObject1).aCp()))
    {
      localObject2 = ((ce)localObject1).field_content;
      paramView = null;
      if (localObject2 != null) {
        paramView = f.a.C((String)localObject2, ((ce)localObject1).field_reserved);
      }
      if ((paramView != null) && (paramView.type == 6)) {
        bk((au)localObject1);
      }
      GMTrace.o(2423972167680L, 18060);
      return;
    }
    b.c(this, (List)localObject2);
    ceR();
    GMTrace.o(2423972167680L, 18060);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2421019377664L, 18038);
    super.onCreate(paramBundle);
    this.wLu = true;
    this.handler = new ae();
    Dp(0);
    com.tencent.mm.sdk.b.a.vgX.b(this.wIv);
    GMTrace.o(2421019377664L, 18038);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2421287813120L, 18040);
    this.handler.removeCallbacks(this.wLt);
    this.handler = null;
    com.tencent.mm.ao.n.Jd().bi(0);
    com.tencent.mm.sdk.b.a.vgX.c(this.wIv);
    super.onDestroy();
    GMTrace.o(2421287813120L, 18040);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(2422361554944L, 18048);
    au localau = (au)this.wLn.getItem(paramInt);
    paramAdapterView = localau.field_content;
    if (paramAdapterView != null) {}
    for (paramAdapterView = f.a.C(paramAdapterView, localau.field_reserved);; paramAdapterView = null)
    {
      if ((paramAdapterView != null) && (paramAdapterView.type == 6))
      {
        bk(localau);
        GMTrace.o(2422361554944L, 18048);
        return;
      }
      Object localObject1;
      Object localObject2;
      Object localObject3;
      if ((paramAdapterView != null) && (paramAdapterView.type == 3))
      {
        localObject1 = com.tencent.mm.pluginsdk.model.app.p.s(paramAdapterView.url, "message");
        localObject2 = com.tencent.mm.pluginsdk.model.app.p.s(paramAdapterView.giu, "message");
        localObject3 = getPackageInfo(this.vKB.vKW, paramAdapterView.appId);
        if (localObject3 == null)
        {
          paramView = null;
          if (localObject3 != null) {
            break label211;
          }
        }
        long l;
        label211:
        for (paramInt = 0;; paramInt = ((PackageInfo)localObject3).versionCode)
        {
          localObject3 = paramAdapterView.appId;
          paramLong = localau.field_msgId;
          l = localau.field_msgSvrId;
          if (((localObject1 != null) && (((String)localObject1).length() != 0)) || ((localObject2 != null) && (((String)localObject2).length() != 0))) {
            break label220;
          }
          w.e("MicroMsg.GalleryGridUI", "url, lowUrl both are empty");
          GMTrace.o(2422361554944L, 18048);
          return;
          paramView = ((PackageInfo)localObject3).versionName;
          break;
        }
        label220:
        if (am.isMobile(this.vKB.vKW))
        {
          paramAdapterView = (AdapterView<?>)localObject1;
          if (localObject2 != null)
          {
            if (((String)localObject2).length() > 0) {
              break label512;
            }
            paramAdapterView = (AdapterView<?>)localObject1;
          }
        }
        for (;;)
        {
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("msg_id", paramLong);
          ((Intent)localObject1).putExtra("rawUrl", paramAdapterView);
          ((Intent)localObject1).putExtra("version_name", paramView);
          ((Intent)localObject1).putExtra("version_code", paramInt);
          ((Intent)localObject1).putExtra("usePlugin", true);
          ((Intent)localObject1).putExtra("geta8key_username", this.eDs);
          ((Intent)localObject1).putExtra("KPublisherId", "msg_" + Long.toString(l));
          ((Intent)localObject1).putExtra("KAppId", (String)localObject3);
          paramAdapterView = bj(localau);
          ((Intent)localObject1).putExtra("pre_username", paramAdapterView);
          ((Intent)localObject1).putExtra("prePublishId", "msg_" + Long.toString(l));
          if (localau != null) {
            ((Intent)localObject1).putExtra("preUsername", paramAdapterView);
          }
          ((Intent)localObject1).putExtra("preChatName", this.eDs);
          ((Intent)localObject1).putExtra("preChatTYPE", com.tencent.mm.y.t.H(paramAdapterView, this.eDs));
          ((Intent)localObject1).putExtra("preMsgIndex", 0);
          com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
          GMTrace.o(2422361554944L, 18048);
          return;
          if (localObject1 != null)
          {
            paramAdapterView = (AdapterView<?>)localObject1;
            if (((String)localObject1).length() > 0) {}
          }
          else
          {
            label512:
            paramAdapterView = (AdapterView<?>)localObject2;
          }
        }
      }
      if ((paramAdapterView != null) && (paramAdapterView.type == 5))
      {
        if ((paramAdapterView.url != null) && (!paramAdapterView.url.equals("")))
        {
          localObject1 = paramAdapterView.url;
          if (!this.eDs.endsWith("@chatroom")) {
            break label1001;
          }
          paramView = "groupmessage";
          localObject3 = com.tencent.mm.pluginsdk.model.app.p.s((String)localObject1, paramView);
          paramView = paramAdapterView.url;
          localObject2 = getPackageInfo(this.vKB.vKW, paramAdapterView.appId);
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("rawUrl", (String)localObject3);
          ((Intent)localObject1).putExtra("webpageTitle", paramAdapterView.title);
          if ((paramAdapterView.appId != null) && (("wx751a1acca5688ba3".equals(paramAdapterView.appId)) || ("wxfbc915ff7c30e335".equals(paramAdapterView.appId)) || ("wx482a4001c37e2b74".equals(paramAdapterView.appId))))
          {
            localObject3 = new Bundle();
            ((Bundle)localObject3).putString("jsapi_args_appid", paramAdapterView.appId);
            ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject3);
          }
          if (bg.nm(paramView)) {
            break label1008;
          }
          ((Intent)localObject1).putExtra("shortUrl", paramView);
          label730:
          if (localObject2 != null) {
            break label1024;
          }
          paramView = null;
          label737:
          ((Intent)localObject1).putExtra("version_name", paramView);
          if (localObject2 != null) {
            break label1033;
          }
        }
        label1001:
        label1008:
        label1024:
        label1033:
        for (paramInt = 0;; paramInt = ((PackageInfo)localObject2).versionCode)
        {
          ((Intent)localObject1).putExtra("version_code", paramInt);
          if (!bg.nm(paramAdapterView.eTo))
          {
            ((Intent)localObject1).putExtra("srcUsername", paramAdapterView.eTo);
            ((Intent)localObject1).putExtra("srcDisplayname", paramAdapterView.eTp);
          }
          ((Intent)localObject1).putExtra("msg_id", localau.field_msgId);
          ((Intent)localObject1).putExtra("KPublisherId", "msg_" + Long.toString(localau.field_msgSvrId));
          ((Intent)localObject1).putExtra("KAppId", paramAdapterView.appId);
          ((Intent)localObject1).putExtra("geta8key_username", this.eDs);
          paramAdapterView = bj(localau);
          ((Intent)localObject1).putExtra("pre_username", paramAdapterView);
          ((Intent)localObject1).putExtra("prePublishId", "msg_" + Long.toString(localau.field_msgSvrId));
          ((Intent)localObject1).putExtra("preUsername", paramAdapterView);
          ((Intent)localObject1).putExtra("preChatName", this.eDs);
          ((Intent)localObject1).putExtra("preChatTYPE", com.tencent.mm.y.t.H(paramAdapterView, this.eDs));
          ((Intent)localObject1).putExtra("preMsgIndex", 0);
          com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
          GMTrace.o(2422361554944L, 18048);
          return;
          paramView = "singlemessage";
          break;
          ((Intent)localObject1).putExtra("shortUrl", paramAdapterView.url);
          break label730;
          paramView = ((PackageInfo)localObject2).versionName;
          break label737;
        }
      }
      if ((paramAdapterView != null) && (paramAdapterView.type == 19))
      {
        paramView = new Intent();
        paramView.putExtra("message_id", localau.field_msgId);
        paramView.putExtra("record_xml", paramAdapterView.giV);
        com.tencent.mm.bj.d.b(this.vKB.vKW, "record", ".ui.RecordMsgDetailUI", paramView);
        GMTrace.o(2422361554944L, 18048);
        return;
      }
      if ((paramAdapterView != null) && (paramAdapterView.type == 24))
      {
        paramView = new le();
        paramView.ePv.context = this.vKB.vKW;
        paramView.ePv.eDr = localau.field_msgId;
        paramView.ePv.ePw = paramAdapterView.giV;
        com.tencent.mm.sdk.b.a.vgX.m(paramView);
        GMTrace.o(2422361554944L, 18048);
        return;
      }
      label1295:
      Object localObject4;
      label1355:
      boolean bool;
      if ((paramAdapterView != null) && (paramAdapterView.type == 7))
      {
        localObject2 = com.tencent.mm.pluginsdk.model.app.g.aP(paramAdapterView.appId, false);
        if ((localObject2 != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject2).bJs()))
        {
          localObject1 = this.eDs;
          paramView = (View)localObject1;
          if (s.eb((String)localObject1)) {
            paramView = bc.gP(localau.field_content);
          }
          paramLong = localau.field_msgSvrId;
          if ((localObject2 != null) && (com.tencent.mm.pluginsdk.model.app.p.n(this.vKB.vKW, ((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_packageName)))
          {
            paramInt = 3;
            if (paramAdapterView.type != 2) {
              break label1692;
            }
            paramInt = 4;
            localObject3 = new nb();
            ((nb)localObject3).eSc.context = this.vKB.vKW;
            ((nb)localObject3).eSc.scene = 1;
            ((nb)localObject3).eSc.eSd = paramAdapterView.appId;
            localObject4 = ((nb)localObject3).eSc;
            if (localObject2 != null) {
              break label1705;
            }
            localObject1 = null;
            ((nb.a)localObject4).packageName = ((String)localObject1);
            ((nb)localObject3).eSc.msgType = paramAdapterView.type;
            ((nb)localObject3).eSc.eMI = paramView;
            ((nb)localObject3).eSc.eSe = paramInt;
            ((nb)localObject3).eSc.mediaTagName = paramAdapterView.mediaTagName;
            ((nb)localObject3).eSc.eSf = paramLong;
            ((nb)localObject3).eSc.eSg = "";
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject3);
            paramView = p.a.tma;
            if ((com.tencent.mm.pluginsdk.model.app.g.a(this.vKB.vKW, (com.tencent.mm.pluginsdk.model.app.f)localObject2)) || (paramView == null)) {
              break label1814;
            }
            if (bg.nm(((com.tencent.mm.g.b.n)localObject2).fdR)) {
              break label1715;
            }
            bool = com.tencent.mm.pluginsdk.model.app.q.aR(this.vKB.vKW, ((com.tencent.mm.g.b.n)localObject2).fdR);
            w.i("MicroMsg.GalleryGridUI", "oversea game info and gpdownload url is not empty, jump to google play directy:[%s], jump result: [%b]", new Object[] { ((com.tencent.mm.g.b.n)localObject2).fdR, Boolean.valueOf(bool) });
            if (!bool) {
              break label1715;
            }
            paramInt = 1;
          }
          for (;;)
          {
            if (paramInt == 0)
            {
              if ((paramAdapterView.eAE == null) || (paramAdapterView.eAE.length() == 0))
              {
                paramView = localau.field_content;
                paramAdapterView = paramView;
                if (localau.field_isSend == 0)
                {
                  paramInt = localau.field_isSend;
                  paramAdapterView = paramView;
                  if (!this.txk)
                  {
                    paramAdapterView = paramView;
                    if (s.eb(this.eDs))
                    {
                      paramAdapterView = paramView;
                      if (paramView != null)
                      {
                        paramAdapterView = paramView;
                        if (paramInt == 0) {
                          paramAdapterView = bc.gQ(paramView);
                        }
                      }
                    }
                  }
                }
                paramView = f.a.eS(paramAdapterView);
                localObject1 = com.tencent.mm.pluginsdk.model.app.g.aP(paramView.appId, true);
                if ((localObject1 != null) && (com.tencent.mm.pluginsdk.model.app.p.n(this.vKB.vKW, ((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_packageName)))
                {
                  if (((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_status == 3)
                  {
                    w.e("MicroMsg.GalleryGridUI", "requestAppShow fail, app is in blacklist, packageName = " + ((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_packageName);
                    GMTrace.o(2422361554944L, 18048);
                    return;
                    paramInt = 6;
                    break;
                    label1692:
                    if (paramAdapterView.type != 5) {
                      break label1295;
                    }
                    paramInt = 1;
                    break label1295;
                    label1705:
                    localObject1 = ((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_packageName;
                    break label1355;
                    label1715:
                    localObject1 = new gk();
                    ((gk)localObject1).eJy.actionCode = 2;
                    ((gk)localObject1).eJy.scene = 1;
                    ((gk)localObject1).eJy.appId = ((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_appId;
                    ((gk)localObject1).eJy.context = this.vKB.vKW;
                    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
                    new Intent();
                    localObject1 = this.vKB.vKW;
                    paramView.G(((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_appId, 1, 1);
                    paramInt = 1;
                    continue;
                    label1814:
                    paramInt = 0;
                    continue;
                  }
                  if (!com.tencent.mm.pluginsdk.model.app.p.b(this.vKB.vKW, (com.tencent.mm.pluginsdk.model.app.f)localObject1))
                  {
                    w.e("MicroMsg.GalleryGridUI", "The app %s signature is incorrect.", new Object[] { ((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appName });
                    Toast.makeText(this.vKB.vKW, getString(R.l.dzZ, new Object[] { com.tencent.mm.pluginsdk.model.app.g.a(this.vKB.vKW, (com.tencent.mm.pluginsdk.model.app.f)localObject1, null) }), 1).show();
                    GMTrace.o(2422361554944L, 18048);
                    return;
                  }
                  if (a(localau, (com.tencent.mm.pluginsdk.model.app.f)localObject1)) {
                    break label2145;
                  }
                  localObject2 = new WXAppExtendObject();
                  ((WXAppExtendObject)localObject2).extInfo = paramView.extInfo;
                  if ((paramView.eAE != null) && (paramView.eAE.length() > 0))
                  {
                    paramAdapterView = an.afP().Op(paramView.eAE);
                    if (paramAdapterView != null) {
                      break label2085;
                    }
                  }
                  label2085:
                  for (paramAdapterView = null;; paramAdapterView = paramAdapterView.field_fileFullPath)
                  {
                    ((WXAppExtendObject)localObject2).filePath = paramAdapterView;
                    paramAdapterView = new WXMediaMessage();
                    paramAdapterView.sdkVer = 620822528;
                    paramAdapterView.mediaObject = ((WXMediaMessage.IMediaObject)localObject2);
                    paramAdapterView.title = paramView.title;
                    paramAdapterView.description = paramView.description;
                    paramAdapterView.messageAction = paramView.messageAction;
                    paramAdapterView.messageExt = paramView.messageExt;
                    paramAdapterView.thumbData = e.c(com.tencent.mm.ao.n.IZ().ke(localau.field_imgPath), 0, -1);
                    new et(this).a(((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_packageName, paramAdapterView, ((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appId, ((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_openId);
                    GMTrace.o(2422361554944L, 18048);
                    return;
                  }
                }
                paramAdapterView = com.tencent.mm.pluginsdk.model.app.p.v(this.vKB.vKW, paramView.appId, "message");
                paramView = new Intent();
                paramView.putExtra("rawUrl", paramAdapterView);
                com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramView);
                label2145:
                GMTrace.o(2422361554944L, 18048);
                return;
              }
              if (!this.tIv)
              {
                u.fo(this.vKB.vKW);
                GMTrace.o(2422361554944L, 18048);
                return;
              }
              paramAdapterView = new Intent();
              paramAdapterView.setClassName(this.vKB.vKW, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
              paramAdapterView.putExtra("app_msg_id", localau.field_msgId);
              startActivityForResult(paramAdapterView, 210);
            }
          }
        }
        GMTrace.o(2422361554944L, 18048);
        return;
      }
      int i;
      if ((localau.bTG()) || (localau.bTC()) || (localau.bTH()) || (localau.bTK()))
      {
        if ((paramAdapterView == null) || (bg.nm(paramAdapterView.gkI)))
        {
          i = 0;
          if (i != 0) {
            GMTrace.o(2422361554944L, 18048);
          }
        }
        else
        {
          localObject1 = localau.field_imgPath;
          localObject3 = new Intent();
          ((Intent)localObject3).putExtra("IsAd", false);
          ((Intent)localObject3).putExtra("KStremVideoUrl", paramAdapterView.gkI);
          ((Intent)localObject3).putExtra("KThumUrl", paramAdapterView.gkN);
          ((Intent)localObject3).putExtra("KThumbPath", (String)localObject1);
          ((Intent)localObject3).putExtra("KMediaId", "fakeid_" + localau.field_msgId);
          ((Intent)localObject3).putExtra("KMediaVideoTime", paramAdapterView.gkJ);
          ((Intent)localObject3).putExtra("StremWebUrl", paramAdapterView.gkM);
          ((Intent)localObject3).putExtra("StreamWording", paramAdapterView.gkL);
          ((Intent)localObject3).putExtra("KMediaTitle", paramAdapterView.title);
          localObject2 = localau.field_talker;
          bool = ((String)localObject2).endsWith("@chatroom");
          if (bool)
          {
            localObject1 = bc.gP(localau.field_content);
            label2477:
            ((Intent)localObject3).putExtra("KSta_StremVideoAduxInfo", paramAdapterView.gkO);
            ((Intent)localObject3).putExtra("KSta_StremVideoPublishId", paramAdapterView.gkP);
            ((Intent)localObject3).putExtra("KSta_SourceType", 1);
            if (!bool) {
              break label2636;
            }
          }
          label2636:
          for (i = a.b.wqv.value;; i = a.b.wqu.value)
          {
            ((Intent)localObject3).putExtra("KSta_Scene", i);
            ((Intent)localObject3).putExtra("KSta_FromUserName", (String)localObject1);
            ((Intent)localObject3).putExtra("KSta_ChatName", (String)localObject2);
            ((Intent)localObject3).putExtra("KSta_MsgId", localau.field_msgSvrId);
            ((Intent)localObject3).putExtra("KSta_SnsStatExtStr", paramAdapterView.eTv);
            if (bool) {
              ((Intent)localObject3).putExtra("KSta_ChatroomMembercount", m.fk((String)localObject2));
            }
            com.tencent.mm.bj.d.b(this.vKB.vKW, "sns", ".ui.VideoAdPlayerUI", (Intent)localObject3);
            i = 1;
            break;
            localObject1 = localObject2;
            break label2477;
          }
        }
        K(paramView, paramInt);
        GMTrace.o(2422361554944L, 18048);
        return;
      }
      if ((paramAdapterView != null) && (paramAdapterView.type == 15))
      {
        localObject1 = paramAdapterView.giY;
        paramView = (View)localObject1;
        if (TextUtils.isEmpty((CharSequence)localObject1)) {
          paramView = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vU(paramAdapterView.url);
        }
        if (TextUtils.isEmpty(paramView))
        {
          paramView = new Intent();
          paramView.putExtra("geta8key_username", com.tencent.mm.y.q.zE());
          paramView.putExtra("rawUrl", paramAdapterView.url);
          com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramView);
          GMTrace.o(2422361554944L, 18048);
          return;
        }
        w.d("MicroMsg.GalleryGridUI", "start emoji detail from brandcontact");
        paramAdapterView = new Intent();
        paramAdapterView.putExtra("extra_id", paramView);
        paramAdapterView.putExtra("preceding_scence", 123);
        paramAdapterView.putExtra("download_entrance_scene", 23);
        com.tencent.mm.bj.d.b(this.vKB.vKW, "emoji", ".ui.EmojiStoreDetailUI", paramAdapterView);
        com.tencent.mm.plugin.report.service.g.ork.i(10993, new Object[] { Integer.valueOf(2), paramView });
        GMTrace.o(2422361554944L, 18048);
        return;
      }
      if ((paramAdapterView != null) && (paramAdapterView.type == 26))
      {
        paramInt = paramAdapterView.tid;
        paramView = paramAdapterView.gkG;
        localObject1 = paramAdapterView.desc;
        localObject2 = paramAdapterView.iconUrl;
        localObject3 = paramAdapterView.secondUrl;
        i = paramAdapterView.pageType;
        if (paramInt != 0)
        {
          localObject4 = new Intent();
          ((Intent)localObject4).putExtra("geta8key_username", bj(localau));
          ((Intent)localObject4).putExtra("rawUrl", paramAdapterView.fwt);
          ((Intent)localObject4).putExtra("topic_id", paramInt);
          ((Intent)localObject4).putExtra("topic_name", paramView);
          ((Intent)localObject4).putExtra("topic_desc", (String)localObject1);
          ((Intent)localObject4).putExtra("topic_icon_url", (String)localObject2);
          ((Intent)localObject4).putExtra("topic_ad_url", (String)localObject3);
          ((Intent)localObject4).putExtra("extra_scence", 23);
          com.tencent.mm.bj.d.b(this.vKB.vKW, "emoji", ".ui.EmojiStoreTopicUI", (Intent)localObject4);
          GMTrace.o(2422361554944L, 18048);
          return;
        }
        w.i("MicroMsg.GalleryGridUI", "topic id is zero.");
        GMTrace.o(2422361554944L, 18048);
        return;
      }
      if ((paramAdapterView != null) && (paramAdapterView.type == 27))
      {
        paramInt = paramAdapterView.tid;
        paramView = paramAdapterView.gkG;
        localObject1 = paramAdapterView.desc;
        localObject2 = paramAdapterView.iconUrl;
        localObject3 = paramAdapterView.secondUrl;
        i = paramAdapterView.pageType;
        if (paramInt != 0)
        {
          localObject4 = new Intent();
          ((Intent)localObject4).putExtra("geta8key_username", bj(localau));
          ((Intent)localObject4).putExtra("rawUrl", paramAdapterView.fwt);
          ((Intent)localObject4).putExtra("set_id", paramInt);
          ((Intent)localObject4).putExtra("set_title", paramView);
          ((Intent)localObject4).putExtra("set_iconURL", (String)localObject2);
          ((Intent)localObject4).putExtra("set_desc", (String)localObject1);
          ((Intent)localObject4).putExtra("headurl", (String)localObject3);
          ((Intent)localObject4).putExtra("pageType", i);
          com.tencent.mm.bj.d.b(this.vKB.vKW, "emoji", ".ui.v2.EmojiStoreV2SingleProductUI", (Intent)localObject4);
          GMTrace.o(2422361554944L, 18048);
          return;
        }
        w.i("MicroMsg.GalleryGridUI", "topic id is zero.");
        GMTrace.o(2422361554944L, 18048);
        return;
      }
      w.i("MicroMsg.GalleryGridUI", "talker:%s, msgId:%s, msgType:%s, msgContent:%s", new Object[] { localau.field_talker, Long.valueOf(localau.field_msgId), Integer.valueOf(localau.field_type), localau.field_content });
      if ((paramAdapterView.url != null) && (!paramAdapterView.url.equals("")) && (paramAdapterView.url != null) && (!paramAdapterView.url.equals("")))
      {
        localObject1 = paramAdapterView.url;
        if (!s.eb(this.eDs)) {
          break label3818;
        }
        paramView = "groupmessage";
        localObject3 = com.tencent.mm.pluginsdk.model.app.p.s((String)localObject1, paramView);
        paramView = paramAdapterView.url;
        localObject2 = getPackageInfo(this.vKB.vKW, paramAdapterView.appId);
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("rawUrl", (String)localObject3);
        ((Intent)localObject1).putExtra("webpageTitle", paramAdapterView.title);
        if ((paramAdapterView.appId != null) && (("wx751a1acca5688ba3".equals(paramAdapterView.appId)) || ("wxfbc915ff7c30e335".equals(paramAdapterView.appId)) || ("wx482a4001c37e2b74".equals(paramAdapterView.appId))))
        {
          localObject3 = new Bundle();
          ((Bundle)localObject3).putString("jsapi_args_appid", paramAdapterView.appId);
          ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject3);
        }
        if (bg.nm(paramView)) {
          break label3825;
        }
        ((Intent)localObject1).putExtra("shortUrl", paramView);
        label3545:
        if (localObject2 != null) {
          break label3841;
        }
        paramView = null;
        label3552:
        ((Intent)localObject1).putExtra("version_name", paramView);
        if (localObject2 != null) {
          break label3850;
        }
      }
      label3818:
      label3825:
      label3841:
      label3850:
      for (paramInt = 0;; paramInt = ((PackageInfo)localObject2).versionCode)
      {
        ((Intent)localObject1).putExtra("version_code", paramInt);
        if (!bg.nm(paramAdapterView.eTo))
        {
          ((Intent)localObject1).putExtra("srcUsername", paramAdapterView.eTo);
          ((Intent)localObject1).putExtra("srcDisplayname", paramAdapterView.eTp);
        }
        ((Intent)localObject1).putExtra("msg_id", localau.field_msgId);
        ((Intent)localObject1).putExtra("KPublisherId", "msg_" + Long.toString(localau.field_msgSvrId));
        ((Intent)localObject1).putExtra("KAppId", paramAdapterView.appId);
        ((Intent)localObject1).putExtra("geta8key_username", com.tencent.mm.y.q.zE());
        ((Intent)localObject1).putExtra("pre_username", bj(localau));
        ((Intent)localObject1).putExtra("prePublishId", "msg_" + Long.toString(localau.field_msgSvrId));
        paramAdapterView = bj(localau);
        paramView = com.tencent.mm.y.q.zE();
        ((Intent)localObject1).putExtra("preUsername", paramAdapterView);
        ((Intent)localObject1).putExtra("preChatName", paramView);
        ((Intent)localObject1).putExtra("preChatTYPE", com.tencent.mm.y.t.H(paramAdapterView, paramView));
        ((Intent)localObject1).putExtra("preMsgIndex", 0);
        com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
        GMTrace.o(2422361554944L, 18048);
        return;
        paramView = "singlemessage";
        break;
        ((Intent)localObject1).putExtra("shortUrl", paramAdapterView.url);
        break label3545;
        paramView = ((PackageInfo)localObject2).versionName;
        break label3552;
      }
    }
  }
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    GMTrace.i(2423435296768L, 18056);
    if (paramMenuItem.getTitle().equals(getString(R.l.dyL)))
    {
      g.a.wMg.clear();
      ceQ();
    }
    for (;;)
    {
      GMTrace.o(2423435296768L, 18056);
      return false;
      ceR();
    }
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(2421690466304L, 18043);
    setIntent(paramIntent);
    super.onNewIntent(paramIntent);
    Dp(1);
    GMTrace.o(2421690466304L, 18043);
  }
  
  protected void onPause()
  {
    GMTrace.i(2421556248576L, 18042);
    g localg = g.a.wMg;
    if (this != null) {
      localg.wMf.remove(this);
    }
    this.mIsPause = true;
    super.onPause();
    GMTrace.o(2421556248576L, 18042);
  }
  
  public boolean onPreDraw()
  {
    GMTrace.i(2423301079040L, 18055);
    final Object localObject1 = (c.a)this.wLo.get();
    if (localObject1 == null)
    {
      GMTrace.o(2423301079040L, 18055);
      return true;
    }
    final Object localObject2 = ((c.a)localObject1).oOJ.getViewTreeObserver();
    if (!((ViewTreeObserver)localObject2).isAlive())
    {
      GMTrace.o(2423301079040L, 18055);
      return true;
    }
    ((ViewTreeObserver)localObject2).removeOnPreDrawListener(this);
    int i = ((c.a)localObject1).oOJ.getMeasuredWidth();
    int j = ((c.a)localObject1).oOJ.getMeasuredHeight();
    if ((i <= 0) || (j <= 0))
    {
      GMTrace.o(2423301079040L, 18055);
      return true;
    }
    localObject2 = (RelativeLayout.LayoutParams)((c.a)localObject1).wHW.getLayoutParams();
    ((ViewGroup.LayoutParams)localObject2).width = i;
    ((ViewGroup.LayoutParams)localObject2).height = j;
    ((c.a)localObject1).wHW.setLayoutParams((ViewGroup.LayoutParams)localObject2);
    localObject1 = ((c.a)localObject1).wHW;
    localObject2 = new DecelerateInterpolator();
    if (Build.VERSION.SDK_INT >= 12)
    {
      this.wLw = ((View)localObject1);
      this.handler.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2445044350976L, 18217);
          if (Build.VERSION.SDK_INT >= 16)
          {
            localObject1.animate().setDuration(500L).alpha(0.0F).withEndAction(ImageGalleryGridUI.this.wLv).withLayer().setInterpolator(localObject2);
            GMTrace.o(2445044350976L, 18217);
            return;
          }
          if (ImageGalleryGridUI.this.handler == null)
          {
            GMTrace.o(2445044350976L, 18217);
            return;
          }
          localObject1.animate().setDuration(500L).alpha(0.0F).setInterpolator(localObject2);
          ImageGalleryGridUI.this.handler.postDelayed(ImageGalleryGridUI.this.wLv, 500L);
          GMTrace.o(2445044350976L, 18217);
        }
      }, 700L);
    }
    GMTrace.o(2423301079040L, 18055);
    return true;
  }
  
  protected void onResume()
  {
    GMTrace.i(2421422030848L, 18041);
    g.a.wMg.a(this);
    this.mIsPause = false;
    if (this.wLu)
    {
      if (!g.a.wMg.wMe) {
        break label149;
      }
      ceQ();
    }
    for (;;)
    {
      this.handler.postDelayed(this.wLt, 300L);
      super.onResume();
      if (this.wLn != null)
      {
        this.wLn.wLe = true;
        c localc = this.wLn;
        if (localc.wLe) {
          localc.notifyDataSetChanged();
        }
        if (g.a.wMg.wMe) {
          sq(getString(R.l.dzp, new Object[] { Integer.valueOf(g.a.wMg.wKD.size()) }));
        }
      }
      this.wLu = false;
      cfl();
      GMTrace.o(2421422030848L, 18041);
      return;
      label149:
      ceR();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\gallery\ImageGalleryGridUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */