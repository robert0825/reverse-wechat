package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.g.a;
import com.tencent.mm.plugin.downloader.model.n;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.pluginsdk.model.u;
import com.tencent.mm.pluginsdk.model.u.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@com.tencent.mm.ui.base.a(7)
public class AppChooserUI
  extends MMActivity
{
  private DialogInterface.OnDismissListener Fk;
  private PackageManager aDT;
  private String mimeType;
  private int scene;
  private View.OnClickListener tFA;
  private n tFB;
  a tFf;
  private Intent tFg;
  private int tFh;
  private String tFi;
  private Bundle tFj;
  private com.tencent.mm.pluginsdk.model.t tFk;
  private ArrayList<String> tFl;
  private c tFm;
  private c tFn;
  private List<c> tFo;
  private String tFp;
  private int tFq;
  private int tFr;
  private boolean tFs;
  private boolean tFt;
  private boolean tFu;
  private long tFv;
  private e tFw;
  private AdapterView.OnItemClickListener tFx;
  private DialogInterface.OnClickListener tFy;
  private DialogInterface.OnClickListener tFz;
  
  public AppChooserUI()
  {
    GMTrace.i(1142058647552L, 8509);
    this.tFg = null;
    this.tFi = null;
    this.tFj = null;
    this.tFk = null;
    this.tFl = null;
    this.scene = 0;
    this.tFm = null;
    this.tFn = new c();
    this.mimeType = null;
    this.tFs = false;
    this.tFt = false;
    this.tFu = false;
    this.tFx = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(1125684084736L, 8387);
        if (AppChooserUI.a(AppChooserUI.this) != null)
        {
          AppChooserUI.a(AppChooserUI.this, AppChooserUI.a(AppChooserUI.this).zH(paramAnonymousInt));
          AppChooserUI.a(AppChooserUI.this).notifyDataSetChanged();
          if ((AppChooserUI.b(AppChooserUI.this) != null) && (AppChooserUI.b(AppChooserUI.this).hwF.isShowing()))
          {
            if ((AppChooserUI.c(AppChooserUI.this) == null) || (!AppChooserUI.c(AppChooserUI.this).tFJ) || ((AppChooserUI.c(AppChooserUI.this).mhC) && ((AppChooserUI.c(AppChooserUI.this).qBD) || (AppChooserUI.d(AppChooserUI.this) >= AppChooserUI.e(AppChooserUI.this))))) {
              break label270;
            }
            AppChooserUI.b(AppChooserUI.this).kt(false);
          }
        }
        for (;;)
        {
          if (((AppChooserUI.f(AppChooserUI.this) == 6) || (AppChooserUI.g(AppChooserUI.this) == 2)) && (AppChooserUI.c(AppChooserUI.this) != null) && (AppChooserUI.c(AppChooserUI.this).tFG != null))
          {
            AppChooserUI.a(AppChooserUI.this, AppChooserUI.c(AppChooserUI.this).tFG.activityInfo.packageName, false);
            g.ork.i(12809, new Object[] { Integer.valueOf(4), AppChooserUI.c(AppChooserUI.this).tFG.activityInfo.packageName });
          }
          GMTrace.o(1125684084736L, 8387);
          return;
          label270:
          AppChooserUI.b(AppChooserUI.this).kt(true);
        }
      }
    };
    this.tFy = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(16681652977664L, 124288);
        if ((AppChooserUI.c(AppChooserUI.this) != null) && (AppChooserUI.c(AppChooserUI.this).tFG != null))
        {
          at.AR();
          com.tencent.mm.y.c.xh().set(AppChooserUI.a(AppChooserUI.this, 274528), AppChooserUI.c(AppChooserUI.this).tFG.activityInfo.packageName);
          AppChooserUI.a(AppChooserUI.this, AppChooserUI.c(AppChooserUI.this).tFG.activityInfo.packageName, true);
        }
        GMTrace.o(16681652977664L, 124288);
      }
    };
    this.tFz = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(16681787195392L, 124289);
        if ((AppChooserUI.c(AppChooserUI.this) != null) && (AppChooserUI.c(AppChooserUI.this).tFG != null)) {
          AppChooserUI.a(AppChooserUI.this, AppChooserUI.c(AppChooserUI.this).tFG.activityInfo.packageName, false);
        }
        GMTrace.o(16681787195392L, 124289);
      }
    };
    this.tFA = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1132931842048L, 8441);
        w.i("MicroMsg.AppChooserUI", "mDownloadOnClickListener");
        if (AppChooserUI.a(AppChooserUI.this) != null)
        {
          int i = AppChooserUI.a(AppChooserUI.this).tFD;
          if (i == AppChooserUI.f.tFO)
          {
            if ((AppChooserUI.b(AppChooserUI.this) != null) && (AppChooserUI.b(AppChooserUI.this).hwF.isShowing()))
            {
              AppChooserUI.a(AppChooserUI.this).tFD = AppChooserUI.f.tFP;
              AppChooserUI.a(AppChooserUI.this).notifyDataSetChanged();
            }
            paramAnonymousView = new g.a();
            if (AppChooserUI.f(AppChooserUI.this) == 1)
            {
              paramAnonymousView.vy("http://mdc.html5.qq.com/d/directdown.jsp?channel_id=10375");
              paramAnonymousView.vA(AppChooserUI.h(AppChooserUI.this).bJc());
              paramAnonymousView.mt(1);
              paramAnonymousView.dJ(true);
              com.tencent.mm.plugin.downloader.model.f.apJ().a(paramAnonymousView.kfx);
              u.bJl();
              u.yP(AppChooserUI.g(AppChooserUI.this));
              if (AppChooserUI.g(AppChooserUI.this) == 0)
              {
                if (!AppChooserUI.i(AppChooserUI.this)) {
                  break label283;
                }
                g.ork.i(11168, new Object[] { Integer.valueOf(4), Integer.valueOf(AppChooserUI.f(AppChooserUI.this)) });
              }
            }
            for (;;)
            {
              if (AppChooserUI.g(AppChooserUI.this) == 1) {
                g.ork.i(12809, new Object[] { Integer.valueOf(5), "" });
              }
              GMTrace.o(1132931842048L, 8441);
              return;
              paramAnonymousView.vy(AppChooserUI.h(AppChooserUI.this).Pn());
              break;
              label283:
              g.ork.i(11168, new Object[] { Integer.valueOf(3), Integer.valueOf(AppChooserUI.f(AppChooserUI.this)) });
            }
          }
          if (i == AppChooserUI.f.tFQ)
          {
            paramAnonymousView = AppChooserUI.this;
            long l = AppChooserUI.j(AppChooserUI.this);
            w.i("MicroMsg.AppChooserUI", "installRecommendApp");
            Object localObject = com.tencent.mm.plugin.downloader.model.f.apJ().bg(l).path;
            w.d("MicroMsg.AppChooserUI", "filepath:%s", new Object[] { localObject });
            localObject = new File((String)localObject);
            if (!q.e(paramAnonymousView.vKB.vKW, Uri.fromFile((File)localObject)))
            {
              at.AR();
              com.tencent.mm.y.c.xh().set(paramAnonymousView.zG(274560), Long.valueOf(0L));
              if (paramAnonymousView.tFf != null)
              {
                paramAnonymousView.tFf.tFD = AppChooserUI.f.tFO;
                paramAnonymousView.tFf.notifyDataSetChanged();
                GMTrace.o(1132931842048L, 8441);
              }
            }
            else if (paramAnonymousView.tFf != null)
            {
              paramAnonymousView.tFf.tFD = AppChooserUI.f.tFQ;
              paramAnonymousView.tFf.notifyDataSetChanged();
            }
          }
        }
        GMTrace.o(1132931842048L, 8441);
      }
    };
    this.Fk = new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(1147830009856L, 8552);
        AppChooserUI.this.finish();
        GMTrace.o(1147830009856L, 8552);
      }
    };
    this.tFB = new n()
    {
      public final void bs(long paramAnonymousLong)
      {
        GMTrace.i(1115751972864L, 8313);
        GMTrace.o(1115751972864L, 8313);
      }
      
      public final void c(long paramAnonymousLong, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        GMTrace.i(1115483537408L, 8311);
        w.d("MicroMsg.AppChooserUI", "onTaskFailed downloadId:%s", new Object[] { Long.valueOf(paramAnonymousLong) });
        at.AR();
        com.tencent.mm.y.c.xh().set(AppChooserUI.a(AppChooserUI.this, 274560), Long.valueOf(0L));
        if (AppChooserUI.a(AppChooserUI.this) != null)
        {
          AppChooserUI.a(AppChooserUI.this).tFD = AppChooserUI.f.tFO;
          AppChooserUI.a(AppChooserUI.this).notifyDataSetChanged();
        }
        GMTrace.o(1115483537408L, 8311);
      }
      
      public final void c(long paramAnonymousLong, String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(1115349319680L, 8310);
        w.d("MicroMsg.AppChooserUI", "onTaskFinished downloadId: %d, savedPath: %s", new Object[] { Long.valueOf(paramAnonymousLong), paramAnonymousString });
        if ((!bg.nm(paramAnonymousString)) && (e.aZ(paramAnonymousString)))
        {
          at.AR();
          com.tencent.mm.y.c.xh().set(AppChooserUI.a(AppChooserUI.this, 274560), Long.valueOf(AppChooserUI.j(AppChooserUI.this)));
          if ((AppChooserUI.a(AppChooserUI.this) != null) && (AppChooserUI.j(AppChooserUI.this) == paramAnonymousLong))
          {
            AppChooserUI.a(AppChooserUI.this).tFD = AppChooserUI.f.tFQ;
            AppChooserUI.a(AppChooserUI.this).notifyDataSetChanged();
          }
        }
        GMTrace.o(1115349319680L, 8310);
      }
      
      public final void k(long paramAnonymousLong, String paramAnonymousString)
      {
        GMTrace.i(14301838442496L, 106557);
        GMTrace.o(14301838442496L, 106557);
      }
      
      public final void onTaskPaused(long paramAnonymousLong)
      {
        GMTrace.i(1115617755136L, 8312);
        w.d("MicroMsg.AppChooserUI", "onTaskPaused downloadId:%s", new Object[] { Long.valueOf(paramAnonymousLong) });
        at.AR();
        com.tencent.mm.y.c.xh().set(AppChooserUI.a(AppChooserUI.this, 274560), Long.valueOf(0L));
        if (AppChooserUI.a(AppChooserUI.this) != null)
        {
          AppChooserUI.a(AppChooserUI.this).tFD = AppChooserUI.f.tFO;
          AppChooserUI.a(AppChooserUI.this).notifyDataSetChanged();
        }
        GMTrace.o(1115617755136L, 8312);
      }
      
      public final void onTaskRemoved(long paramAnonymousLong)
      {
        GMTrace.i(1115215101952L, 8309);
        w.d("MicroMsg.AppChooserUI", "onTaskRemove downloadId:%s", new Object[] { Long.valueOf(paramAnonymousLong) });
        GMTrace.o(1115215101952L, 8309);
      }
      
      public final void onTaskStarted(long paramAnonymousLong, String paramAnonymousString)
      {
        GMTrace.i(1115080884224L, 8308);
        AppChooserUI.a(AppChooserUI.this, paramAnonymousLong);
        at.AR();
        com.tencent.mm.y.c.xh().set(AppChooserUI.a(AppChooserUI.this, 274560), Long.valueOf(AppChooserUI.j(AppChooserUI.this)));
        w.d("MicroMsg.AppChooserUI", "onTaskStarted downloadId:%s savedFilePath:%s", new Object[] { String.valueOf(paramAnonymousLong), paramAnonymousString });
        GMTrace.o(1115080884224L, 8308);
      }
    };
    GMTrace.o(1142058647552L, 8509);
  }
  
  private static Drawable a(Resources paramResources, int paramInt)
  {
    GMTrace.i(1143535042560L, 8520);
    try
    {
      paramResources = com.tencent.mm.bs.a.b(paramResources, paramInt);
      GMTrace.o(1143535042560L, 8520);
      return paramResources;
    }
    catch (Resources.NotFoundException paramResources)
    {
      for (;;)
      {
        paramResources = null;
      }
    }
  }
  
  private List<c> a(Intent paramIntent, boolean paramBoolean, ArrayList<String> paramArrayList)
  {
    GMTrace.i(1143400824832L, 8519);
    ArrayList localArrayList = new ArrayList();
    paramIntent = this.aDT.queryIntentActivities(paramIntent, 65536);
    Object localObject = this.tFk.bJd();
    label112:
    int j;
    int i;
    int k;
    if (!bg.nm(((u.a)localObject).tnt))
    {
      this.tFi = ((u.a)localObject).tnt;
      if (((u.a)localObject).tnr > 0) {
        this.tFn.tFI = getResources().getDrawable(((u.a)localObject).tnr);
      }
      if (((u.a)localObject).tnu <= 0) {
        break label396;
      }
      this.tFn.tFH = getResources().getString(((u.a)localObject).tnu);
      this.tFn.tFJ = true;
      this.tFn.qBD = this.tFs;
      if (this.tFs) {
        this.tFn.mhC = true;
      }
      if (this.tFt) {
        this.tFn.tFK = true;
      }
      j = 0;
      i = 0;
      k = j;
      if (paramIntent == null) {
        break label448;
      }
      k = j;
      if (paramIntent.size() <= 0) {
        break label448;
      }
      int m = paramIntent.size();
      j = 0;
      label199:
      k = i;
      if (j >= m) {
        break label448;
      }
      w.d("MicroMsg.AppChooserUI", "cpan name:%s", new Object[] { ((ResolveInfo)paramIntent.get(j)).activityInfo.name });
      localObject = (ResolveInfo)paramIntent.get(j);
      if (localObject == null) {
        break label445;
      }
      String str = ((ResolveInfo)localObject).activityInfo.packageName;
      if ((paramArrayList != null) && (!paramArrayList.isEmpty()) && (!paramArrayList.contains(str))) {
        break label445;
      }
      if (!this.tFk.Og(str)) {
        break label411;
      }
      this.tFn.tFG = ((ResolveInfo)localObject);
      this.tFn.mhC = true;
      if (((paramBoolean) || (!this.tFs)) && ((paramBoolean) || (!this.tFn.mhC))) {
        break label445;
      }
      localArrayList.add(0, this.tFn);
      i = 1;
    }
    label396:
    label411:
    label445:
    for (;;)
    {
      j += 1;
      break label199;
      if (((u.a)localObject).tns <= 0) {
        break;
      }
      this.tFi = getResources().getString(((u.a)localObject).tns);
      break;
      this.tFn.tFH = ((u.a)localObject).tnv;
      break label112;
      localArrayList.add(new c((ResolveInfo)localObject, this.tFk.a(this.vKB.vKW, (ResolveInfo)localObject)));
    }
    label448:
    if ((paramBoolean) && (k == 0))
    {
      if ((this.tFh != 0) || (this.mimeType == null)) {
        break label642;
      }
      localArrayList.add(0, this.tFn);
      if (!this.tFt) {
        break label609;
      }
      g.ork.i(11168, new Object[] { Integer.valueOf(2), Integer.valueOf(this.scene) });
    }
    for (;;)
    {
      paramIntent = new HashSet();
      i = localArrayList.size() - 1;
      while (i >= 0)
      {
        paramArrayList = (c)localArrayList.get(i);
        if (paramArrayList.tFG != null)
        {
          paramArrayList = paramArrayList.tFG.activityInfo.packageName;
          if ((!bg.nm(paramArrayList)) && (!paramIntent.add(paramArrayList))) {
            localArrayList.remove(i);
          }
        }
        i -= 1;
      }
      label609:
      g.ork.i(11168, new Object[] { Integer.valueOf(1), Integer.valueOf(this.scene) });
      continue;
      label642:
      localArrayList.add(0, this.tFn);
    }
    GMTrace.o(1143400824832L, 8519);
    return localArrayList;
  }
  
  private int bNf()
  {
    GMTrace.i(1142998171648L, 8516);
    int i = this.tFh;
    GMTrace.o(1142998171648L, 8516);
    return 274496 + i;
  }
  
  private boolean bNg()
  {
    GMTrace.i(1143266607104L, 8518);
    w.d("MicroMsg.AppChooserUI", "mShouldShowRecommendApp %s | mAppRecommendCount %d | mAppMaxRecommendCount %d | isOverseasUser %s", new Object[] { Boolean.valueOf(this.tFu), Integer.valueOf(this.tFq), Integer.valueOf(this.tFr), Boolean.valueOf(bg.Jw()) });
    if ((this.tFu) && (this.tFq < this.tFr) && (!bg.Jw()) && (com.tencent.mm.sdk.platformtools.f.eqV != 1))
    {
      GMTrace.o(1143266607104L, 8518);
      return true;
    }
    GMTrace.o(1143266607104L, 8518);
    return false;
  }
  
  private Drawable c(ResolveInfo paramResolveInfo)
  {
    GMTrace.i(1143669260288L, 8521);
    try
    {
      Drawable localDrawable;
      if ((paramResolveInfo.resolvePackageName != null) && (paramResolveInfo.icon != 0))
      {
        localDrawable = a(this.aDT.getResourcesForApplication(paramResolveInfo.resolvePackageName), paramResolveInfo.icon);
        if (localDrawable != null)
        {
          GMTrace.o(1143669260288L, 8521);
          return localDrawable;
        }
      }
      int i = paramResolveInfo.getIconResource();
      if (i != 0)
      {
        localDrawable = a(this.aDT.getResourcesForApplication(paramResolveInfo.activityInfo.packageName), i);
        if (localDrawable != null)
        {
          GMTrace.o(1143669260288L, 8521);
          return localDrawable;
        }
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      w.e("MicroMsg.AppChooserUI", "Couldn't find resources for package", new Object[] { localNameNotFoundException });
      paramResolveInfo = paramResolveInfo.loadIcon(this.aDT);
      GMTrace.o(1143669260288L, 8521);
    }
    return paramResolveInfo;
  }
  
  private void i(int paramInt, String paramString, boolean paramBoolean)
  {
    GMTrace.i(1143132389376L, 8517);
    Intent localIntent = new Intent();
    localIntent.putExtra("selectpkg", paramString);
    localIntent.putExtra("isalways", paramBoolean);
    localIntent.putExtra("transferback", this.tFj);
    setResult(paramInt, localIntent);
    finish();
    GMTrace.o(1143132389376L, 8517);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1142595518464L, 8513);
    GMTrace.o(1142595518464L, 8513);
    return -1;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(1142729736192L, 8514);
    super.onBackPressed();
    i(0, null, false);
    GMTrace.o(1142729736192L, 8514);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1142192865280L, 8510);
    super.onCreate(paramBundle);
    u.bJl();
    u.yM(this.tFh);
    ad.a(getWindow());
    Object localObject = getIntent();
    paramBundle = ((Intent)localObject).getParcelableExtra("targetintent");
    if (!(paramBundle instanceof Intent))
    {
      w.w("ChooseActivity", "Target is not an intent: " + paramBundle);
      i(0, null, false);
      GMTrace.o(1142192865280L, 8510);
      return;
    }
    this.tFg = ((Intent)paramBundle);
    paramBundle = ((Intent)localObject).getStringExtra("title");
    this.tFh = ((Intent)localObject).getIntExtra("type", 0);
    this.tFj = ((Intent)localObject).getBundleExtra("transferback");
    this.tFl = ((Intent)localObject).getStringArrayListExtra("targetwhitelist");
    this.tFt = ((Intent)localObject).getBooleanExtra("needupate", false);
    this.mimeType = ((Intent)localObject).getStringExtra("mimetype");
    this.scene = ((Intent)localObject).getIntExtra("scene", 0);
    int i;
    if (at.AU())
    {
      at.AR();
      this.tFp = ((String)com.tencent.mm.y.c.xh().get(zG(274528), ""));
      if ((TextUtils.isEmpty(this.tFp)) || (!com.tencent.mm.pluginsdk.model.app.p.n(this.vKB.vKW, this.tFp)) || ((this.tFl != null) && (!this.tFl.isEmpty()) && (!this.tFl.contains(this.tFp)))) {
        break label1220;
      }
      Intent localIntent = new Intent(this.tFg);
      localIntent.setPackage(this.tFp);
      if (!bg.j(this, localIntent)) {
        break label372;
      }
      i = 1;
    }
    for (;;)
    {
      if ((i != 0) && (this.scene != 6))
      {
        i(-1, this.tFp, true);
        GMTrace.o(1142192865280L, 8510);
        return;
        w.e("MicroMsg.AppChooserUI", "acc not ready");
        i(4097, null, false);
        GMTrace.o(1142192865280L, 8510);
        return;
        label372:
        i = 0;
      }
      else
      {
        this.aDT = getPackageManager();
        this.tFf = new a();
        u.bJl();
        this.tFk = u.s(this.tFh, ((Intent)localObject).getBundleExtra("key_recommend_params"));
        this.tFs = this.tFk.dI(this.vKB.vKW);
        at.AR();
        this.tFq = ((Integer)com.tencent.mm.y.c.xh().get(bNf(), Integer.valueOf(0))).intValue();
        u.bJl();
        this.tFr = u.yL(this.tFh);
        w.d("MicroMsg.AppChooserUI", "jiaminchen mRecommendAppAvailable is %s, mAppRecommendCount is %d", new Object[] { String.valueOf(this.tFs), Integer.valueOf(this.tFq) });
        boolean bool;
        if (!((Intent)localObject).getBooleanExtra("not_show_recommend_app", false))
        {
          bool = true;
          this.tFu = bool;
          if (this.tFq < this.tFr) {
            break label708;
          }
          i = 1;
          label546:
          this.tFo = a(this.tFg, bNg(), this.tFl);
          if ((i == 0) && (!this.tFs))
          {
            at.AR();
            com.tencent.mm.y.c.xh().set(bNf(), Integer.valueOf(this.tFq + 1));
          }
          if (!this.tFs) {
            break label713;
          }
          u.bJl();
          u.yO(this.tFh);
        }
        for (;;)
        {
          if ((this.tFo != null) && (this.tFo.size() == 1) && ((!bNg()) || (this.tFs)))
          {
            paramBundle = (c)this.tFo.get(0);
            if (paramBundle != null)
            {
              if (paramBundle.tFG != null)
              {
                i(-1, paramBundle.tFG.activityInfo.packageName, false);
                GMTrace.o(1142192865280L, 8510);
                return;
                bool = false;
                break;
                label708:
                i = 0;
                break label546;
                label713:
                if (i != 0) {
                  continue;
                }
                u.bJl();
                u.yN(this.tFh);
                continue;
              }
              i(4098, null, false);
              GMTrace.o(1142192865280L, 8510);
              return;
            }
            i(4097, null, false);
            GMTrace.o(1142192865280L, 8510);
            return;
          }
        }
        AU(8);
        if ((this.tFo != null) && (!this.tFo.isEmpty()))
        {
          this.tFf.kgE = this.tFo;
          at.AR();
          this.tFv = ((Long)com.tencent.mm.y.c.xh().get(zG(274560), Long.valueOf(0L))).longValue();
          localObject = com.tencent.mm.plugin.downloader.model.f.apJ().bg(this.tFv);
          w.d("MicroMsg.AppChooserUI", "downloadId:" + this.tFv + ", status:" + ((FileDownloadTaskInfo)localObject).status);
          if ((3 == ((FileDownloadTaskInfo)localObject).status) && (e.aZ(((FileDownloadTaskInfo)localObject).path)) && (this.tFf != null))
          {
            this.tFf.tFD = f.tFQ;
            this.tFf.notifyDataSetChanged();
          }
          this.tFw = new e(this.vKB.vKW);
          localObject = this.tFw;
          if (paramBundle != null) {}
          for (((e)localObject).mTitle = paramBundle.toString();; ((e)localObject).mTitle = null)
          {
            this.tFw.tFM = this.tFx;
            this.tFw.tFz = this.tFz;
            this.tFw.tFN = this.tFy;
            this.tFw.jDh = this.tFf;
            this.tFw.Fk = this.Fk;
            paramBundle = this.tFw;
            if (paramBundle.tFM != null) {
              paramBundle.tFL.setOnItemClickListener(paramBundle.tFM);
            }
            if (paramBundle.jDh != null) {
              paramBundle.tFL.setAdapter(paramBundle.jDh);
            }
            paramBundle.hwF = h.a(paramBundle.mContext, true, paramBundle.mTitle, paramBundle.tFL, paramBundle.mContext.getString(R.l.cUO), paramBundle.mContext.getString(R.l.cUN), paramBundle.tFz, paramBundle.tFN, R.e.aNQ);
            paramBundle.hwF.setOnDismissListener(paramBundle.Fk);
            paramBundle.hwF.show();
            if ((!this.tFt) && (this.tFs) && (i == 0))
            {
              this.tFm = this.tFn;
              this.tFw.kt(true);
            }
            com.tencent.mm.plugin.downloader.model.f.apJ();
            com.tencent.mm.plugin.downloader.model.c.a(this.tFB);
            GMTrace.o(1142192865280L, 8510);
            return;
          }
        }
        i(4097, null, false);
        GMTrace.o(1142192865280L, 8510);
        return;
        label1220:
        i = 0;
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(1142461300736L, 8512);
    super.onDestroy();
    com.tencent.mm.plugin.downloader.model.f.apJ();
    com.tencent.mm.plugin.downloader.model.c.b(this.tFB);
    if (this.tFw != null) {
      this.tFw.hwF.dismiss();
    }
    GMTrace.o(1142461300736L, 8512);
  }
  
  protected void onResume()
  {
    GMTrace.i(1142327083008L, 8511);
    super.onResume();
    if ((this.tFt) && (this.tFg != null) && (this.tFk.w(this, this.tFg)))
    {
      w.i("MicroMsg.AppChooserUI", "user installed lasted recommend app");
      this.tFt = false;
      this.tFn.tFK = false;
    }
    this.tFs = this.tFk.dI(this.vKB.vKW);
    this.tFo = a(this.tFg, bNg(), this.tFl);
    if ((this.tFs) && (this.tFm == null))
    {
      this.tFm = this.tFn;
      this.tFw.kt(true);
    }
    if (this.tFf != null)
    {
      this.tFf.kgE = this.tFo;
      this.tFf.notifyDataSetChanged();
    }
    GMTrace.o(1142327083008L, 8511);
  }
  
  final int zG(int paramInt)
  {
    GMTrace.i(1142863953920L, 8515);
    if (this.mimeType != null)
    {
      i = this.tFh;
      int j = this.mimeType.hashCode();
      GMTrace.o(1142863953920L, 8515);
      return i + paramInt + j;
    }
    int i = this.tFh;
    GMTrace.o(1142863953920L, 8515);
    return i + paramInt;
  }
  
  final class a
    extends BaseAdapter
  {
    List<AppChooserUI.c> kgE;
    int tFD;
    
    public a()
    {
      GMTrace.i(1106625167360L, 8245);
      this.kgE = new ArrayList();
      this.tFD = AppChooserUI.f.tFO;
      AppChooserUI.a(AppChooserUI.this, AppChooserUI.this.getPackageManager());
      GMTrace.o(1106625167360L, 8245);
    }
    
    public final int getCount()
    {
      GMTrace.i(1107162038272L, 8249);
      if (this.kgE == null)
      {
        GMTrace.o(1107162038272L, 8249);
        return 0;
      }
      int i = this.kgE.size();
      GMTrace.o(1107162038272L, 8249);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(1106893602816L, 8247);
      long l = paramInt;
      GMTrace.o(1106893602816L, 8247);
      return l;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(16682055630848L, 124291);
      if (zH(paramInt).tFJ)
      {
        GMTrace.o(16682055630848L, 124291);
        return 1;
      }
      GMTrace.o(16682055630848L, 124291);
      return 0;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int i = 0;
      GMTrace.i(1106759385088L, 8246);
      AppChooserUI.c localc1 = zH(paramInt);
      label81:
      boolean bool;
      if ((paramView == null) || (paramView.getTag() == null))
      {
        paramView = LayoutInflater.from(AppChooserUI.this.vKB.vKW);
        if (localc1.tFJ)
        {
          paramInt = R.i.cph;
          paramView = paramView.inflate(paramInt, null);
          paramViewGroup = new AppChooserUI.b(AppChooserUI.this, paramView);
          paramView.setTag(paramViewGroup);
          if (localc1.tFI == null) {
            new AppChooserUI.d(AppChooserUI.this).execute(new AppChooserUI.c[] { localc1 });
          }
          paramViewGroup.mbR.setImageDrawable(localc1.tFI);
          paramViewGroup.mbS.setText(localc1.tFH);
          if ((localc1 == null) || ((localc1.tFJ) && (!localc1.qBD) && ((!localc1.tFJ) || (!localc1.mhC) || (AppChooserUI.d(AppChooserUI.this) < AppChooserUI.e(AppChooserUI.this)))) || (localc1.tFK)) {
            break label456;
          }
          paramViewGroup.tFE.setVisibility(8);
          paramViewGroup.tFF.setVisibility(0);
          Object localObject = paramViewGroup.tFF;
          AppChooserUI.c localc2 = AppChooserUI.c(AppChooserUI.this);
          if (!(localc2 instanceof AppChooserUI.c)) {
            break label450;
          }
          localc2 = (AppChooserUI.c)localc2;
          if (((localc2.tFG == null) || (localc1.tFG == null) || (!localc2.tFG.activityInfo.packageName.equals(localc1.tFG.activityInfo.packageName))) && ((!localc2.tFJ) || (!localc1.tFJ))) {
            break label450;
          }
          bool = true;
          label309:
          ((RadioButton)localObject).setChecked(bool);
          label316:
          if (!localc1.tFJ) {
            break label642;
          }
          if (AppChooserUI.f(AppChooserUI.this) != 4) {
            break label622;
          }
          paramViewGroup.mbU.setText(R.l.dON);
          label345:
          localObject = paramViewGroup.mbU;
          paramInt = i;
          if (bg.nm(AppChooserUI.l(AppChooserUI.this))) {
            paramInt = 8;
          }
          ((TextView)localObject).setVisibility(paramInt);
        }
      }
      for (;;)
      {
        if ((AppChooserUI.f(AppChooserUI.this) != 6) && (AppChooserUI.c(AppChooserUI.this) != null) && (AppChooserUI.c(AppChooserUI.this).equals(localc1))) {
          paramViewGroup.tFF.setChecked(true);
        }
        GMTrace.o(1106759385088L, 8246);
        return paramView;
        paramInt = R.i.cpg;
        break;
        paramViewGroup = (AppChooserUI.b)paramView.getTag();
        break label81;
        label450:
        bool = false;
        break label309;
        label456:
        paramViewGroup.tFE.setVisibility(0);
        paramViewGroup.tFF.setVisibility(8);
        paramViewGroup.tFE.setOnClickListener(AppChooserUI.k(AppChooserUI.this));
        if (this.tFD == AppChooserUI.f.tFO)
        {
          if (localc1.tFK) {
            paramViewGroup.tFE.setText(R.l.cTG);
          }
          for (;;)
          {
            paramViewGroup.tFE.setEnabled(true);
            break;
            paramViewGroup.tFE.setText(R.l.cSw);
          }
        }
        if (this.tFD == AppChooserUI.f.tFP)
        {
          paramViewGroup.tFE.setText(R.l.cSB);
          paramViewGroup.tFE.setEnabled(false);
          break label316;
        }
        if (this.tFD != AppChooserUI.f.tFQ) {
          break label316;
        }
        if (localc1.tFK) {
          paramViewGroup.tFE.setText(R.l.cUI);
        }
        for (;;)
        {
          paramViewGroup.tFE.setEnabled(true);
          break;
          paramViewGroup.tFE.setText(R.l.cUH);
        }
        label622:
        paramViewGroup.mbU.setText(bg.nl(AppChooserUI.l(AppChooserUI.this)));
        break label345;
        label642:
        paramViewGroup.mbU.setVisibility(8);
      }
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(16681921413120L, 124290);
      GMTrace.o(16681921413120L, 124290);
      return 2;
    }
    
    public final AppChooserUI.c zH(int paramInt)
    {
      GMTrace.i(1107027820544L, 8248);
      if (this.kgE == null)
      {
        GMTrace.o(1107027820544L, 8248);
        return null;
      }
      AppChooserUI.c localc = (AppChooserUI.c)this.kgE.get(paramInt);
      GMTrace.o(1107027820544L, 8248);
      return localc;
    }
  }
  
  final class b
  {
    ImageView mbR;
    TextView mbS;
    TextView mbU;
    TextView tFE;
    RadioButton tFF;
    
    public b(View paramView)
    {
      GMTrace.i(1119912722432L, 8344);
      this.mbR = ((ImageView)paramView.findViewById(R.h.bem));
      this.mbS = ((TextView)paramView.findViewById(R.h.app_name));
      this.mbU = ((TextView)paramView.findViewById(R.h.beg));
      this.tFE = ((TextView)paramView.findViewById(R.h.bey));
      this.tFF = ((RadioButton)paramView.findViewById(R.h.bew));
      GMTrace.o(1119912722432L, 8344);
    }
  }
  
  final class c
  {
    boolean mhC;
    boolean qBD;
    ResolveInfo tFG;
    CharSequence tFH;
    Drawable tFI;
    boolean tFJ;
    boolean tFK;
    
    public c()
    {
      GMTrace.i(1095216660480L, 8160);
      GMTrace.o(1095216660480L, 8160);
    }
    
    public c(ResolveInfo paramResolveInfo, CharSequence paramCharSequence)
    {
      GMTrace.i(1095350878208L, 8161);
      this.tFG = paramResolveInfo;
      this.tFH = paramCharSequence;
      this.tFJ = false;
      this.qBD = true;
      this.tFK = false;
      GMTrace.o(1095350878208L, 8161);
    }
  }
  
  final class d
    extends AsyncTask<AppChooserUI.c, Void, AppChooserUI.c>
  {
    d()
    {
      GMTrace.i(1059514744832L, 7894);
      GMTrace.o(1059514744832L, 7894);
    }
  }
  
  final class e
  {
    DialogInterface.OnDismissListener Fk;
    public i hwF;
    BaseAdapter jDh;
    Context mContext;
    String mTitle;
    ListView tFL;
    AdapterView.OnItemClickListener tFM;
    DialogInterface.OnClickListener tFN;
    DialogInterface.OnClickListener tFz;
    
    public e(Context paramContext)
    {
      GMTrace.i(1118704762880L, 8335);
      this.mContext = paramContext;
      this.tFL = ((ListView)View.inflate(this.mContext, R.i.cpf, null));
      GMTrace.o(1118704762880L, 8335);
    }
    
    public final void kt(boolean paramBoolean)
    {
      GMTrace.i(1119107416064L, 8338);
      if (this.hwF != null)
      {
        if (!paramBoolean)
        {
          this.hwF.a(R.l.cUO, null);
          this.hwF.b(R.l.cUN, null);
          GMTrace.o(1119107416064L, 8338);
          return;
        }
        this.hwF.a(R.l.cUO, this.tFz);
        this.hwF.b(R.l.cUN, this.tFN);
      }
      GMTrace.o(1119107416064L, 8338);
    }
  }
  
  public static enum f
  {
    static
    {
      GMTrace.i(1095753531392L, 8164);
      tFO = 1;
      tFP = 2;
      tFQ = 3;
      tFR = new int[] { tFO, tFP, tFQ };
      GMTrace.o(1095753531392L, 8164);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\AppChooserUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */