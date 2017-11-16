package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.g.a;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.l;
import com.tencent.mm.plugin.game.model.l.b;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class GameInstalledView
  extends LinearLayout
  implements View.OnClickListener
{
  private static Map<String, Integer> lYQ;
  private static int lYS;
  private static int lYT;
  private int count;
  int lNQ;
  LinkedList<com.tencent.mm.pluginsdk.model.app.f> lOh;
  private TextView lTq;
  l.b lWM;
  private LinearLayout lYN;
  private ImageView lYO;
  private TextView lYP;
  private final DisplayMetrics lYR;
  private int lYU;
  private int lYV;
  private int lYW;
  a lYX;
  LinkedList<com.tencent.mm.plugin.game.model.c> lYY;
  LinearLayout.LayoutParams lYZ;
  private Context mContext;
  
  static
  {
    GMTrace.i(12750147289088L, 94996);
    lYQ = new HashMap();
    lYS = 6;
    lYT = 7;
    GMTrace.o(12750147289088L, 94996);
  }
  
  public GameInstalledView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12748805111808L, 94986);
    this.lOh = new LinkedList();
    this.lYR = new DisplayMetrics();
    this.lYU = 4;
    this.count = 0;
    this.lNQ = 0;
    this.lYV = 1;
    this.lYW = 999;
    this.lYZ = new LinearLayout.LayoutParams(-1, -2);
    this.lWM = new l.b()
    {
      public final void g(int paramAnonymousInt, String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(12739812524032L, 94919);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(12739812524032L, 94919);
          return;
          GMTrace.o(12739812524032L, 94919);
          return;
          SubCoreGameCenter.aGl().init(GameInstalledView.d(GameInstalledView.this));
          GameInstalledView.this.ed(false);
        }
      }
    };
    this.mContext = paramContext;
    GMTrace.o(12748805111808L, 94986);
  }
  
  private void aGB()
  {
    GMTrace.i(12749207764992L, 94989);
    if (bg.cc(this.lOh))
    {
      setVisibility(8);
      GMTrace.o(12749207764992L, 94989);
      return;
    }
    setVisibility(0);
    this.lYN.removeAllViews();
    this.count = 0;
    final Object localObject1 = (LayoutInflater)getContext().getSystemService("layout_inflater");
    int j;
    int i;
    int k;
    Object localObject2;
    label280:
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (this.lOh.size() >= this.lYU - 1)
    {
      lYT = 7;
      lYS = 6;
      j = BackwardSupportUtil.b.a(this.mContext, (lYS << 1) + 84);
      ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getMetrics(this.lYR);
      i = (int)(this.lYR.widthPixels * 160 / this.lYR.densityDpi);
      this.lYU = ((this.lYR.widthPixels - 1) / j + 1);
      if (this.lYU == 3) {
        lYT = 3;
      }
      j = (lYS << 1) + 84;
      k = lYS + 6 + lYT;
      i = (i - 16) % j;
      if (i < k)
      {
        lYS -= 2;
        BackwardSupportUtil.b.a(this.mContext, (lYS << 1) + 84);
      }
    }
    else
    {
      this.lYZ.setMargins(BackwardSupportUtil.b.a(this.mContext, lYS), 0, BackwardSupportUtil.b.a(this.mContext, lYS), 0);
      localObject2 = this.lOh.iterator();
      if (!((Iterator)localObject2).hasNext()) {
        break label710;
      }
      localObject3 = (com.tencent.mm.pluginsdk.model.app.f)((Iterator)localObject2).next();
      localObject4 = ((LayoutInflater)localObject1).inflate(R.i.czQ, null);
      this.lYO = ((ImageView)((View)localObject4).findViewById(R.h.bEd));
      this.lTq = ((TextView)((View)localObject4).findViewById(R.h.bEK));
      this.lYP = ((TextView)((View)localObject4).findViewById(R.h.bEW));
      localObject5 = com.tencent.mm.pluginsdk.model.app.g.b(((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_appId, 1, com.tencent.mm.br.a.getDensity(this.mContext));
      if (localObject5 == null) {
        break label592;
      }
      this.lYO.setImageBitmap((Bitmap)localObject5);
      label390:
      this.lTq.setText(com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, (com.tencent.mm.pluginsdk.model.app.f)localObject3, null));
      if (!com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, (com.tencent.mm.pluginsdk.model.app.f)localObject3)) {
        break label677;
      }
      i = com.tencent.mm.plugin.game.d.c.zU(((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_packageName);
      if ((!lYQ.containsKey(((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_appId)) || (((Integer)lYQ.get(((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_appId)).intValue() <= i)) {
        break label618;
      }
      localObject5 = com.tencent.mm.plugin.downloader.model.f.apJ().vv(((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_appId);
      this.lYP.setTextColor(this.mContext.getResources().getColor(R.e.aNM));
      if (((FileDownloadTaskInfo)localObject5).status != 1) {
        break label605;
      }
      this.lYP.setText(R.l.dzC);
    }
    for (;;)
    {
      ((View)localObject4).setTag(localObject3);
      ((View)localObject4).setOnClickListener(this);
      this.lYN.addView((View)localObject4, this.lYZ);
      break label280;
      if (i <= j - k) {
        break;
      }
      lYS = (i - (j >> 1)) / this.lYU + lYS;
      BackwardSupportUtil.b.a(this.mContext, (lYS << 1) + 84);
      break;
      label592:
      this.lYO.setImageResource(R.g.aTM);
      break label390;
      label605:
      this.lYP.setText(R.l.dzB);
      continue;
      label618:
      if (!bg.nm(((com.tencent.mm.g.b.n)localObject3).fdP))
      {
        this.lYP.setText(((com.tencent.mm.g.b.n)localObject3).fdP);
        this.lYP.setTextColor(this.mContext.getResources().getColor(R.e.aNP));
      }
      else
      {
        this.lYP.setText("");
        continue;
        label677:
        this.lYP.setTextColor(this.mContext.getResources().getColor(R.e.aNM));
        this.lYP.setText(R.l.dAc);
      }
    }
    label710:
    if ((this.lYX != null) && (this.lYX.iconUrl != null) && (this.lYX.title != null))
    {
      localObject1 = ((LayoutInflater)localObject1).inflate(R.i.czQ, null);
      this.lYO = ((ImageView)((View)localObject1).findViewById(R.h.bEd));
      this.lTq = ((TextView)((View)localObject1).findViewById(R.h.bEK));
      this.lYP = ((TextView)((View)localObject1).findViewById(R.h.bEW));
      localObject2 = com.tencent.mm.ao.n.Jd();
      localObject3 = this.lYX.iconUrl;
      localObject4 = this.lYO;
      localObject5 = new c.a();
      ((c.a)localObject5).gKB = true;
      ((com.tencent.mm.ao.a.a)localObject2).a((String)localObject3, (ImageView)localObject4, ((c.a)localObject5).Jn(), new com.tencent.mm.ao.a.c.g()
      {
        public final void a(String paramAnonymousString, View paramAnonymousView, com.tencent.mm.ao.a.d.b paramAnonymousb)
        {
          GMTrace.i(12663979507712L, 94354);
          if (paramAnonymousb.status == 0) {
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(12696997068800L, 94600);
                if (GameInstalledView.a(GameInstalledView.this) == 0)
                {
                  GameInstalledView.b(GameInstalledView.this);
                  GameInstalledView.c(GameInstalledView.this).addView(GameInstalledView.1.this.yV, GameInstalledView.this.lYZ);
                }
                GMTrace.o(12696997068800L, 94600);
              }
            });
          }
          GMTrace.o(12663979507712L, 94354);
        }
        
        public final void ku(String paramAnonymousString)
        {
          GMTrace.i(12663845289984L, 94353);
          GMTrace.o(12663845289984L, 94353);
        }
      });
      this.lTq.setText(this.lYX.title);
      this.lYP.setVisibility(8);
      ((View)localObject1).setTag(this.lYX);
      ((View)localObject1).setOnClickListener(this);
    }
    GMTrace.o(12749207764992L, 94989);
  }
  
  public static void v(Map<String, Integer> paramMap)
  {
    GMTrace.i(12749341982720L, 94990);
    if ((paramMap == null) || (paramMap.isEmpty()))
    {
      GMTrace.o(12749341982720L, 94990);
      return;
    }
    lYQ = paramMap;
    GMTrace.o(12749341982720L, 94990);
  }
  
  public final void ed(boolean paramBoolean)
  {
    GMTrace.i(12749073547264L, 94988);
    if (bg.cc(this.lYY))
    {
      setVisibility(8);
      GMTrace.o(12749073547264L, 94988);
      return;
    }
    setVisibility(0);
    Object localObject1;
    Object localObject2;
    if (paramBoolean)
    {
      this.lOh = com.tencent.mm.plugin.game.model.e.aFe();
      if ((!bg.cc(this.lYY)) && (!bg.cc(this.lOh)))
      {
        localObject1 = this.lYY.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (com.tencent.mm.plugin.game.model.c)((Iterator)localObject1).next();
          if (this.lOh.contains(localObject2))
          {
            this.lOh.remove(localObject2);
            this.lOh.addFirst(localObject2);
          }
        }
      }
    }
    else
    {
      localObject1 = new LinkedList();
      ((LinkedList)localObject1).addAll(this.lOh);
      Object localObject3 = new LinkedList();
      ((LinkedList)localObject3).addAll(com.tencent.mm.plugin.game.model.e.aFe());
      localObject2 = new LinkedList();
      Object localObject4 = ((LinkedList)localObject1).iterator();
      com.tencent.mm.pluginsdk.model.app.f localf;
      while (((Iterator)localObject4).hasNext())
      {
        localf = (com.tencent.mm.pluginsdk.model.app.f)((Iterator)localObject4).next();
        if ((!((LinkedList)localObject3).contains(localf)) && (!((LinkedList)localObject2).contains(localf))) {
          ((LinkedList)localObject2).add(localf);
        }
      }
      localObject4 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localf = (com.tencent.mm.pluginsdk.model.app.f)((Iterator)localObject4).next();
        if (((LinkedList)localObject3).contains(localf)) {
          ((LinkedList)localObject3).remove(localf);
        } else if (!com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, localf)) {
          ((LinkedList)localObject2).add(localf);
        }
      }
      if (((LinkedList)localObject3).size() > 0)
      {
        localObject3 = ((LinkedList)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject4 = (com.tencent.mm.pluginsdk.model.app.f)((Iterator)localObject3).next();
          if (!((LinkedList)localObject1).contains(localObject4)) {
            ((LinkedList)localObject1).addFirst(localObject4);
          }
        }
      }
      if (((LinkedList)localObject2).size() > 0) {
        ((LinkedList)localObject1).removeAll((Collection)localObject2);
      }
      localObject2 = new LinkedList();
      localObject1 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((LinkedList)localObject2).add(com.tencent.mm.pluginsdk.model.app.g.aP(((com.tencent.mm.pluginsdk.model.app.f)((Iterator)localObject1).next()).field_appId, true));
      }
      this.lOh = ((LinkedList)localObject2);
    }
    aGB();
    GMTrace.o(12749073547264L, 94988);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12749476200448L, 94991);
    if (paramView.getTag() == null)
    {
      GMTrace.o(12749476200448L, 94991);
      return;
    }
    int i;
    Object localObject;
    if ((paramView.getTag() instanceof com.tencent.mm.pluginsdk.model.app.f))
    {
      paramView = (com.tencent.mm.pluginsdk.model.app.f)paramView.getTag();
      if ((paramView == null) || (bg.nm(paramView.field_appId)))
      {
        w.e("MicroMsg.GameInstalledView", "appinfo is null or appid is null");
        GMTrace.o(12749476200448L, 94991);
        return;
      }
      if (com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, paramView))
      {
        i = com.tencent.mm.plugin.game.d.c.zU(paramView.field_packageName);
        if ((lYQ.containsKey(paramView.field_appId)) && (((Integer)lYQ.get(paramView.field_appId)).intValue() > i))
        {
          localObject = com.tencent.mm.plugin.downloader.model.f.apJ().vv(paramView.field_appId);
          if (((FileDownloadTaskInfo)localObject).status == 1) {
            com.tencent.mm.plugin.downloader.model.f.apJ().bf(((FileDownloadTaskInfo)localObject).id);
          }
        }
        for (;;)
        {
          ed(false);
          GMTrace.o(12749476200448L, 94991);
          return;
          if (((FileDownloadTaskInfo)localObject).status == 3)
          {
            if ((com.tencent.mm.a.e.aZ(((FileDownloadTaskInfo)localObject).path)) && (com.tencent.mm.plugin.game.d.c.zV(((FileDownloadTaskInfo)localObject).path) > i))
            {
              paramView = Uri.fromFile(new File(((FileDownloadTaskInfo)localObject).path));
              q.e(this.mContext, paramView);
            }
            else
            {
              com.tencent.mm.plugin.downloader.model.f.apJ().bf(((FileDownloadTaskInfo)localObject).id);
            }
          }
          else
          {
            l.a(paramView.fdL, paramView.fdQ, 1002, paramView.field_appId, "");
            localObject = new g.a();
            ((g.a)localObject).vy(paramView.fdL);
            ((g.a)localObject).vA(com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, paramView, null));
            ((g.a)localObject).setAppId(paramView.field_appId);
            ((g.a)localObject).vB(paramView.fdQ);
            ((g.a)localObject).dJ(true);
            ((g.a)localObject).mt(1);
            com.tencent.mm.plugin.downloader.model.f.apJ().a(((g.a)localObject).kfx);
            continue;
            com.tencent.mm.plugin.game.model.e.V(this.mContext, paramView.field_appId);
            ai.a(this.mContext, 10, 1002, this.lYV, 3, 0, paramView.field_appId, this.lNQ, 0, null, null, null);
            this.lOh.remove(paramView);
            this.lOh.addFirst(paramView);
          }
        }
      }
      localObject = com.tencent.mm.plugin.downloader.model.f.apJ().vv(paramView.field_appId);
      if ((localObject != null) && (((FileDownloadTaskInfo)localObject).status == 3))
      {
        if ((!bg.nm(((FileDownloadTaskInfo)localObject).path)) && (com.tencent.mm.a.e.aZ(((FileDownloadTaskInfo)localObject).path)))
        {
          paramView = Uri.fromFile(new File(((FileDownloadTaskInfo)localObject).path));
          q.e(this.mContext, paramView);
          GMTrace.o(12749476200448L, 94991);
          return;
        }
        w.e("MicroMsg.GameInstalledView", "file status is success, while the download file not exsit:[%s]", new Object[] { ((FileDownloadTaskInfo)localObject).path });
        com.tencent.mm.plugin.downloader.model.f.apJ().bf(((FileDownloadTaskInfo)localObject).id);
        ed(false);
        GMTrace.o(12749476200448L, 94991);
        return;
      }
      w.i("MicroMsg.GameInstalledView", "app not installed or download sucess : [%s]", new Object[] { paramView.field_appName });
      ed(false);
      GMTrace.o(12749476200448L, 94991);
      return;
    }
    if ((paramView.getTag() instanceof a))
    {
      paramView = (a)paramView.getTag();
      localObject = new Intent();
      i = 6;
      if (!bg.nm(paramView.hZW)) {
        break label661;
      }
      ((Intent)localObject).setClass(this.mContext, GameLibraryUI.class);
      ((Intent)localObject).putExtra("game_report_from_scene", 1002);
      this.mContext.startActivity((Intent)localObject);
    }
    for (;;)
    {
      ai.a(this.mContext, 10, 1002, this.lYW, i, 0, null, this.lNQ, 0, null, null, null);
      GMTrace.o(12749476200448L, 94991);
      return;
      label661:
      i = com.tencent.mm.plugin.game.d.c.p(this.mContext, paramView.hZW, "game_center_installed_more");
    }
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12748939329536L, 94987);
    super.onFinishInflate();
    this.lYN = ((LinearLayout)findViewById(R.h.bEh));
    l.a(this.lWM);
    GMTrace.o(12748939329536L, 94987);
  }
  
  public static final class a
  {
    public String hZW;
    public String iconUrl;
    public String title;
    
    public a()
    {
      GMTrace.i(12696728633344L, 94598);
      this.iconUrl = "";
      this.title = "";
      this.hZW = "";
      GMTrace.o(12696728633344L, 94598);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameInstalledView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */