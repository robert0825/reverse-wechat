package com.tencent.mm.plugin.gallery.ui;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.view.ViewPager.e;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.g;
import android.support.v7.widget.RecyclerView.h;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem;
import com.tencent.mm.plugin.gallery.model.b.b;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.plugin.gallery.model.m;
import com.tencent.mm.plugin.gallery.model.m.a;
import com.tencent.mm.plugin.gallery.stub.GalleryStubService;
import com.tencent.mm.plugin.gallery.stub.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.MMViewPager;
import com.tencent.mm.ui.base.MMViewPager.e;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
import java.util.Vector;

@com.tencent.mm.ui.base.a(19)
@TargetApi(16)
public class ImagePreviewUI
  extends MMActivity
{
  private ServiceConnection keh;
  private TextView lCO;
  private boolean lCU;
  private boolean lCY;
  private com.tencent.mm.plugin.gallery.stub.a lCh;
  private ArrayList<GalleryItem.MediaItem> lCi;
  private boolean lDF;
  private int lDb;
  private long lDg;
  private HashMap<String, Integer> lDm;
  private TextView lEA;
  private TextView lEB;
  private TextView lEC;
  private View lED;
  private TextView lEE;
  private ProgressBar lEF;
  boolean lEG;
  private HashSet<String> lEH;
  private c lEj;
  private MMViewPager lEk;
  private RecyclerView lEl;
  private ArrayList<String> lEm;
  private ArrayList<String> lEn;
  private Integer lEo;
  private ImageButton lEp;
  private TextView lEq;
  private aj lEr;
  private ImageButton lEs;
  private TextView lEt;
  private ViewGroup lEu;
  private ViewGroup lEv;
  private boolean lEw;
  private boolean lEx;
  private int lEy;
  private TextView lEz;
  
  public ImagePreviewUI()
  {
    GMTrace.i(11931419148288L, 88896);
    this.lEw = true;
    this.lEx = true;
    this.lCU = true;
    this.lEy = 0;
    this.lDg = 0L;
    this.lCh = null;
    this.keh = new ServiceConnection()
    {
      public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
      {
        GMTrace.i(11948464799744L, 89023);
        w.d("MicroMsg.ImagePreviewUI", "onServiceConnected");
        ImagePreviewUI.a(ImagePreviewUI.this, a.a.Q(paramAnonymousIBinder));
        GMTrace.o(11948464799744L, 89023);
      }
      
      public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
      {
        GMTrace.i(11948599017472L, 89024);
        w.d("MicroMsg.ImagePreviewUI", "onServiceDisconnected");
        ImagePreviewUI.a(ImagePreviewUI.this, null);
        GMTrace.o(11948599017472L, 89024);
      }
    };
    this.lEG = false;
    this.lDm = new HashMap();
    GMTrace.o(11931419148288L, 88896);
  }
  
  private void a(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    GMTrace.i(15085804191744L, 112398);
    w.i("MicroMsg.ImagePreviewUI", "count:%s selectPosition:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((-1 != paramInt2) && (!this.lDF))
    {
      this.lEl.fl().b(paramInt2, Integer.valueOf(paramInt2));
      if (com.tencent.mm.plugin.gallery.model.c.aCL().aDo() != 13) {
        break label282;
      }
    }
    label282:
    for (paramInt2 = 1;; paramInt2 = 0)
    {
      paramString = this.lEj.ot(this.lEo.intValue());
      if ((paramInt1 != 0) && (((!this.lCU) && (paramInt2 == 0)) || (this.lEj == null) || (paramString == null) || (paramString.getType() != 2))) {
        break label287;
      }
      this.lEl.setVisibility(8);
      GMTrace.o(15085804191744L, 112398);
      return;
      if (-1 == paramInt2) {
        break;
      }
      if ((paramInt3 == 0) && (paramInt1 > 0))
      {
        ((f)this.lEl.fl()).lET.add(paramString);
        ((f)this.lEl.fl()).ck(paramInt1 - 1, this.lEo.intValue());
        this.lEl.fl().bd(paramInt1 - 1);
        this.lEl.smoothScrollToPosition(paramInt1 - 1);
        break;
      }
      if (paramInt3 != 1) {
        break;
      }
      paramInt2 = ((f)this.lEl.fl()).lET.indexOf(paramString);
      if (-1 == paramInt2) {
        break;
      }
      ((f)this.lEl.fl()).lET.remove(paramInt2);
      this.lEl.fl().be(paramInt2);
      break;
    }
    label287:
    this.lEl.setVisibility(0);
    GMTrace.o(15085804191744L, 112398);
  }
  
  private void a(String paramString, GalleryItem.MediaItem paramMediaItem)
  {
    GMTrace.i(15085535756288L, 112396);
    if ((paramMediaItem == null) || (paramMediaItem.getType() != 2) || ((com.tencent.mm.plugin.gallery.model.c.aCL().aDo() != 4) && (com.tencent.mm.plugin.gallery.model.c.aCL().aDo() != 13)))
    {
      this.lEw = true;
      this.lEu.setVisibility(0);
      this.lEv.setVisibility(8);
      this.lEF.setVisibility(8);
      b(paramString, paramMediaItem);
      zj(paramString);
      lf(true);
      this.lEq.setVisibility(8);
      if ((paramMediaItem != null) && (paramMediaItem.getType() == 1) && (!paramMediaItem.mMimeType.equalsIgnoreCase("image/gif")))
      {
        this.lEz.setVisibility(0);
        GMTrace.o(15085535756288L, 112396);
        return;
      }
      boolean bool = getIntent().getBooleanExtra("preview_image", false);
      w.i("MicroMsg.ImagePreviewUI", "QuerySource:%s isPreViewImage:%s  path:%s", new Object[] { Integer.valueOf(com.tencent.mm.plugin.gallery.model.c.aCL().aDo()), Boolean.valueOf(bool), paramString });
      if ((paramMediaItem == null) && (!bg.nm(paramString)))
      {
        this.lEz.setVisibility(0);
        GMTrace.o(15085535756288L, 112396);
        return;
      }
      this.lEz.setVisibility(8);
      GMTrace.o(15085535756288L, 112396);
      return;
    }
    GalleryItem.VideoMediaItem localVideoMediaItem;
    if ((paramMediaItem != null) && (paramMediaItem.getType() == 1) && (!paramMediaItem.mMimeType.equalsIgnoreCase("image/gif")))
    {
      this.lEz.setVisibility(0);
      localVideoMediaItem = (GalleryItem.VideoMediaItem)paramMediaItem;
      lf(false);
      this.lEw = false;
      this.lEu.setVisibility(8);
      this.lEv.setVisibility(0);
      this.lEE.setVisibility(8);
      if (FileOp.kX(paramString) <= 1073741824L) {
        break label380;
      }
      this.lEA.setText(getString(R.l.dza));
      this.lEB.setText(getString(R.l.dyZ));
    }
    label380:
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        break label385;
      }
      GMTrace.o(15085535756288L, 112396);
      return;
      this.lEz.setVisibility(8);
      break;
    }
    label385:
    if (!bg.nm(localVideoMediaItem.gVo))
    {
      w.d("MicroMsg.ImagePreviewUI", "got MediaItem directly path [%s], durationMs [%d], videoHeight[%d], videoWidth [%d]", new Object[] { localVideoMediaItem.gVn, Integer.valueOf(localVideoMediaItem.gVq), Integer.valueOf(localVideoMediaItem.videoHeight), Integer.valueOf(localVideoMediaItem.videoWidth) });
      a(paramString, localVideoMediaItem);
      GMTrace.o(15085535756288L, 112396);
      return;
    }
    lf(false);
    this.lEw = true;
    this.lEu.setVisibility(0);
    this.lEv.setVisibility(8);
    this.lEq.setVisibility(8);
    b(paramString, paramMediaItem);
    zj(paramString);
    paramMediaItem = new m(paramString, this.lEo.intValue(), localVideoMediaItem, new m.a()
    {
      public final void a(m paramAnonymousm)
      {
        GMTrace.i(15103655149568L, 112531);
        if (paramAnonymousm.position != ImagePreviewUI.g(ImagePreviewUI.this).intValue())
        {
          GMTrace.o(15103655149568L, 112531);
          return;
        }
        ImagePreviewUI.a(ImagePreviewUI.this, paramAnonymousm.path, paramAnonymousm.lCb);
        GMTrace.o(15103655149568L, 112531);
      }
    });
    if (com.tencent.mm.sdk.f.e.Q(paramMediaItem))
    {
      w.d("MicroMsg.ImagePreviewUI", "analysis of path[%s] has already been added in ThreadPool", new Object[] { paramString });
      GMTrace.o(15085535756288L, 112396);
      return;
    }
    com.tencent.mm.sdk.f.e.post(paramMediaItem, "video_analysis");
    GMTrace.o(15085535756288L, 112396);
  }
  
  private void a(String paramString, GalleryItem.VideoMediaItem paramVideoMediaItem)
  {
    GMTrace.i(11933700849664L, 88913);
    lf(false);
    this.lEw = false;
    this.lEu.setVisibility(8);
    this.lEv.setVisibility(0);
    this.lEE.setVisibility(8);
    if (com.tencent.mm.plugin.gallery.model.c.aCL().aDo() == 13)
    {
      this.lEv.setVisibility(8);
      this.lEu.setVisibility(8);
      this.lEA.setVisibility(8);
      this.lEB.setVisibility(8);
      lf(true);
      GMTrace.o(11933700849664L, 88913);
      return;
    }
    if ((paramVideoMediaItem == null) || (paramVideoMediaItem.videoWidth <= 0) || (paramVideoMediaItem.videoHeight <= 0) || (paramVideoMediaItem.videoWidth / paramVideoMediaItem.videoHeight > 3.0F) || (paramVideoMediaItem.videoWidth / paramVideoMediaItem.videoHeight < 0.5F))
    {
      if (paramVideoMediaItem != null) {
        w.d("MicroMsg.ImagePreviewUI", "check ratio faild width = [%d], height = [%d]", new Object[] { Integer.valueOf(paramVideoMediaItem.videoWidth), Integer.valueOf(paramVideoMediaItem.videoHeight) });
      }
      this.lEA.setText(getString(R.l.dyX));
      this.lEB.setText(getString(R.l.dyY));
    }
    for (int i = 1; i != 0; i = 0)
    {
      GMTrace.o(11933700849664L, 88913);
      return;
    }
    w.d("MicroMsg.ImagePreviewUI", "updateBottomLayoutCheckFormat() called with: item = [%s]", new Object[] { paramVideoMediaItem });
    String str;
    if ((paramVideoMediaItem != null) && (!bg.nm(paramVideoMediaItem.gVn)))
    {
      str = paramVideoMediaItem.gVn;
      if (bg.nm(str))
      {
        i = 1;
        if ((i == 0) && ("video/avc".equalsIgnoreCase(paramVideoMediaItem.gVo)) && ((bg.nm(paramVideoMediaItem.gVp)) || ("audio/mp4a-latm".equalsIgnoreCase(paramVideoMediaItem.gVp)))) {
          break label608;
        }
      }
    }
    else
    {
      if (paramVideoMediaItem != null) {
        break label599;
      }
      str = null;
      label339:
      w.d("MicroMsg.ImagePreviewUI", "check video format failed, dst format [video/avc], video format [%s]", new Object[] { str });
      this.lEA.setText(getString(R.l.dyV));
      this.lEB.setText(getString(R.l.dyW));
    }
    label599:
    label608:
    for (i = 1;; i = 0)
    {
      if (i == 0) {
        break label613;
      }
      GMTrace.o(11933700849664L, 88913);
      return;
      if (this.lEH == null)
      {
        this.lEH = new HashSet();
        this.lEH.add(".h264");
        this.lEH.add(".h26l");
        this.lEH.add(".264");
        this.lEH.add(".avc");
        this.lEH.add(".mov");
        this.lEH.add(".mp4");
        this.lEH.add(".m4a");
        this.lEH.add(".3gp");
        this.lEH.add(".3g2");
        this.lEH.add(".mj2");
        this.lEH.add(".m4v");
      }
      str = str.trim();
      i = str.lastIndexOf(".");
      if ((i < 0) || (i >= str.length()))
      {
        i = 1;
        break;
      }
      if (!this.lEH.contains(str.substring(i)))
      {
        i = 1;
        break;
      }
      i = 0;
      break;
      str = paramVideoMediaItem.gVo;
      break label339;
    }
    label613:
    w.d("MicroMsg.ImagePreviewUI", "check duration %d", new Object[] { Integer.valueOf(paramVideoMediaItem.gVq) });
    if (com.tencent.mm.plugin.gallery.model.c.aCL().aDo() != 13) {
      if (paramVideoMediaItem.gVq <= 1000)
      {
        this.lEA.setText(getString(R.l.dze));
        this.lEB.setText(getString(R.l.dzd));
        i = 1;
      }
    }
    while (i != 0)
    {
      GMTrace.o(11933700849664L, 88913);
      return;
      if (paramVideoMediaItem.gVq >= 300000)
      {
        this.lEA.setText(getString(R.l.dzc));
        this.lEB.setText(getString(R.l.dzb));
        i = 1;
      }
      else if (paramVideoMediaItem.gVq >= 10500)
      {
        this.lEA.setText(getString(R.l.dyR));
        this.lEB.setText(getString(R.l.dyQ));
        this.lEE.setVisibility(0);
        i = 1;
      }
      else
      {
        i = 0;
      }
    }
    lf(true);
    this.lEw = true;
    this.lEu.setVisibility(0);
    this.lEv.setVisibility(8);
    this.lEq.setVisibility(0);
    this.lEF.setVisibility(8);
    b(paramString, paramVideoMediaItem);
    zj(paramString);
    GMTrace.o(11933700849664L, 88913);
  }
  
  private String aDC()
  {
    GMTrace.i(11932761325568L, 88906);
    switch (com.tencent.mm.plugin.gallery.model.c.aCL().aDo())
    {
    case 5: 
    case 6: 
    case 9: 
    case 10: 
    case 12: 
    default: 
      if ((this.lEn.size() == 0) || (this.lDb <= 1))
      {
        str = getString(R.l.cUs);
        GMTrace.o(11932761325568L, 88906);
        return str;
      }
      break;
    case 4: 
    case 7: 
    case 8: 
    case 13: 
      if ((this.lEn.size() == 0) || (this.lDb <= 1))
      {
        str = getString(R.l.dyU);
        GMTrace.o(11932761325568L, 88906);
        return str;
      }
      str = getString(R.l.dyU) + "(" + this.lEn.size() + "/" + this.lDb + ")";
      GMTrace.o(11932761325568L, 88906);
      return str;
    case 11: 
      str = getString(R.l.dpr);
      GMTrace.o(11932761325568L, 88906);
      return str;
    }
    String str = getString(R.l.dyO, new Object[] { Integer.valueOf(this.lEn.size()), Integer.valueOf(this.lDb) });
    GMTrace.o(11932761325568L, 88906);
    return str;
  }
  
  private ArrayList<String> aDD()
  {
    GMTrace.i(15085267320832L, 112394);
    if (this.lDF)
    {
      localArrayList = this.lEn;
      GMTrace.o(15085267320832L, 112394);
      return localArrayList;
    }
    ArrayList localArrayList = new ArrayList(this.lEn.size());
    Iterator localIterator = this.lEm.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (this.lEn.contains(str)) {
        localArrayList.add(str);
      }
    }
    GMTrace.o(15085267320832L, 112394);
    return localArrayList;
  }
  
  private void b(String paramString, GalleryItem.MediaItem paramMediaItem)
  {
    GMTrace.i(11933835067392L, 88914);
    if ((paramMediaItem == null) || (paramMediaItem.getType() != 2) || (com.tencent.mm.plugin.gallery.model.c.aCL().aDo() != 4))
    {
      if (this.lDb == 1)
      {
        this.lEs.setVisibility(8);
        this.lEt.setVisibility(8);
      }
      while (!this.lEn.contains(paramString))
      {
        this.lEs.setImageResource(R.k.cLu);
        GMTrace.o(11933835067392L, 88914);
        return;
        this.lEs.setVisibility(0);
        this.lEt.setVisibility(0);
      }
      this.lEs.setImageResource(R.k.cLt);
      GMTrace.o(11933835067392L, 88914);
      return;
    }
    this.lEs.setVisibility(8);
    this.lEt.setVisibility(8);
    GMTrace.o(11933835067392L, 88914);
  }
  
  private void c(GalleryItem.MediaItem paramMediaItem)
  {
    GMTrace.i(15085669974016L, 112397);
    if (paramMediaItem == null)
    {
      w.e("MicroMsg.ImagePreviewUI", "[updateTopTip] null == item");
      GMTrace.o(15085669974016L, 112397);
      return;
    }
    Object localObject;
    if (paramMediaItem.getType() == 2)
    {
      GalleryItem.VideoMediaItem localVideoMediaItem = (GalleryItem.VideoMediaItem)paramMediaItem;
      if (!bg.nm(localVideoMediaItem.gVo))
      {
        w.d("MicroMsg.ImagePreviewUI", "path [%s], durationMs [%d], videoHeight[%d], videoWidth [%d]", new Object[] { localVideoMediaItem.gVn, Integer.valueOf(localVideoMediaItem.gVq), Integer.valueOf(localVideoMediaItem.videoHeight), Integer.valueOf(localVideoMediaItem.videoWidth) });
        if ((localVideoMediaItem.gVq >= 300000) || ((localVideoMediaItem.gVq > 0) && (localVideoMediaItem.gVq < 1000)))
        {
          this.lED.setVisibility(0);
          localObject = this.lEC;
          if (localVideoMediaItem.gVq >= 300000) {}
          for (paramMediaItem = getString(R.l.dzb);; paramMediaItem = getString(R.l.dzd))
          {
            ((TextView)localObject).setText(paramMediaItem);
            this.lEt.setEnabled(false);
            this.lEs.setEnabled(false);
            this.lEt.setTextColor(getResources().getColor(R.e.aPr));
            if (this.lEn.size() != 0) {
              break;
            }
            lf(false);
            GMTrace.o(15085669974016L, 112397);
            return;
          }
        }
        this.lEt.setEnabled(true);
        this.lEs.setEnabled(true);
        this.lEt.setTextColor(getResources().getColor(R.e.aPq));
        this.lED.setVisibility(8);
        GMTrace.o(15085669974016L, 112397);
        return;
      }
      localObject = new m(paramMediaItem.gVn, this.lEo.intValue(), localVideoMediaItem, new m.a()
      {
        public final void a(m paramAnonymousm)
        {
          GMTrace.i(19568676306944L, 145798);
          if (paramAnonymousm.position != ImagePreviewUI.g(ImagePreviewUI.this).intValue())
          {
            GMTrace.o(19568676306944L, 145798);
            return;
          }
          if ((paramAnonymousm.lCb.gVq >= 300000) || ((paramAnonymousm.lCb.gVq > 0) && (paramAnonymousm.lCb.gVq < 1000)))
          {
            ImagePreviewUI.a(ImagePreviewUI.this).setVisibility(0);
            TextView localTextView = ImagePreviewUI.x(ImagePreviewUI.this);
            if (paramAnonymousm.lCb.gVq >= 300000) {}
            for (paramAnonymousm = ImagePreviewUI.this.getString(R.l.dzb);; paramAnonymousm = ImagePreviewUI.this.getString(R.l.dzd))
            {
              localTextView.setText(paramAnonymousm);
              ImagePreviewUI.y(ImagePreviewUI.this).setEnabled(false);
              ImagePreviewUI.e(ImagePreviewUI.this).setEnabled(false);
              ImagePreviewUI.y(ImagePreviewUI.this).setTextColor(ImagePreviewUI.this.getResources().getColor(R.e.aPr));
              if (ImagePreviewUI.d(ImagePreviewUI.this).size() != 0) {
                break;
              }
              ImagePreviewUI.this.lf(false);
              GMTrace.o(19568676306944L, 145798);
              return;
            }
          }
          ImagePreviewUI.y(ImagePreviewUI.this).setEnabled(true);
          ImagePreviewUI.e(ImagePreviewUI.this).setEnabled(true);
          ImagePreviewUI.y(ImagePreviewUI.this).setTextColor(ImagePreviewUI.this.getResources().getColor(R.e.aPq));
          ImagePreviewUI.a(ImagePreviewUI.this).setVisibility(8);
          GMTrace.o(19568676306944L, 145798);
        }
      });
      if (com.tencent.mm.sdk.f.e.Q((Runnable)localObject))
      {
        w.d("MicroMsg.ImagePreviewUI", "analysis of path[%s] has already been added in ThreadPool", new Object[] { paramMediaItem.gVn });
        GMTrace.o(15085669974016L, 112397);
        return;
      }
      com.tencent.mm.sdk.f.e.post((Runnable)localObject, "video_analysis");
      GMTrace.o(15085669974016L, 112397);
      return;
    }
    if ((paramMediaItem.getType() == 1) && (!paramMediaItem.mMimeType.equalsIgnoreCase("image/gif")))
    {
      this.lEt.setEnabled(true);
      this.lEs.setEnabled(true);
      this.lEt.setTextColor(getResources().getColor(R.e.aPq));
      if ((this.lCY) && (this.lEn.contains(paramMediaItem.gVn)) && (FileOp.kX(paramMediaItem.gVn) > 26214400L))
      {
        this.lED.setVisibility(0);
        this.lEC.setText(getString(R.l.dzi));
        GMTrace.o(15085669974016L, 112397);
        return;
      }
      this.lED.setVisibility(8);
      GMTrace.o(15085669974016L, 112397);
      return;
    }
    if ((paramMediaItem.getType() == 1) && (paramMediaItem.mMimeType.equalsIgnoreCase("image/gif")))
    {
      localObject = new com.tencent.mm.plugin.gif.e(paramMediaItem.gVn);
      int i = com.tencent.mm.a.e.aY(paramMediaItem.gVn);
      try
      {
        if (((!this.lEn.contains(paramMediaItem.gVn)) || (i == 0) || (i <= this.lCh.ub())) && (localObject.mfm[0] <= this.lCh.ua()) && (localObject.mfm[1] <= this.lCh.ua())) {
          break label690;
        }
        this.lEt.setTextColor(getResources().getColor(R.e.aPr));
        this.lEt.setEnabled(false);
        this.lEs.setEnabled(false);
        GMTrace.o(15085669974016L, 112397);
        return;
      }
      catch (Exception paramMediaItem)
      {
        w.e("MicroMsg.ImagePreviewUI", bg.f(paramMediaItem));
      }
    }
    GMTrace.o(15085669974016L, 112397);
    return;
    label690:
    this.lEt.setTextColor(getResources().getColor(R.e.aPq));
    this.lEt.setEnabled(true);
    this.lEs.setEnabled(true);
    GMTrace.o(15085669974016L, 112397);
  }
  
  private void eN(boolean paramBoolean)
  {
    GMTrace.i(15085401538560L, 112395);
    if (com.tencent.mm.plugin.gallery.model.c.aCL().aDo() == 4)
    {
      GMTrace.o(15085401538560L, 112395);
      return;
    }
    if (this.lEj == null)
    {
      w.i("MicroMsg.ImagePreviewUI", "[setTopTipVisibility] adapter == null");
      GMTrace.o(15085401538560L, 112395);
      return;
    }
    final GalleryItem.MediaItem localMediaItem = this.lEj.ot(this.lEo.intValue());
    if ((paramBoolean) && (localMediaItem != null))
    {
      this.lED.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19565723516928L, 145776);
          ImagePreviewUI.a(ImagePreviewUI.this, localMediaItem);
          GMTrace.o(19565723516928L, 145776);
        }
      }, 400L);
      GMTrace.o(15085401538560L, 112395);
      return;
    }
    this.lED.setVisibility(8);
    GMTrace.o(15085401538560L, 112395);
  }
  
  private void eO(boolean paramBoolean)
  {
    GMTrace.i(11933029761024L, 88908);
    w.d("MicroMsg.ImagePreviewUI", "setFooterVisibility() called with: visible = [" + paramBoolean + "], selectedNormalFooter = " + this.lEw);
    if (this.lEw)
    {
      localObject = findViewById(R.h.bsJ);
      if (localObject != null) {
        break label125;
      }
      if (!this.lEw) {
        break label118;
      }
    }
    label118:
    for (Object localObject = "normal";; localObject = "edit_tips")
    {
      w.w("MicroMsg.ImagePreviewUI", "set footer[%s] visibility[%B], but footerbar null", new Object[] { localObject, Boolean.valueOf(paramBoolean) });
      GMTrace.o(11933029761024L, 88908);
      return;
      localObject = findViewById(R.h.bCv);
      break;
    }
    label125:
    if (((paramBoolean) && (((View)localObject).getVisibility() == 0)) || ((!paramBoolean) && (((View)localObject).getVisibility() == 8)))
    {
      GMTrace.o(11933029761024L, 88908);
      return;
    }
    if (paramBoolean)
    {
      ((View)localObject).setVisibility(0);
      ((View)localObject).startAnimation(AnimationUtils.loadAnimation(this, R.a.aLs));
    }
    while ((paramBoolean) && (this.lEl.getVisibility() == 8) && (this.lEn.size() > 0))
    {
      this.lEl.setVisibility(0);
      localObject = AnimationUtils.loadAnimation(this, R.a.aLs);
      this.lEl.startAnimation((Animation)localObject);
      GMTrace.o(11933029761024L, 88908);
      return;
      ((View)localObject).setVisibility(8);
      ((View)localObject).startAnimation(AnimationUtils.loadAnimation(this, R.a.aLt));
    }
    if ((!paramBoolean) && (this.lEl.getVisibility() == 0))
    {
      this.lEl.setVisibility(8);
      localObject = AnimationUtils.loadAnimation(this, R.a.aLt);
      this.lEl.startAnimation((Animation)localObject);
    }
    GMTrace.o(11933029761024L, 88908);
  }
  
  private void goBack()
  {
    boolean bool2 = true;
    GMTrace.i(11933163978752L, 88909);
    Intent localIntent = new Intent();
    boolean bool1;
    if (!this.lCY)
    {
      bool1 = true;
      if (!this.lCU) {
        break label95;
      }
      bool1 = bool2;
    }
    label95:
    for (;;)
    {
      localIntent.putExtra("CropImage_Compress_Img", bool1);
      localIntent.putStringArrayListExtra("preview_image_list", aDD());
      localIntent.putExtra("show_photo_edit_tip", this.lEG);
      setResult(0, localIntent);
      finish();
      GMTrace.o(11933163978752L, 88909);
      return;
      bool1 = false;
      break;
    }
  }
  
  private void zi(String paramString)
  {
    GMTrace.i(11932358672384L, 88903);
    if (!this.lEn.contains(paramString))
    {
      if (this.lEn.size() >= this.lDb)
      {
        h.bm(this.vKB.vKW, getResources().getQuantityString(R.j.cIo, this.lDb, new Object[] { Integer.valueOf(this.lDb) }));
        this.lEs.setImageResource(R.k.cLu);
        GMTrace.o(11932358672384L, 88903);
        return;
      }
      this.lEn.add(paramString);
      this.lEs.setImageResource(R.k.cLt);
      a(this.lEn.size(), this.lEo.intValue(), paramString, 0);
      GMTrace.o(11932358672384L, 88903);
      return;
    }
    this.lEs.setImageResource(R.k.cLu);
    while (this.lEn.remove(paramString)) {}
    a(this.lEn.size(), this.lEo.intValue(), paramString, 1);
    GMTrace.o(11932358672384L, 88903);
  }
  
  private void zj(String paramString)
  {
    GMTrace.i(11933969285120L, 88915);
    Boolean localBoolean2;
    GalleryItem.MediaItem localMediaItem;
    Boolean localBoolean1;
    switch (com.tencent.mm.plugin.gallery.model.c.aCL().aDo())
    {
    default: 
      localBoolean2 = Boolean.valueOf(false);
      localMediaItem = com.tencent.mm.plugin.gallery.model.c.ze(paramString);
      localBoolean1 = localBoolean2;
      if (localMediaItem != null)
      {
        localBoolean1 = localBoolean2;
        if (localMediaItem.getType() == 2) {
          localBoolean1 = Boolean.valueOf(true);
        }
      }
      if ((localMediaItem == null) && (o.RH(paramString))) {
        paramString = Boolean.valueOf(true);
      }
      break;
    }
    for (;;)
    {
      if (!paramString.booleanValue()) {
        break label173;
      }
      this.lEp.setVisibility(8);
      this.lCO.setVisibility(8);
      GMTrace.o(11933969285120L, 88915);
      return;
      localBoolean2 = Boolean.valueOf(true);
      break;
      paramString = localBoolean1;
      if (localMediaItem != null)
      {
        paramString = localBoolean1;
        if (localMediaItem.mMimeType.equalsIgnoreCase("image/gif")) {
          paramString = Boolean.valueOf(true);
        }
      }
    }
    label173:
    this.lEp.setVisibility(0);
    this.lCO.setVisibility(0);
    GMTrace.o(11933969285120L, 88915);
  }
  
  protected final void MP()
  {
    GMTrace.i(11932224454656L, 88902);
    this.lEA = ((TextView)findViewById(R.h.bCw));
    this.lEB = ((TextView)findViewById(R.h.bCy));
    this.lEC = ((TextView)findViewById(R.h.bIO));
    this.lED = findViewById(R.h.bIP);
    this.lED.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15080703918080L, 112360);
        ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)ImagePreviewUI.a(ImagePreviewUI.this).getLayoutParams();
        localMarginLayoutParams.topMargin = ((int)(j.h(ImagePreviewUI.this) + ImagePreviewUI.this.getResources().getDimension(R.f.aPN)));
        ImagePreviewUI.a(ImagePreviewUI.this).setLayoutParams(localMarginLayoutParams);
        GMTrace.o(15080703918080L, 112360);
      }
    }, 100L);
    this.lEE = ((TextView)findViewById(R.h.bCx));
    this.lEF = ((ProgressBar)findViewById(R.h.ckm));
    this.lDb = getIntent().getIntExtra("max_select_count", 9);
    final Object localObject1;
    boolean bool2;
    if (com.tencent.mm.plugin.gallery.model.c.aCL().aDo() == 4)
    {
      bool1 = true;
      this.lCU = bool1;
      localObject1 = getIntent();
      this.lEm = ((Intent)localObject1).getStringArrayListExtra("preview_image_list");
      this.lEn = new ArrayList();
      if (this.lEm != null) {
        this.lEn.addAll(this.lEm);
      }
      this.lCi = com.tencent.mm.plugin.gallery.model.c.aCN();
      bool2 = ((Intent)localObject1).getBooleanExtra("preview_all", false);
      if (this.lCi != null) {
        break label372;
      }
    }
    label372:
    for (boolean bool1 = true;; bool1 = false)
    {
      w.i("MicroMsg.ImagePreviewUI", "preview all[%B] mediaitems is null[%B]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      if ((bool2) && (this.lCi != null))
      {
        this.lDF = true;
        this.lEo = Integer.valueOf(((Intent)localObject1).getIntExtra("preview_position", 0));
        w.i("MicroMsg.ImagePreviewUI", "start position=%d", new Object[] { this.lEo });
        if (this.lEo.intValue() >= 0) {}
      }
      else
      {
        this.lEo = Integer.valueOf(0);
      }
      com.tencent.mm.plugin.gallery.model.c.oe(this.lEo.intValue());
      if ((this.lDF) || ((this.lEn != null) && (this.lEn.size() != 0))) {
        break label377;
      }
      w.e("MicroMsg.ImagePreviewUI", "not preview all items and imagepaths is null or empty");
      finish();
      GMTrace.o(11932224454656L, 88902);
      return;
      bool1 = false;
      break;
    }
    label377:
    this.lEp = ((ImageButton)findViewById(R.h.bSy));
    this.lCO = ((TextView)findViewById(R.h.bSz));
    this.lEq = ((TextView)findViewById(R.h.ckl));
    this.lCY = ((Intent)localObject1).getBooleanExtra("send_raw_img", false);
    this.lEy = ((Intent)localObject1).getIntExtra("query_source_type", 0);
    int i;
    if (this.lCY)
    {
      this.lEp.setImageResource(R.k.cOv);
      if ((this.lEn != null) && (this.lEn.size() == 1))
      {
        localObject1 = (String)this.lEn.get(0);
        if (((String)localObject1).endsWith(".jpg")) {
          af.t(new Runnable()
          {
            public final void run()
            {
              boolean bool1 = true;
              GMTrace.i(19567065694208L, 145786);
              try
              {
                com.tencent.mm.plugin.gallery.stub.a locala = ImagePreviewUI.s(ImagePreviewUI.this);
                String str1 = localObject1;
                String str2 = ImagePreviewUI.this.getIntent().getStringExtra("GalleryUI_ToUser");
                if (ImagePreviewUI.l(ImagePreviewUI.this)) {}
                for (;;)
                {
                  locala.a(str1, str2, bool1, 0, true);
                  GMTrace.o(19567065694208L, 145786);
                  return;
                  boolean bool2 = ImagePreviewUI.b(ImagePreviewUI.this);
                  if (bool2) {
                    bool1 = false;
                  }
                }
                return;
              }
              catch (Exception localException)
              {
                GMTrace.o(19567065694208L, 145786);
              }
            }
          });
        }
      }
      this.lCO.setText(this.vKB.vKW.getString(R.l.dyS));
      this.lEp.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11923366084608L, 88836);
          paramAnonymousView = ImagePreviewUI.this;
          boolean bool;
          if (!ImagePreviewUI.b(ImagePreviewUI.this))
          {
            bool = true;
            ImagePreviewUI.b(paramAnonymousView, bool);
            if (!ImagePreviewUI.b(ImagePreviewUI.this)) {
              break label154;
            }
            ImagePreviewUI.c(ImagePreviewUI.this).setImageResource(R.k.cOv);
            if (ImagePreviewUI.d(ImagePreviewUI.this).size() == 0) {
              ImagePreviewUI.e(ImagePreviewUI.this).performClick();
            }
          }
          for (;;)
          {
            ImagePreviewUI.f(ImagePreviewUI.this).setText(ImagePreviewUI.this.vKB.vKW.getString(R.l.dyS) + ImagePreviewUI.aDE());
            ImagePreviewUI.a(ImagePreviewUI.this, ImagePreviewUI.g(ImagePreviewUI.this).intValue());
            GMTrace.o(11923366084608L, 88836);
            return;
            bool = false;
            break;
            label154:
            ImagePreviewUI.c(ImagePreviewUI.this).setImageResource(R.k.cOu);
          }
        }
      });
      this.lEq.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11958531129344L, 89098);
          paramAnonymousView = ImagePreviewUI.h(ImagePreviewUI.this).iH(ImagePreviewUI.g(ImagePreviewUI.this).intValue());
          if (bg.nm(paramAnonymousView))
          {
            w.w("MicroMsg.ImagePreviewUI", "get path error, position %d", new Object[] { ImagePreviewUI.g(ImagePreviewUI.this) });
            GMTrace.o(11958531129344L, 89098);
            return;
          }
          Intent localIntent = new Intent();
          localIntent.putExtra("key_video_path", paramAnonymousView);
          localIntent.putExtra("key_need_clip_video_first", false);
          com.tencent.mm.bj.d.b(ImagePreviewUI.this.vKB.vKW, "mmsight", ".segment.MMSightEditUI", localIntent, 4370);
          GMTrace.o(11958531129344L, 89098);
        }
      });
      this.lEE.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(15099628617728L, 112501);
          paramAnonymousView = ImagePreviewUI.h(ImagePreviewUI.this).iH(ImagePreviewUI.g(ImagePreviewUI.this).intValue());
          if (bg.nm(paramAnonymousView))
          {
            w.w("MicroMsg.ImagePreviewUI", "get path error, position %d", new Object[] { ImagePreviewUI.g(ImagePreviewUI.this) });
            GMTrace.o(15099628617728L, 112501);
            return;
          }
          Intent localIntent = new Intent();
          localIntent.putExtra("key_video_path", paramAnonymousView);
          localIntent.putExtra("key_need_clip_video_first", true);
          com.tencent.mm.bj.d.b(ImagePreviewUI.this.vKB.vKW, "mmsight", ".segment.MMSightEditUI", localIntent, 4370);
          GMTrace.o(15099628617728L, 112501);
        }
      });
      this.lCO.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19569213177856L, 145802);
          ImagePreviewUI.c(ImagePreviewUI.this).performClick();
          GMTrace.o(19569213177856L, 145802);
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(15100165488640L, 112505);
          ImagePreviewUI.i(ImagePreviewUI.this);
          GMTrace.o(15100165488640L, 112505);
          return true;
        }
      });
      a(0, aDC(), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(final MenuItem paramAnonymousMenuItem)
        {
          int j = 0;
          GMTrace.i(19568407871488L, 145796);
          if (ImagePreviewUI.j(ImagePreviewUI.this) == 6)
          {
            ImagePreviewUI.this.setResult(1);
            ImagePreviewUI.this.finish();
          }
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.putExtra("isPreviewPhoto", ImagePreviewUI.this.getIntent().getBooleanExtra("isPreviewPhoto", false));
          Object localObject = ImagePreviewUI.k(ImagePreviewUI.this);
          int i;
          if ((localObject != null) && (((ArrayList)localObject).size() == 0))
          {
            localObject = ImagePreviewUI.h(ImagePreviewUI.this).ot(ImagePreviewUI.g(ImagePreviewUI.this).intValue());
            if ((ImagePreviewUI.l(ImagePreviewUI.this)) && (ImagePreviewUI.h(ImagePreviewUI.this) != null) && (localObject != null) && (((GalleryItem.MediaItem)localObject).getType() == 2))
            {
              ImagePreviewUI.a(ImagePreviewUI.this, ((GalleryItem.MediaItem)localObject).gVn);
              i = 0;
            }
          }
          for (;;)
          {
            if (!ImagePreviewUI.b(ImagePreviewUI.this)) {}
            final boolean bool2;
            for (final boolean bool1 = true;; bool1 = false)
            {
              bool2 = ImagePreviewUI.l(ImagePreviewUI.this);
              if (i != 0) {
                break label229;
              }
              ImagePreviewUI.a(ImagePreviewUI.this, paramAnonymousMenuItem, bool2, bool1);
              GMTrace.o(19568407871488L, 145796);
              return true;
              ImagePreviewUI.e(ImagePreviewUI.this).performClick();
              i = 300;
              break;
            }
            label229:
            localObject = com.tencent.mm.plugin.gallery.model.c.aCM();
            paramAnonymousMenuItem = new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19569481613312L, 145804);
                ImagePreviewUI.a(ImagePreviewUI.this, paramAnonymousMenuItem, bool2, bool1);
                GMTrace.o(19569481613312L, 145804);
              }
              
              public final String toString()
              {
                GMTrace.i(19569615831040L, 145805);
                String str = super.toString() + "|addTextOptionMenu";
                GMTrace.o(19569615831040L, 145805);
                return str;
              }
            };
            if (i < 0) {
              i = j;
            }
            for (;;)
            {
              ((com.tencent.mm.plugin.gallery.model.e)localObject).aDa().postDelayed(paramAnonymousMenuItem, i);
              GMTrace.o(19568407871488L, 145796);
              return true;
            }
            i = 0;
          }
        }
      }, p.b.vLG);
      this.lEs = ((ImageButton)findViewById(R.h.bTg));
      this.lEs.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11963094532096L, 89132);
          paramAnonymousView = ImagePreviewUI.h(ImagePreviewUI.this).iH(ImagePreviewUI.g(ImagePreviewUI.this).intValue());
          if (bg.nm(paramAnonymousView))
          {
            w.w("MicroMsg.ImagePreviewUI", "get path error, position %d", new Object[] { ImagePreviewUI.g(ImagePreviewUI.this) });
            GMTrace.o(11963094532096L, 89132);
            return;
          }
          ImagePreviewUI.a(ImagePreviewUI.this, paramAnonymousView);
          ImagePreviewUI.a(ImagePreviewUI.this, ImagePreviewUI.g(ImagePreviewUI.this).intValue());
          ImagePreviewUI.f(ImagePreviewUI.this).setText(ImagePreviewUI.this.vKB.vKW.getString(R.l.dyS) + ImagePreviewUI.aDE());
          ImagePreviewUI.this.aH(0, ImagePreviewUI.m(ImagePreviewUI.this));
          GMTrace.o(11963094532096L, 89132);
        }
      });
      this.lEt = ((TextView)findViewById(R.h.bTh));
      this.lEt.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11942961872896L, 88982);
          ImagePreviewUI.e(ImagePreviewUI.this).performClick();
          GMTrace.o(11942961872896L, 88982);
        }
      });
      if (this.lDb == 1)
      {
        this.lEs.setVisibility(8);
        this.lEt.setVisibility(8);
      }
      this.lEu = ((ViewGroup)findViewById(R.h.bsJ));
      this.lEv = ((ViewGroup)findViewById(R.h.bCv));
      if (this.lEu != null)
      {
        this.lEu.setVisibility(8);
        this.lEu.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(11943498743808L, 88986);
            GMTrace.o(11943498743808L, 88986);
          }
        });
      }
      if (this.lEv != null)
      {
        this.lEv.setVisibility(8);
        this.lEv.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(15097883787264L, 112488);
            GMTrace.o(15097883787264L, 112488);
          }
        });
      }
      this.lEz = ((TextView)findViewById(R.h.bTf));
      this.lEz.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19565857734656L, 145777);
          ImagePreviewUI.n(ImagePreviewUI.this);
          GMTrace.o(19565857734656L, 145777);
        }
      });
      this.lEl = ((RecyclerView)findViewById(R.h.bGX));
      this.lEl.Ts.TY = 66L;
      this.lEl.a(new RecyclerView.g()
      {
        public final void a(Rect paramAnonymousRect, View paramAnonymousView, RecyclerView paramAnonymousRecyclerView)
        {
          GMTrace.i(19568810524672L, 145799);
          int i = (int)ab.getContext().getResources().getDimension(R.f.aQq);
          paramAnonymousRect.left = (i / 2);
          paramAnonymousRect.bottom = i;
          paramAnonymousRect.top = i;
          paramAnonymousRect.right = (i / 2);
          GMTrace.o(19568810524672L, 145799);
        }
      });
      localObject1 = new g(this);
      ((g)localObject1).setOrientation(0);
      this.lEl.a((RecyclerView.h)localObject1);
      i = getResources().getDisplayMetrics().widthPixels / 7;
      localObject1 = new f(this, this.lEn, i, this.lDF);
      this.lEl.a((RecyclerView.a)localObject1);
      this.lEl.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19568005218304L, 145793);
          int i = (int)ab.getContext().getResources().getDimension(R.f.aQq);
          int j = ImagePreviewUI.this.getResources().getDisplayMetrics().widthPixels / 7;
          ImagePreviewUI.o(ImagePreviewUI.this).getLayoutParams().height = (i * 2 + j);
          ImagePreviewUI.o(ImagePreviewUI.this).smoothScrollToPosition(ImagePreviewUI.g(ImagePreviewUI.this).intValue());
          GMTrace.o(19568005218304L, 145793);
        }
      });
      if (this.lEn.size() <= 0) {
        break label1325;
      }
      this.lEl.setVisibility(0);
      label988:
      this.lEl.a(new android.support.v7.widget.v());
      ((f)localObject1).lFa.B(this.lEl);
      ((f)localObject1).lEU = new f.b()
      {
        public final void C(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(19567602565120L, 145790);
          w.i("MicroMsg.ImagePreviewUIChangelcai", "[onItemMoved] fromPos:%s, toPos:%s,visiblePos:%s, mPosition:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt3), ImagePreviewUI.g(ImagePreviewUI.this) });
          if (!ImagePreviewUI.p(ImagePreviewUI.this))
          {
            com.tencent.mm.plugin.gallery.a.a.swap(ImagePreviewUI.r(ImagePreviewUI.this), paramAnonymousInt1, paramAnonymousInt2);
            c localc = ImagePreviewUI.h(ImagePreviewUI.this);
            int i = ImagePreviewUI.g(ImagePreviewUI.this).intValue();
            w.i("MicroMsg.ImageAdapter", "[swapPosition]from:%s to:%s curPos:%s visiblePos:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(i), Integer.valueOf(paramAnonymousInt3) });
            if (!localc.lDF)
            {
              com.tencent.mm.plugin.gallery.a.a.swap(localc.lDE, paramAnonymousInt1, paramAnonymousInt2);
              localc.lDH = paramAnonymousInt3;
              localc.lDI = ((View)localc.wgn.get(i));
              localc.wgl.remove(localc.lDI);
              localc.wgm.clear();
              localc.wgn.clear();
              localc.lDJ = true;
              localc.notifyDataSetChanged();
            }
            ImagePreviewUI.q(ImagePreviewUI.this).c(paramAnonymousInt3, false);
            ((f)ImagePreviewUI.o(ImagePreviewUI.this).fl()).ck(paramAnonymousInt3, paramAnonymousInt3);
            com.tencent.mm.plugin.gallery.model.c.lBl = true;
            GMTrace.o(19567602565120L, 145790);
            return;
          }
          com.tencent.mm.plugin.gallery.model.c.lBj = true;
          GMTrace.o(19567602565120L, 145790);
        }
        
        public final void cj(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(19567468347392L, 145789);
          w.i("MicroMsg.ImagePreviewUIChangelcai", "[onItemMove]fromPos:%s, toPos:%s, mPosition:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), ImagePreviewUI.g(ImagePreviewUI.this) });
          GMTrace.o(19567468347392L, 145789);
        }
        
        public final void ow(int paramAnonymousInt)
        {
          GMTrace.i(19567334129664L, 145788);
          w.i("MicroMsg.ImagePreviewUI", "[onItemClick] position:%s %s", new Object[] { Integer.valueOf(paramAnonymousInt), Boolean.valueOf(ImagePreviewUI.p(ImagePreviewUI.this)) });
          ((f)ImagePreviewUI.o(ImagePreviewUI.this).fl()).ck(paramAnonymousInt, paramAnonymousInt);
          ImagePreviewUI.q(ImagePreviewUI.this).c(paramAnonymousInt, false);
          if (!ImagePreviewUI.p(ImagePreviewUI.this))
          {
            com.tencent.mm.plugin.gallery.model.c.lBm = true;
            GMTrace.o(19567334129664L, 145788);
            return;
          }
          com.tencent.mm.plugin.gallery.model.c.lBk = true;
          GMTrace.o(19567334129664L, 145788);
        }
      };
      this.lEk = ((MMViewPager)findViewById(R.h.bCs));
      this.lEk.setVerticalFadingEdgeEnabled(false);
      this.lEk.setHorizontalFadingEdgeEnabled(false);
      this.lEk.wfX = new ViewPager.e()
      {
        public final void V(int paramAnonymousInt)
        {
          GMTrace.i(19566528823296L, 145782);
          com.tencent.mm.plugin.gallery.model.c.oe(paramAnonymousInt);
          String str = ImagePreviewUI.h(ImagePreviewUI.this).iH(paramAnonymousInt);
          ImagePreviewUI.a(ImagePreviewUI.this, paramAnonymousInt, str);
          boolean bool = ImagePreviewUI.d(ImagePreviewUI.this).contains(str);
          ImagePreviewUI.a(ImagePreviewUI.this, Integer.valueOf(paramAnonymousInt));
          Object localObject = ImagePreviewUI.e(ImagePreviewUI.this);
          int i;
          if (bool)
          {
            i = R.k.cLt;
            ((ImageButton)localObject).setImageResource(i);
            if (!ImagePreviewUI.b(ImagePreviewUI.this)) {
              break label194;
            }
            ImagePreviewUI.c(ImagePreviewUI.this).setImageResource(R.k.cOv);
            label106:
            ImagePreviewUI.this.sq(String.format("%d/%d", new Object[] { Integer.valueOf(paramAnonymousInt + 1), Integer.valueOf(ImagePreviewUI.h(ImagePreviewUI.this).getCount()) }));
            localObject = ImagePreviewUI.h(ImagePreviewUI.this).lDL;
            if (((e)localObject).lEi != -1) {
              break label273;
            }
            i = 0;
            label170:
            if (i != 0) {
              break label210;
            }
            ((e)localObject).ov(paramAnonymousInt);
          }
          for (;;)
          {
            i += 1;
            break label170;
            i = R.k.cLu;
            break;
            label194:
            ImagePreviewUI.c(ImagePreviewUI.this).setImageResource(R.k.cOu);
            break label106;
            label210:
            if ((paramAnonymousInt + i > paramAnonymousInt + 3) && (paramAnonymousInt - i < Math.max(paramAnonymousInt - 3, 0))) {
              break label294;
            }
            if (paramAnonymousInt + i <= paramAnonymousInt + 3) {
              ((e)localObject).ov(paramAnonymousInt + i);
            }
            if (paramAnonymousInt - i >= Math.max(paramAnonymousInt - 3, 0)) {
              ((e)localObject).ov(paramAnonymousInt - i);
            }
          }
          label273:
          if (((e)localObject).lEi > paramAnonymousInt) {
            ((e)localObject).ov(Math.max(paramAnonymousInt - 3, 0));
          }
          for (;;)
          {
            label294:
            ((e)localObject).lEi = paramAnonymousInt;
            w.d("MicroMsg.ImagePreviewUI", "onItemSelected, pos = " + paramAnonymousInt);
            localObject = com.tencent.mm.plugin.gallery.model.c.ze(str);
            if ((ImagePreviewUI.t(ImagePreviewUI.this).getVisibility() == 0) || (ImagePreviewUI.u(ImagePreviewUI.this).getVisibility() == 0))
            {
              ImagePreviewUI.a(ImagePreviewUI.this, str, (GalleryItem.MediaItem)localObject);
              ImagePreviewUI.a(ImagePreviewUI.this, (GalleryItem.MediaItem)localObject);
            }
            GMTrace.o(19566528823296L, 145782);
            return;
            if (((e)localObject).lEi < paramAnonymousInt) {
              ((e)localObject).ov(paramAnonymousInt + 3);
            }
          }
        }
        
        public final void W(int paramAnonymousInt)
        {
          GMTrace.i(19566797258752L, 145784);
          if (ImagePreviewUI.h(ImagePreviewUI.this) != null) {
            ImagePreviewUI.h(ImagePreviewUI.this).lDM.W(paramAnonymousInt);
          }
          GMTrace.o(19566797258752L, 145784);
        }
        
        public final void a(int paramAnonymousInt1, float paramAnonymousFloat, int paramAnonymousInt2)
        {
          GMTrace.i(19566663041024L, 145783);
          GMTrace.o(19566663041024L, 145783);
        }
      };
      this.lEk.wfV = new MMViewPager.e()
      {
        public final void aDF()
        {
          GMTrace.i(19567871000576L, 145792);
          GMTrace.o(19567871000576L, 145792);
        }
        
        public final void alM()
        {
          GMTrace.i(19567736782848L, 145791);
          ImagePreviewUI.v(ImagePreviewUI.this);
          GMTrace.o(19567736782848L, 145791);
        }
      };
      this.lEj = new c(this);
      ((f)this.lEl.fl()).lER = this.lEj;
      if (this.lDF) {
        break label1337;
      }
      this.lEj.E(this.lEm);
      this.lEj.lDF = false;
      if (this.lEm.size() <= 0) {
        break label1446;
      }
      localObject1 = (String)this.lEm.get(this.lEo.intValue());
    }
    for (;;)
    {
      this.lEk.a(this.lEj);
      this.lEk.Y(this.lEo.intValue());
      i = aDD().indexOf(this.lEj.iH(this.lEo.intValue()));
      ((f)this.lEl.fl()).ck(i, this.lEo.intValue());
      Object localObject2 = com.tencent.mm.plugin.gallery.model.c.ze((String)localObject1);
      a((String)localObject1, (GalleryItem.MediaItem)localObject2);
      c((GalleryItem.MediaItem)localObject2);
      sq(String.format("%d/%d", new Object[] { Integer.valueOf(this.lEo.intValue() + 1), Integer.valueOf(this.lEj.getCount()) }));
      GMTrace.o(11932224454656L, 88902);
      return;
      this.lEp.setImageResource(R.k.cOu);
      break;
      label1325:
      this.lEl.setVisibility(8);
      break label988;
      label1337:
      localObject1 = this.lEj;
      localObject2 = this.lCi;
      ((c)localObject1).lCi.clear();
      ((c)localObject1).lCi.addAll((Collection)localObject2);
      ((c)localObject1).reset();
      ((c)localObject1).notifyDataSetChanged();
      this.lEj.lDF = true;
      if (this.lEo.intValue() >= this.lCi.size()) {
        this.lEo = Integer.valueOf(0);
      }
      if (this.lCi.size() > 0) {
        localObject1 = ((GalleryItem.MediaItem)this.lCi.get(this.lEo.intValue())).gVn;
      } else {
        label1446:
        localObject1 = "";
      }
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(11932627107840L, 88905);
    GMTrace.o(11932627107840L, 88905);
    return 1;
  }
  
  protected final void bH(View paramView)
  {
    GMTrace.i(11932090236928L, 88901);
    if (com.tencent.mm.compatible.e.b.aF(this))
    {
      setContentView(paramView);
      GMTrace.o(11932090236928L, 88901);
      return;
    }
    ad.d(ad.a(getWindow(), null), this.vKB.vKI);
    ((ViewGroup)this.vKB.vKI.getParent()).removeView(this.vKB.vKI);
    ((ViewGroup)getWindow().getDecorView()).addView(this.vKB.vKI, 0);
    GMTrace.o(11932090236928L, 88901);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11931956019200L, 88900);
    int i = R.i.czN;
    GMTrace.o(11931956019200L, 88900);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(11932492890112L, 88904);
    w.i("MicroMsg.ImagePreviewUI", "test onActivityResult");
    if (paramInt1 == 4371) {
      if (paramInt2 == -1)
      {
        setResult(-1, paramIntent);
        finish();
      }
    }
    while (paramInt1 == 4372)
    {
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        this.lEG = true;
        String str1 = paramIntent.getStringExtra("before_photo_edit");
        Object localObject1 = com.tencent.mm.plugin.gallery.model.c.aCP().iterator();
        for (;;)
        {
          if (((Iterator)localObject1).hasNext()) {
            if (str1.equals(((Bundle)((Iterator)localObject1).next()).getString("before_photo_edit")))
            {
              ((Iterator)localObject1).remove();
              continue;
              if (this.lEn.size() > 0)
              {
                zi((String)this.lEn.get(0));
                break;
              }
              w.e("MicroMsg.ImagePreviewUI", "selectedPath has unexpected size() [%d]", new Object[] { Integer.valueOf(this.lEn.size()) });
              break;
              if (paramInt1 != 4370) {
                break;
              }
              if (paramInt2 == -1) {
                setResult(-1, paramIntent);
              }
              if (paramIntent == null) {
                break;
              }
              setResult(-1, paramIntent.putExtra("GalleryUI_IsSendImgBackground", true));
              finish();
              break;
            }
          }
        }
        com.tencent.mm.plugin.gallery.model.c.aCP().add(paramIntent.getBundleExtra("report_info"));
        localObject1 = paramIntent.getStringExtra("after_photo_edit");
        String str2 = paramIntent.getStringExtra("tmp_photo_edit");
        w.i("MicroMsg.ImagePreviewUI", "rawEditPhotoPath:%s lastEditPhotoPath;%s", new Object[] { str1, localObject1 });
        if (this.lEm != null)
        {
          this.lEm.clear();
          Object localObject2 = paramIntent.getStringArrayListExtra("preview_image_list");
          if (localObject2 != null) {
            this.lEm.addAll((Collection)localObject2);
          }
          localObject2 = this.lEj.ot(this.lEo.intValue());
          if (localObject2 == null)
          {
            w.e("MicroMsg.ImagePreviewUI", "item is null!!! mPosition:%s rawEditPhotoPath:%s lastEditPhotoPath:%s", new Object[] { this.lEo, str1, localObject1 });
            GMTrace.o(11932492890112L, 88904);
            return;
          }
          ((GalleryItem.MediaItem)localObject2).lBC = str1;
          ((GalleryItem.MediaItem)localObject2).gVn = ((String)localObject1);
          ((GalleryItem.MediaItem)localObject2).kXD = ((String)localObject1);
          ((GalleryItem.MediaItem)localObject2).lBD = str2;
          ((GalleryItem.MediaItem)localObject2).mMimeType = "edit";
          com.tencent.mm.plugin.gallery.model.c.aCO().add(localObject2);
          com.tencent.mm.plugin.gallery.model.c.aCK().a(new b.b()
          {
            public final void zd(String paramAnonymousString)
            {
              GMTrace.i(19566394605568L, 145781);
              new ae(ImagePreviewUI.this.getMainLooper()).post(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(19568273653760L, 145795);
                  ImagePreviewUI.h(ImagePreviewUI.this).E(ImagePreviewUI.r(ImagePreviewUI.this));
                  Object localObject = (f)ImagePreviewUI.o(ImagePreviewUI.this).fl();
                  ArrayList localArrayList = ImagePreviewUI.r(ImagePreviewUI.this);
                  ((f)localObject).lET.clear();
                  ((f)localObject).lET.addAll(localArrayList);
                  ((RecyclerView.a)localObject).TS.notifyChanged();
                  localObject = ImagePreviewUI.11.this.jjE.getStringArrayListExtra("preview_select_image_list");
                  ImagePreviewUI.d(ImagePreviewUI.this).clear();
                  if (localObject != null) {
                    ImagePreviewUI.d(ImagePreviewUI.this).addAll((Collection)localObject);
                  }
                  ImagePreviewUI.this.aH(0, ImagePreviewUI.m(ImagePreviewUI.this));
                  ImagePreviewUI.f(ImagePreviewUI.this).setText(ImagePreviewUI.this.vKB.vKW.getString(R.l.dyS) + ImagePreviewUI.aDE());
                  GMTrace.o(19568273653760L, 145795);
                }
              });
              paramAnonymousString = com.tencent.mm.plugin.gallery.model.c.aCK().lAO;
              if ((paramAnonymousString.gsw != null) && (paramAnonymousString.gsw.contains(this))) {
                paramAnonymousString.gsw.remove(this);
              }
              GMTrace.o(19566394605568L, 145781);
            }
          });
          com.tencent.mm.plugin.gallery.model.c.aCK().b((String)localObject1, ((GalleryItem.MediaItem)localObject2).getType(), (String)localObject1, ((GalleryItem.MediaItem)localObject2).lBE);
          w.i("MicroMsg.ImagePreviewUI", "photo_edit_back!");
        }
      }
      GMTrace.o(11932492890112L, 88904);
      return;
    }
    if (paramIntent != null)
    {
      setResult(-1, paramIntent.putExtra("GalleryUI_IsSendImgBackground", true));
      finish();
    }
    GMTrace.o(11932492890112L, 88904);
  }
  
  @TargetApi(16)
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11931553366016L, 88897);
    final long l = bg.Pw();
    super.onCreate(paramBundle);
    lc(true);
    new ae().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11942156566528L, 88976);
        ImagePreviewUI.a(ImagePreviewUI.this, true);
        com.tencent.mm.plugin.gallery.model.c.aCM().oj(-8);
        w.v("MicroMsg.ImagePreviewUI", "test oncreate post: %d", new Object[] { Long.valueOf(bg.aI(l)) });
        GMTrace.o(11942156566528L, 88976);
      }
    });
    bindService(new Intent(this.vKB.vKW, GalleryStubService.class), this.keh, 1);
    MP();
    w.v("MicroMsg.ImagePreviewUI", "test oncreate: %d", new Object[] { Long.valueOf(bg.aI(l)) });
    GMTrace.o(11931553366016L, 88897);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11933432414208L, 88911);
    super.onDestroy();
    if ((com.tencent.mm.plugin.gallery.model.c.aCL().aDo() == 3) && (getIntent().getBooleanExtra("preview_image", false)) && (getIntent().getIntExtra("max_select_count", 0) == 1))
    {
      w.i("MicroMsg.ImagePreviewUI", "clear photo edit cache!");
      sendBroadcast(new Intent("com.tencent.mm.plugin.photoedit.action.clear"));
    }
    if (this.lEj != null) {
      this.lEj.release();
    }
    com.tencent.mm.plugin.gallery.model.c.z(null);
    unbindService(this.keh);
    GMTrace.o(11933432414208L, 88911);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(11933298196480L, 88910);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(11933298196480L, 88910);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(11933298196480L, 88910);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(11931821801472L, 88899);
    if (this.lEr != null) {
      this.lEr.stopTimer();
    }
    super.onPause();
    GMTrace.o(11931821801472L, 88899);
  }
  
  protected void onResume()
  {
    GMTrace.i(11931687583744L, 88898);
    super.onResume();
    GMTrace.o(11931687583744L, 88898);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\ui\ImagePreviewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */