package com.tencent.mm.plugin.gallery.ui;

import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.compatible.i.b;
import com.tencent.mm.plugin.gallery.model.GalleryItem.AlbumItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.c;
import com.tencent.mm.plugin.gallery.model.g.a;
import com.tencent.mm.plugin.gallery.model.g.b;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.plugin.gallery.stub.GalleryStubService;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.DrawedCallBackFrameLayout;
import com.tencent.mm.ui.base.DrawedCallBackFrameLayout.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p.b;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

@com.tencent.mm.ui.base.a(19)
public class AlbumPreviewUI
  extends MMActivity
  implements g.b
{
  static long start;
  private String eMI;
  private ProgressDialog htG;
  private ServiceConnection keh;
  private GridView lCF;
  private TextView lCG;
  private boolean lCH;
  private boolean lCI;
  private TextView lCJ;
  private a lCK;
  private TextView lCL;
  private TextView lCM;
  private ImageFolderMgrView lCN;
  private TextView lCO;
  private ImageButton lCP;
  private String lCQ;
  private String lCR;
  private int lCS;
  private String lCT;
  private boolean lCU;
  private boolean lCV;
  private boolean lCW;
  private boolean lCX;
  private boolean lCY;
  private boolean lCZ;
  private com.tencent.mm.plugin.gallery.stub.a lCh;
  private boolean lDa;
  private int lDb;
  private int lDc;
  boolean lDd;
  private int lDe;
  private int lDf;
  private long lDg;
  private long lDh;
  private int lDi;
  private long lDj;
  private a.a lDk;
  private boolean lDl;
  private HashMap<String, Integer> lDm;
  private String toUser;
  
  static
  {
    GMTrace.i(20652752896000L, 153875);
    start = 0L;
    GMTrace.o(20652752896000L, 153875);
  }
  
  public AlbumPreviewUI()
  {
    GMTrace.i(11949270106112L, 89029);
    this.lCU = false;
    this.lCV = false;
    this.lCW = false;
    this.lCX = false;
    this.lCY = false;
    this.lCZ = false;
    this.lDa = false;
    this.lDd = false;
    this.lDe = 0;
    this.lDf = 0;
    this.lCh = null;
    this.lDg = 0L;
    this.lDi = -1;
    this.keh = new ServiceConnection()
    {
      public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
      {
        GMTrace.i(11941485477888L, 88971);
        w.d("MicroMsg.AlbumPreviewUI", "onServiceConnected");
        AlbumPreviewUI.a(AlbumPreviewUI.this, com.tencent.mm.plugin.gallery.stub.a.a.Q(paramAnonymousIBinder));
        if (AlbumPreviewUI.a(AlbumPreviewUI.this) != null) {
          AlbumPreviewUI.a(AlbumPreviewUI.this).lCh = AlbumPreviewUI.b(AlbumPreviewUI.this);
        }
        GMTrace.o(11941485477888L, 88971);
      }
      
      public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
      {
        GMTrace.i(11941619695616L, 88972);
        w.d("MicroMsg.AlbumPreviewUI", "onServiceDisconnected");
        AlbumPreviewUI.a(AlbumPreviewUI.this, null);
        GMTrace.o(11941619695616L, 88972);
      }
    };
    this.lDj = -1L;
    this.lDk = new a.a()
    {
      private View.OnClickListener lgu;
      
      public final View getView()
      {
        GMTrace.i(15618917007360L, 116370);
        View localView = View.inflate(AlbumPreviewUI.this.vKB.vKW, R.i.crH, null);
        localView.setOnClickListener(this.lgu);
        TextView localTextView = (TextView)localView.findViewById(R.h.bMJ);
        if ((c.aCL().aDp() == 2) || (c.aCL().aDo() == 13)) {
          localTextView.setText(R.l.dzv);
        }
        for (;;)
        {
          localView.setLayerType(1, null);
          GMTrace.o(15618917007360L, 116370);
          return localView;
          if (c.aCL().aDp() == 1) {
            localTextView.setText(R.l.dzu);
          }
        }
      }
    };
    this.lDl = false;
    this.lDm = new HashMap();
    GMTrace.o(11949270106112L, 89029);
  }
  
  private static int[] C(ArrayList<GalleryItem.MediaItem> paramArrayList)
  {
    GMTrace.i(15092649295872L, 112449);
    int[] arrayOfInt = new int[4];
    arrayOfInt[0] = paramArrayList.size();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      GalleryItem.MediaItem localMediaItem = (GalleryItem.MediaItem)paramArrayList.next();
      if (localMediaItem != null) {
        if ((!bg.nm(localMediaItem.mMimeType)) && (localMediaItem.mMimeType.equalsIgnoreCase("image/gif"))) {
          arrayOfInt[2] += 1;
        } else if (localMediaItem.getType() == 2) {
          arrayOfInt[3] += 1;
        } else if (localMediaItem.getType() == 1) {
          arrayOfInt[1] += 1;
        }
      }
    }
    GMTrace.o(15092649295872L, 112449);
    return arrayOfInt;
  }
  
  private void a(GalleryItem.AlbumItem paramAlbumItem)
  {
    GMTrace.i(15619185442816L, 116372);
    if (paramAlbumItem == null)
    {
      GMTrace.o(15619185442816L, 116372);
      return;
    }
    if (bg.aq(this.lCR, "").equals(paramAlbumItem.lBA))
    {
      w.w("MicroMsg.AlbumPreviewUI", "want to reset folder, same folder, return");
      GMTrace.o(15619185442816L, 116372);
      return;
    }
    c.aCQ().addAll(this.lCK.lCj);
    w.d("MicroMsg.AlbumPreviewUI", "reset folder[%s], path[%s]", new Object[] { paramAlbumItem.lBA, paramAlbumItem.aDc() });
    this.lCQ = paramAlbumItem.aDc();
    this.lCR = paramAlbumItem.lBA;
    if (paramAlbumItem.lBB != null) {
      this.lCS = paramAlbumItem.lBB.getType();
    }
    if (bg.nm(this.lCQ))
    {
      w.w("MicroMsg.AlbumPreviewUI", "reset folder path failed");
      this.lCQ = this.lCR;
    }
    Object localObject2;
    if (!bg.nm(this.lCR))
    {
      localObject1 = this.lCK;
      localObject2 = this.lDk;
      if (localObject2 == null)
      {
        w.w("MicroMsg.AlbumAdapter", "removeHeader error, header is null");
        this.lCJ.setText(this.lCR);
      }
    }
    for (;;)
    {
      this.lCK.lCi.clear();
      op(this.lCK.lCj.size());
      this.lCK.notifyDataSetChanged();
      if (this.htG != null) {
        this.htG.dismiss();
      }
      getString(R.l.cUG);
      this.htG = h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(11926855745536L, 88862);
          GMTrace.o(11926855745536L, 88862);
        }
      });
      start = System.currentTimeMillis();
      localObject2 = this.lCR;
      if (paramAlbumItem.lBB != null) {
        break label370;
      }
      GMTrace.o(15619185442816L, 116372);
      return;
      ((a)localObject1).lCm.remove(localObject2);
      break;
      if (getIntent().getBooleanExtra("show_header_view", true)) {
        this.lCK.a(this.lDk);
      }
      anv();
      this.lCS = c.aCL().aDp();
    }
    label370:
    int i = paramAlbumItem.lBB.getType();
    int j = c.aCL().aDp();
    w.i("MicroMsg.AlbumPreviewUI", "folder type[%d] queryType[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
    Object localObject1 = localObject2;
    if (j != 2)
    {
      localObject1 = localObject2;
      if (paramAlbumItem.lBB.getType() == 2) {
        localObject1 = "";
      }
    }
    if (bg.nm(paramAlbumItem.lBA)) {
      i = 3;
    }
    this.lDj = System.currentTimeMillis();
    c.aCL().e((String)localObject1, i, this.lDj);
    GMTrace.o(15619185442816L, 116372);
  }
  
  private void aDv()
  {
    GMTrace.i(11951551807488L, 89046);
    if (!this.lDl)
    {
      GMTrace.o(11951551807488L, 89046);
      return;
    }
    SharedPreferences localSharedPreferences = getSharedPreferences("gallery_last_choose_album", 0);
    w.i("MicroMsg.AlbumPreviewUI", "last selected folderName and path: " + this.lCR + ", " + this.lCQ);
    localSharedPreferences.edit().putString(c.aCL().aDp(), this.lCR + "|" + this.lCQ + "|" + this.lCS).commit();
    GMTrace.o(11951551807488L, 89046);
  }
  
  private void ahJ()
  {
    GMTrace.i(11950612283392L, 89039);
    if (!k.c(this.vKB.vKW, com.tencent.mm.compatible.util.e.fRZ, "microMsg." + System.currentTimeMillis() + ".jpg", 4369))
    {
      Toast.makeText(this.vKB.vKW, getString(R.l.dWY), 1).show();
      GMTrace.o(11950612283392L, 89039);
      return;
    }
    c.aCM().oj(0);
    System.gc();
    GMTrace.o(11950612283392L, 89039);
  }
  
  private void anv()
  {
    GMTrace.i(11950209630208L, 89036);
    if (c.aCL().aDp() == 3)
    {
      oM(R.l.dyH);
      this.lCJ.setText(R.l.dyH);
      GMTrace.o(11950209630208L, 89036);
      return;
    }
    if (c.aCL().aDp() == 1)
    {
      oM(R.l.dzq);
      this.lCJ.setText(R.l.dyG);
      GMTrace.o(11950209630208L, 89036);
      return;
    }
    oM(R.l.dyI);
    this.lCJ.setText(R.l.dyI);
    GMTrace.o(11950209630208L, 89036);
  }
  
  private boolean b(GalleryItem.MediaItem paramMediaItem)
  {
    GMTrace.i(15092917731328L, 112451);
    if (paramMediaItem == null)
    {
      w.e("MicroMsg.AlbumPreviewUI", "[checkSelectedVideo] item is null!");
      GMTrace.o(15092917731328L, 112451);
      return false;
    }
    if (this.lCh == null)
    {
      w.e("MicroMsg.AlbumPreviewUI", "[checkSelectedVideo] invoker is null!");
      GMTrace.o(15092917731328L, 112451);
      return false;
    }
    if (c.aCL().aDo() == 3)
    {
      if (!new File(paramMediaItem.gVn).exists())
      {
        h.bl(this, getString(R.l.dzl));
        GMTrace.o(15092917731328L, 112451);
        return false;
      }
      try
      {
        if (this.lCh.zh(paramMediaItem.gVn) > 300)
        {
          h.bl(this, getString(R.l.dzm));
          GMTrace.o(15092917731328L, 112451);
          return false;
        }
      }
      catch (RemoteException paramMediaItem)
      {
        w.printErrStackTrace("MicroMsg.AlbumPreviewUI", paramMediaItem, "", new Object[0]);
        GMTrace.o(15092917731328L, 112451);
        return true;
      }
    }
    GMTrace.o(15092917731328L, 112451);
    return true;
  }
  
  private void op(int paramInt)
  {
    GMTrace.i(11951149154304L, 89043);
    if (paramInt == 0)
    {
      this.lCG.setEnabled(false);
      lf(false);
      if (paramInt != 0) {
        break label76;
      }
      this.lCG.setText(R.l.dyT);
    }
    for (;;)
    {
      aH(0, oq(paramInt));
      GMTrace.o(11951149154304L, 89043);
      return;
      this.lCG.setEnabled(true);
      lf(true);
      break;
      label76:
      this.lCG.setText(getString(R.l.dyT) + "(" + paramInt + ")");
    }
  }
  
  private String oq(int paramInt)
  {
    GMTrace.i(11951283372032L, 89044);
    switch (c.aCL().aDo())
    {
    default: 
      if ((paramInt == 0) || (this.lDb <= 1))
      {
        str = getString(R.l.cUs);
        GMTrace.o(11951283372032L, 89044);
        return str;
      }
      break;
    case 4: 
    case 7: 
    case 8: 
    case 13: 
      if ((paramInt == 0) || (this.lDb <= 1))
      {
        str = getString(R.l.dyU);
        GMTrace.o(11951283372032L, 89044);
        return str;
      }
      str = getString(R.l.dyU) + "(" + paramInt + "/" + this.lDb + ")";
      GMTrace.o(11951283372032L, 89044);
      return str;
    }
    String str = getString(R.l.dyO, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.lDb) });
    GMTrace.o(11951283372032L, 89044);
    return str;
  }
  
  public final void A(int paramInt, boolean paramBoolean)
  {
    boolean bool1 = true;
    GMTrace.i(11950343847936L, 89037);
    switch (c.aCL().aDp())
    {
    }
    for (;;)
    {
      GMTrace.o(11950343847936L, 89037);
      return;
      if ((bg.nm(this.eMI)) || ("medianote".equals(this.toUser))) {
        continue;
      }
      if (bg.Pw() - this.lDg < 1000L)
      {
        w.w("MicroMsg.AlbumPreviewUI", "sendimg btn event frequence limit");
        GMTrace.o(11950343847936L, 89037);
        return;
      }
      w.i("MicroMsg.AlbumPreviewUI", "switch to SendImgProxyUI");
      Object localObject = (GalleryItem.MediaItem)this.lCK.lCi.get(paramInt);
      if (((GalleryItem.MediaItem)localObject).getType() == 2) {
        continue;
      }
      try
      {
        com.tencent.mm.plugin.gallery.stub.a locala = this.lCh;
        localObject = ((GalleryItem.MediaItem)localObject).gVn;
        String str = this.toUser;
        if (this.lCU) {}
        for (;;)
        {
          locala.a((String)localObject, str, bool1, 0, paramBoolean);
          GMTrace.o(11950343847936L, 89037);
          return;
          boolean bool2 = this.lCY;
          if (bool2) {
            bool1 = false;
          }
        }
      }
      catch (Exception localException) {}
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(11950478065664L, 89038);
    Object localObject = getIntent().getExtras().keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      w.d("MicroMsg.AlbumPreviewUI", "key=%s | value=%s", new Object[] { str, getIntent().getExtras().get(str) });
    }
    this.eMI = getIntent().getStringExtra("GalleryUI_FromUser");
    this.toUser = getIntent().getStringExtra("GalleryUI_ToUser");
    this.lDb = getIntent().getIntExtra("max_select_count", 9);
    boolean bool;
    if (c.aCL().aDo() == 4)
    {
      bool = true;
      this.lCU = bool;
      if (c.aCL().aDo() != 5) {
        break label838;
      }
      bool = true;
      label150:
      this.lCW = bool;
      if (c.aCL().aDo() != 9) {
        break label843;
      }
      bool = true;
      label168:
      this.lCX = bool;
      this.lCQ = getIntent().getStringExtra("folder_path");
      this.lCR = getIntent().getStringExtra("folder_name");
      if (bg.nm(this.lCQ))
      {
        w.e("MicroMsg.AlbumPreviewUI", "get folder path failed");
        this.lCQ = this.lCR;
      }
      this.lCY = getIntent().getBooleanExtra("key_send_raw_image", false);
      this.lCZ = getIntent().getBooleanExtra("key_can_select_video_and_pic", false);
      this.lCO = ((TextView)findViewById(R.h.bSz));
      this.lCP = ((ImageButton)findViewById(R.h.bSy));
      this.lCO.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11940009082880L, 88960);
          AlbumPreviewUI.c(AlbumPreviewUI.this).performClick();
          GMTrace.o(11940009082880L, 88960);
        }
      });
      if (c.aCL().aDo() != 3) {
        break label848;
      }
      this.lCP.setVisibility(0);
      this.lCO.setVisibility(0);
      label326:
      if (!this.lCY) {
        break label869;
      }
      this.lCP.setImageResource(R.k.cOv);
      label343:
      this.lCP.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11943230308352L, 88984);
          paramAnonymousView = AlbumPreviewUI.this;
          boolean bool;
          if (!AlbumPreviewUI.d(AlbumPreviewUI.this))
          {
            bool = true;
            AlbumPreviewUI.a(paramAnonymousView, bool);
            AlbumPreviewUI.e(AlbumPreviewUI.this);
            AlbumPreviewUI.f(AlbumPreviewUI.this).setText(AlbumPreviewUI.this.vKB.vKW.getString(R.l.dyS) + AlbumPreviewUI.aDw());
            if (!AlbumPreviewUI.d(AlbumPreviewUI.this)) {
              break label127;
            }
            AlbumPreviewUI.c(AlbumPreviewUI.this).setImageResource(R.k.cOv);
          }
          for (;;)
          {
            AlbumPreviewUI.g(AlbumPreviewUI.this);
            GMTrace.o(11943230308352L, 88984);
            return;
            bool = false;
            break;
            label127:
            AlbumPreviewUI.c(AlbumPreviewUI.this).setImageResource(R.k.cOu);
          }
        }
      });
      this.lCL = ((TextView)findViewById(R.h.bdJ));
      this.lCM = ((TextView)findViewById(R.h.bdI));
      this.lCG = ((TextView)findViewById(R.h.bMI));
      if ((c.aCL().aDo() != 0) && (c.aCL().aDo() != 5) && (c.aCL().aDo() != 10) && (c.aCL().aDo() != 11)) {
        break label882;
      }
      findViewById(R.h.bBb).setVisibility(8);
      this.lCG.setVisibility(8);
    }
    for (;;)
    {
      this.lCN = ((ImageFolderMgrView)findViewById(R.h.bGB));
      localObject = this.lCN;
      c.aCL().b((g.a)localObject);
      c.aCL().a((g.a)localObject);
      c.aCL().aDq();
      this.lCN.lDQ = new ImageFolderMgrView.a()
      {
        public final void b(GalleryItem.AlbumItem paramAnonymousAlbumItem)
        {
          GMTrace.i(15619051225088L, 116371);
          AlbumPreviewUI.a(AlbumPreviewUI.this, paramAnonymousAlbumItem);
          GMTrace.o(15619051225088L, 116371);
        }
      };
      this.lCT = getIntent().getStringExtra("send_btn_string");
      findViewById(R.h.bMB).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(15622138232832L, 116394);
          AlbumPreviewUI.u(AlbumPreviewUI.this);
          AlbumPreviewUI.v(AlbumPreviewUI.this).aDy();
          w.d("MicroMsg.AlbumPreviewUI", "click folder times[%d]", new Object[] { Integer.valueOf(AlbumPreviewUI.w(AlbumPreviewUI.this)) });
          GMTrace.o(15622138232832L, 116394);
        }
      });
      this.lCJ = ((TextView)findViewById(R.h.bMC));
      if (this.lCW) {
        lg(false);
      }
      lf(false);
      this.lCF = ((GridView)findViewById(R.h.bMD));
      this.lCF.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, final int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(15622004015104L, 116393);
          if ((c.aCL().aDo() == 0) || (c.aCL().aDo() == 5) || (c.aCL().aDo() == 10) || (c.aCL().aDo() == 11))
          {
            if (c.aCL().aDp() == 2)
            {
              h.a(AlbumPreviewUI.this, true, AlbumPreviewUI.this.getString(R.l.dzt), "", AlbumPreviewUI.this.getString(R.l.cUs), AlbumPreviewUI.this.getString(R.l.cSk), new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(15617843265536L, 116362);
                  paramAnonymous2DialogInterface = AlbumPreviewUI.a(AlbumPreviewUI.this).on(paramAnonymousInt);
                  if (paramAnonymous2DialogInterface == null)
                  {
                    w.w("MicroMsg.AlbumPreviewUI", "get item for video error, null, position %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
                    AlbumPreviewUI.this.setResult(0);
                  }
                  for (;;)
                  {
                    AlbumPreviewUI.this.finish();
                    GMTrace.o(15617843265536L, 116362);
                    return;
                    w.i("MicroMsg.AlbumPreviewUI", "ShowAlert");
                    Intent localIntent = new Intent();
                    localIntent.setData(Uri.parse("file://" + Uri.encode(paramAnonymous2DialogInterface.gVn)));
                    AlbumPreviewUI.this.setResult(-1, localIntent);
                  }
                }
              }, null);
              GMTrace.o(15622004015104L, 116393);
              return;
            }
            paramAnonymousAdapterView = AlbumPreviewUI.a(AlbumPreviewUI.this).on(paramAnonymousInt);
            if (paramAnonymousAdapterView == null)
            {
              w.w("MicroMsg.AlbumPreviewUI", "get item error, null, position %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
              AlbumPreviewUI.this.setResult(0);
            }
            for (;;)
            {
              AlbumPreviewUI.this.finish();
              GMTrace.o(15622004015104L, 116393);
              return;
              paramAnonymousView = new Intent();
              if (paramAnonymousAdapterView.getType() == 2)
              {
                paramAnonymousView.putExtra("is_video", true);
                paramAnonymousView.putExtra("video_full_path", paramAnonymousAdapterView.gVn);
              }
              if (c.aCL().aDo() == 10) {
                paramAnonymousView.putExtra("CropImage_OutputPath", paramAnonymousAdapterView.gVn);
              }
              paramAnonymousView.setData(Uri.parse(Uri.encode(paramAnonymousAdapterView.gVn)));
              w.i("MicroMsg.AlbumPreviewUI", "getItem ok");
              AlbumPreviewUI.this.setResult(-1, paramAnonymousView);
            }
          }
          Intent localIntent;
          if (c.aCL().aDo() == 4)
          {
            if (paramAnonymousInt < AlbumPreviewUI.a(AlbumPreviewUI.this).lCm.size())
            {
              w.w("MicroMsg.AlbumPreviewUI", "POSITION ERROR!!!");
              GMTrace.o(15622004015104L, 116393);
              return;
            }
            paramAnonymousAdapterView = AlbumPreviewUI.a(AlbumPreviewUI.this).on(paramAnonymousInt);
            if (paramAnonymousAdapterView == null)
            {
              w.w("MicroMsg.AlbumPreviewUI", "POSITION ERROR!!! MediaItem == null.");
              GMTrace.o(15622004015104L, 116393);
              return;
            }
            if ((paramAnonymousAdapterView.getType() == 2) && (AlbumPreviewUI.a(AlbumPreviewUI.this).lCj.size() != 0))
            {
              h.bm(AlbumPreviewUI.this.vKB.vKW, com.tencent.mm.br.a.X(AlbumPreviewUI.this.vKB.vKW, R.l.dyN));
              GMTrace.o(15622004015104L, 116393);
              return;
            }
            paramAnonymousView = AlbumPreviewUI.a(AlbumPreviewUI.this).om(paramAnonymousAdapterView.getType());
            c.z(paramAnonymousView);
            localIntent = new Intent(AlbumPreviewUI.this, ImagePreviewUI.class);
            localIntent.putStringArrayListExtra("preview_image_list", AlbumPreviewUI.a(AlbumPreviewUI.this).aDt());
            localIntent.putExtra("preview_all", true);
            localIntent.putExtra("preview_position", paramAnonymousView.indexOf(paramAnonymousAdapterView));
            AlbumPreviewUI.this.A(paramAnonymousInt - AlbumPreviewUI.a(AlbumPreviewUI.this).lCm.size(), true);
            localIntent.putExtra("send_raw_img", AlbumPreviewUI.d(AlbumPreviewUI.this));
            localIntent.putExtra("max_select_count", AlbumPreviewUI.i(AlbumPreviewUI.this));
            localIntent.putExtra("GalleryUI_FromUser", AlbumPreviewUI.j(AlbumPreviewUI.this));
            localIntent.putExtra("GalleryUI_ToUser", AlbumPreviewUI.k(AlbumPreviewUI.this));
            AlbumPreviewUI.this.startActivityForResult(localIntent, 0);
            GMTrace.o(15622004015104L, 116393);
            return;
          }
          if (AlbumPreviewUI.n(AlbumPreviewUI.this))
          {
            if (paramAnonymousInt < AlbumPreviewUI.a(AlbumPreviewUI.this).lCm.size())
            {
              w.w("MicroMsg.AlbumPreviewUI", "POSITION ERROR!!!");
              GMTrace.o(15622004015104L, 116393);
              return;
            }
            paramAnonymousAdapterView = AlbumPreviewUI.a(AlbumPreviewUI.this).on(paramAnonymousInt);
            if (paramAnonymousAdapterView == null)
            {
              w.w("MicroMsg.AlbumPreviewUI", "POSITION ERROR!!! MediaItem == null.");
              GMTrace.o(15622004015104L, 116393);
              return;
            }
            if ((paramAnonymousAdapterView.getType() == 2) && (AlbumPreviewUI.a(AlbumPreviewUI.this).lCj.size() != 0))
            {
              h.bm(AlbumPreviewUI.this.vKB.vKW, com.tencent.mm.br.a.X(AlbumPreviewUI.this.vKB.vKW, R.l.dyN));
              GMTrace.o(15622004015104L, 116393);
              return;
            }
            paramAnonymousView = AlbumPreviewUI.a(AlbumPreviewUI.this).om(paramAnonymousAdapterView.getType());
            c.z(paramAnonymousView);
            localIntent = new Intent(AlbumPreviewUI.this, ImagePreviewUI.class);
            localIntent.putStringArrayListExtra("preview_image_list", AlbumPreviewUI.a(AlbumPreviewUI.this).aDt());
            localIntent.putExtra("preview_all", true);
            localIntent.putExtra("preview_position", paramAnonymousView.indexOf(paramAnonymousAdapterView));
            AlbumPreviewUI.this.A(paramAnonymousInt - AlbumPreviewUI.a(AlbumPreviewUI.this).lCm.size(), true);
            localIntent.putExtra("send_raw_img", AlbumPreviewUI.d(AlbumPreviewUI.this));
            if (paramAnonymousAdapterView.getType() == 2) {}
            for (paramAnonymousInt = 1;; paramAnonymousInt = AlbumPreviewUI.i(AlbumPreviewUI.this))
            {
              localIntent.putExtra("max_select_count", paramAnonymousInt);
              localIntent.putExtra("GalleryUI_FromUser", AlbumPreviewUI.j(AlbumPreviewUI.this));
              localIntent.putExtra("GalleryUI_ToUser", AlbumPreviewUI.k(AlbumPreviewUI.this));
              AlbumPreviewUI.this.startActivityForResult(localIntent, 0);
              GMTrace.o(15622004015104L, 116393);
              return;
            }
          }
          if (paramAnonymousInt < AlbumPreviewUI.a(AlbumPreviewUI.this).lCm.size())
          {
            w.w("MicroMsg.AlbumPreviewUI", "POSITION ERROR!!!");
            GMTrace.o(15622004015104L, 116393);
            return;
          }
          c.z(AlbumPreviewUI.a(AlbumPreviewUI.this).lCi);
          paramAnonymousAdapterView = new Intent(AlbumPreviewUI.this, ImagePreviewUI.class);
          paramAnonymousAdapterView.putStringArrayListExtra("preview_image_list", AlbumPreviewUI.a(AlbumPreviewUI.this).aDt());
          paramAnonymousAdapterView.putExtra("preview_all", true);
          paramAnonymousAdapterView.putExtra("preview_position", paramAnonymousInt - AlbumPreviewUI.a(AlbumPreviewUI.this).lCm.size());
          AlbumPreviewUI.this.A(paramAnonymousInt - AlbumPreviewUI.a(AlbumPreviewUI.this).lCm.size(), true);
          paramAnonymousAdapterView.putExtra("send_raw_img", AlbumPreviewUI.d(AlbumPreviewUI.this));
          paramAnonymousAdapterView.putExtra("max_select_count", AlbumPreviewUI.i(AlbumPreviewUI.this));
          paramAnonymousAdapterView.putExtra("GalleryUI_FromUser", AlbumPreviewUI.j(AlbumPreviewUI.this));
          paramAnonymousAdapterView.putExtra("GalleryUI_ToUser", AlbumPreviewUI.k(AlbumPreviewUI.this));
          AlbumPreviewUI.this.startActivityForResult(paramAnonymousAdapterView, 0);
          GMTrace.o(15622004015104L, 116393);
        }
      });
      this.lCK = new a(this, new a.b()
      {
        public final void B(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(15618380136448L, 116366);
          if (paramAnonymousInt3 == 0)
          {
            GalleryItem.MediaItem localMediaItem = AlbumPreviewUI.a(AlbumPreviewUI.this).on(AlbumPreviewUI.a(AlbumPreviewUI.this).lCm.size() + paramAnonymousInt2);
            if ((localMediaItem != null) && (localMediaItem.getType() == 1)) {
              AlbumPreviewUI.a(AlbumPreviewUI.this, localMediaItem);
            }
            while ((localMediaItem == null) || (localMediaItem.getType() != 2))
            {
              AlbumPreviewUI.b(AlbumPreviewUI.this, paramAnonymousInt1);
              AlbumPreviewUI.this.A(paramAnonymousInt2, true);
              GMTrace.o(15618380136448L, 116366);
              return;
            }
            if (!AlbumPreviewUI.b(AlbumPreviewUI.this, localMediaItem))
            {
              AlbumPreviewUI.a(AlbumPreviewUI.this).lCj.remove(localMediaItem);
              AlbumPreviewUI.a(AlbumPreviewUI.this).notifyDataSetChanged();
              GMTrace.o(15618380136448L, 116366);
              return;
            }
            AlbumPreviewUI.b(AlbumPreviewUI.this, paramAnonymousInt1);
            AlbumPreviewUI.this.A(paramAnonymousInt2, true);
            GMTrace.o(15618380136448L, 116366);
            return;
          }
          AlbumPreviewUI.b(AlbumPreviewUI.this, paramAnonymousInt1);
          AlbumPreviewUI.this.A(paramAnonymousInt2, false);
          GMTrace.o(15618380136448L, 116366);
        }
      });
      if (this.lCU) {
        this.lCK.lCn = true;
      }
      if (this.lCZ) {
        this.lCK.lCn = true;
      }
      this.lCF.setNumColumns(3);
      this.lCF.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        private Runnable lDp;
        
        private void eL(boolean paramAnonymousBoolean)
        {
          GMTrace.i(15623211974656L, 116402);
          if (paramAnonymousBoolean)
          {
            AlbumPreviewUI.x(AlbumPreviewUI.this).removeCallbacks(this.lDp);
            if (AlbumPreviewUI.x(AlbumPreviewUI.this).getVisibility() != 0)
            {
              Object localObject = AlbumPreviewUI.a(AlbumPreviewUI.this).oo(AlbumPreviewUI.y(AlbumPreviewUI.this).getFirstVisiblePosition());
              AlbumPreviewUI.x(AlbumPreviewUI.this).setText((CharSequence)localObject);
              AlbumPreviewUI.x(AlbumPreviewUI.this).clearAnimation();
              localObject = AnimationUtils.loadAnimation(AlbumPreviewUI.this.vKB.vKW, R.a.aLs);
              AlbumPreviewUI.x(AlbumPreviewUI.this).setVisibility(0);
              AlbumPreviewUI.x(AlbumPreviewUI.this).startAnimation((Animation)localObject);
              GMTrace.o(15623211974656L, 116402);
            }
          }
          else
          {
            AlbumPreviewUI.x(AlbumPreviewUI.this).removeCallbacks(this.lDp);
            AlbumPreviewUI.x(AlbumPreviewUI.this).postDelayed(this.lDp, 256L);
          }
          GMTrace.o(15623211974656L, 116402);
        }
        
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(15623480410112L, 116404);
          paramAnonymousAbsListView = AlbumPreviewUI.a(AlbumPreviewUI.this).oo(paramAnonymousInt1);
          AlbumPreviewUI.x(AlbumPreviewUI.this).setText(paramAnonymousAbsListView);
          GMTrace.o(15623480410112L, 116404);
        }
        
        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          GMTrace.i(15623346192384L, 116403);
          w.d("MicroMsg.AlbumPreviewUI", "scroll state[%d]", new Object[] { Integer.valueOf(paramAnonymousInt) });
          if (1 == paramAnonymousInt)
          {
            eL(true);
            GMTrace.o(15623346192384L, 116403);
            return;
          }
          if (paramAnonymousInt == 0) {
            eL(false);
          }
          GMTrace.o(15623346192384L, 116403);
        }
      });
      if (getIntent().getBooleanExtra("show_header_view", true)) {
        this.lCK.a(this.lDk);
      }
      this.lCK.lCl = c.aCL().aDp();
      this.lCK.lCg = this.lDb;
      w.i("MicroMsg.AlbumPreviewUI", "limit count = " + getIntent().getIntExtra("max_select_count", 9));
      this.lCF.setAdapter(this.lCK);
      anv();
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(15618245918720L, 116365);
          w.i("MicroMsg.AlbumPreviewUI", "backBtn");
          AlbumPreviewUI.this.setResult(-2);
          if (AlbumPreviewUI.v(AlbumPreviewUI.this).Ne)
          {
            AlbumPreviewUI.v(AlbumPreviewUI.this).aDy();
            GMTrace.o(15618245918720L, 116365);
            return true;
          }
          AlbumPreviewUI.this.finish();
          GMTrace.o(15618245918720L, 116365);
          return true;
        }
      });
      localObject = (ViewGroup)findViewById(R.h.bZf);
      if ((localObject instanceof DrawedCallBackFrameLayout)) {
        ((DrawedCallBackFrameLayout)localObject).vZi = new DrawedCallBackFrameLayout.a()
        {
          public final void aDr()
          {
            GMTrace.i(15618514354176L, 116367);
            try
            {
              AlbumPreviewUI.b(AlbumPreviewUI.this).aDr();
              if (!AlbumPreviewUI.this.lDd) {}
            }
            catch (Exception localException)
            {
              try
              {
                AlbumPreviewUI.this.unbindService(AlbumPreviewUI.z(AlbumPreviewUI.this));
                AlbumPreviewUI.this.lDd = false;
                GMTrace.o(15618514354176L, 116367);
                return;
                localException = localException;
                w.printErrStackTrace("MicroMsg.AlbumPreviewUI", localException, "", new Object[0]);
              }
              catch (Throwable localThrowable)
              {
                for (;;)
                {
                  w.printErrStackTrace("MicroMsg.AlbumPreviewUI", localThrowable, "Failed to unbindService when onViewDrawed is invoked.", new Object[0]);
                }
              }
            }
          }
        };
      }
      GMTrace.o(11950478065664L, 89038);
      return;
      bool = false;
      break;
      label838:
      bool = false;
      break label150;
      label843:
      bool = false;
      break label168;
      label848:
      this.lCP.setVisibility(8);
      this.lCO.setVisibility(8);
      break label326;
      label869:
      this.lCP.setImageResource(R.k.cOu);
      break label343;
      label882:
      this.lCG.setVisibility(0);
      this.lCG.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(15092246642688L, 112446);
          AlbumPreviewUI.h(AlbumPreviewUI.this);
          paramAnonymousView = new Intent(AlbumPreviewUI.this, ImagePreviewUI.class);
          c.z(AlbumPreviewUI.a(AlbumPreviewUI.this).lCi);
          paramAnonymousView.putStringArrayListExtra("preview_image_list", AlbumPreviewUI.a(AlbumPreviewUI.this).aDt());
          paramAnonymousView.putExtra("max_select_count", AlbumPreviewUI.i(AlbumPreviewUI.this));
          paramAnonymousView.putExtra("send_raw_img", AlbumPreviewUI.d(AlbumPreviewUI.this));
          paramAnonymousView.putExtra("GalleryUI_FromUser", AlbumPreviewUI.j(AlbumPreviewUI.this));
          paramAnonymousView.putExtra("GalleryUI_ToUser", AlbumPreviewUI.k(AlbumPreviewUI.this));
          AlbumPreviewUI.this.startActivityForResult(paramAnonymousView, 0);
          GMTrace.o(15092246642688L, 112446);
        }
      });
      if (((c.aCL().aDp() == 1) || (c.aCL().aDp() == 2) || (c.aCL().aDp() == 3)) && (this.lDb > 0))
      {
        localObject = new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(15098152222720L, 112490);
            w.d("MicroMsg.AlbumPreviewUI", "send image, previewImageCount:%d, chooseForTimeline:%b", new Object[] { Integer.valueOf(c.aCS()), Boolean.valueOf(AlbumPreviewUI.l(AlbumPreviewUI.this)) });
            int i;
            if (AlbumPreviewUI.l(AlbumPreviewUI.this)) {
              i = 3;
            }
            try
            {
              AlbumPreviewUI.b(AlbumPreviewUI.this).Z(11610, i + "," + c.aCS());
              if (AlbumPreviewUI.m(AlbumPreviewUI.this) >= 0) {}
            }
            catch (Exception paramAnonymousMenuItem)
            {
              try
              {
                for (;;)
                {
                  AlbumPreviewUI.a(AlbumPreviewUI.this, AlbumPreviewUI.b(AlbumPreviewUI.this).aDs());
                  c.aCR();
                  if (AlbumPreviewUI.a(AlbumPreviewUI.this).aDt().size() != 0) {
                    break;
                  }
                  w.i("MicroMsg.AlbumPreviewUI", "onMenuItemClick");
                  AlbumPreviewUI.this.setResult(-2);
                  AlbumPreviewUI.this.finish();
                  GMTrace.o(15098152222720L, 112490);
                  return true;
                  i = 2;
                }
                paramAnonymousMenuItem = paramAnonymousMenuItem;
                w.e("MicroMsg.AlbumPreviewUI", "report error, %s", new Object[] { paramAnonymousMenuItem.getMessage() });
                w.printErrStackTrace("MicroMsg.AlbumPreviewUI", paramAnonymousMenuItem, "", new Object[0]);
              }
              catch (Exception paramAnonymousMenuItem)
              {
                for (;;)
                {
                  AlbumPreviewUI.a(AlbumPreviewUI.this, 26214400);
                  w.e("MicroMsg.AlbumPreviewUI", "getMaxSendVideoSize error, %s", new Object[] { paramAnonymousMenuItem.getMessage() });
                  w.printErrStackTrace("MicroMsg.AlbumPreviewUI", paramAnonymousMenuItem, "", new Object[0]);
                }
                paramAnonymousMenuItem = new Intent();
                i = c.aCL().aDp();
                if (AlbumPreviewUI.l(AlbumPreviewUI.this)) {
                  i = 1;
                }
                if (AlbumPreviewUI.n(AlbumPreviewUI.this)) {
                  i = 1;
                }
                if (i != 1) {
                  break label653;
                }
              }
            }
            boolean bool;
            Object localObject2;
            Object localObject1;
            if (AlbumPreviewUI.l(AlbumPreviewUI.this))
            {
              bool = true;
              paramAnonymousMenuItem.putExtra("CropImage_Compress_Img", bool);
              localObject2 = AlbumPreviewUI.a(AlbumPreviewUI.this).lCj;
              localObject1 = new ArrayList();
              localObject2 = ((ArrayList)localObject2).iterator();
            }
            Object localObject3;
            for (;;)
            {
              if (!((Iterator)localObject2).hasNext()) {
                break label444;
              }
              localObject3 = (GalleryItem.MediaItem)((Iterator)localObject2).next();
              if ((((GalleryItem.MediaItem)localObject3).mMimeType.equals("edit")) && (!bg.nm(((GalleryItem.MediaItem)localObject3).lBD)))
              {
                ((ArrayList)localObject1).add(((GalleryItem.MediaItem)localObject3).lBD);
                continue;
                if (!AlbumPreviewUI.d(AlbumPreviewUI.this))
                {
                  bool = true;
                  break;
                }
                bool = false;
                break;
              }
              ((ArrayList)localObject1).add(((GalleryItem.MediaItem)localObject3).gVn);
            }
            label444:
            paramAnonymousMenuItem.putStringArrayListExtra("CropImage_OutputPath_List", (ArrayList)localObject1);
            paramAnonymousMenuItem.putExtra("KSelectImgUseTime", System.currentTimeMillis() - AlbumPreviewUI.o(AlbumPreviewUI.this));
            AlbumPreviewUI.p(AlbumPreviewUI.this);
            AlbumPreviewUI.this.setResult(-1, paramAnonymousMenuItem);
            AlbumPreviewUI.q(AlbumPreviewUI.this);
            if ((!bg.nm(AlbumPreviewUI.j(AlbumPreviewUI.this))) && (!"medianote".equals(AlbumPreviewUI.k(AlbumPreviewUI.this))))
            {
              if (bg.Pw() - AlbumPreviewUI.r(AlbumPreviewUI.this) < 1000L)
              {
                w.w("MicroMsg.AlbumPreviewUI", "sendimg btn event frequence limit");
                GMTrace.o(15098152222720L, 112490);
                return true;
              }
              w.i("MicroMsg.AlbumPreviewUI", "switch to SendImgProxyUI");
              AlbumPreviewUI.a(AlbumPreviewUI.this, bg.Pw());
              paramAnonymousMenuItem.setClassName(AlbumPreviewUI.this, "com.tencent.mm.ui.chatting.SendImgProxyUI");
              paramAnonymousMenuItem.putExtra("GalleryUI_FromUser", AlbumPreviewUI.j(AlbumPreviewUI.this));
              paramAnonymousMenuItem.putExtra("GalleryUI_ToUser", AlbumPreviewUI.k(AlbumPreviewUI.this));
              AlbumPreviewUI.this.startActivityForResult(paramAnonymousMenuItem, 4373);
            }
            for (;;)
            {
              GMTrace.o(15098152222720L, 112490);
              return true;
              AlbumPreviewUI.this.finish();
              continue;
              label653:
              if (i == 2)
              {
                w.i("MicroMsg.AlbumPreviewUI", "onMenuItemClick video");
                localObject1 = new com.tencent.mm.pluginsdk.ui.c.a((String)AlbumPreviewUI.a(AlbumPreviewUI.this).aDt().get(0));
                ((com.tencent.mm.pluginsdk.ui.c.a)localObject1).mSize = AlbumPreviewUI.m(AlbumPreviewUI.this);
                i = ((com.tencent.mm.pluginsdk.ui.c.a)localObject1).bMU();
                if (i == 0)
                {
                  paramAnonymousMenuItem.setData(Uri.fromFile(new File((String)AlbumPreviewUI.a(AlbumPreviewUI.this).aDt().get(0))));
                  paramAnonymousMenuItem.putStringArrayListExtra("key_select_video_list", AlbumPreviewUI.a(AlbumPreviewUI.this).aDt());
                  AlbumPreviewUI.this.setResult(-1, paramAnonymousMenuItem);
                  AlbumPreviewUI.q(AlbumPreviewUI.this);
                  AlbumPreviewUI.this.finish();
                }
                else
                {
                  if (i == 2)
                  {
                    AlbumPreviewUI.s(AlbumPreviewUI.this);
                    GMTrace.o(15098152222720L, 112490);
                    return true;
                  }
                  AlbumPreviewUI.t(AlbumPreviewUI.this);
                  GMTrace.o(15098152222720L, 112490);
                  return true;
                }
              }
              else if (i == 3)
              {
                if (bg.Pw() - AlbumPreviewUI.r(AlbumPreviewUI.this) < 1000L)
                {
                  w.w("MicroMsg.AlbumPreviewUI", "sendimg btn event frequence limit");
                  GMTrace.o(15098152222720L, 112490);
                  return true;
                }
                AlbumPreviewUI.a(AlbumPreviewUI.this, bg.Pw());
                localObject3 = AlbumPreviewUI.a(AlbumPreviewUI.this).lCj;
                localObject1 = new ArrayList();
                localObject2 = new ArrayList();
                localObject3 = ((ArrayList)localObject3).iterator();
                while (((Iterator)localObject3).hasNext())
                {
                  GalleryItem.MediaItem localMediaItem = (GalleryItem.MediaItem)((Iterator)localObject3).next();
                  if (localMediaItem.getType() == 1)
                  {
                    if ((localMediaItem.mMimeType.equals("edit")) && (!bg.nm(localMediaItem.lBD))) {
                      ((ArrayList)localObject2).add(localMediaItem.lBD);
                    } else {
                      ((ArrayList)localObject2).add(localMediaItem.gVn);
                    }
                  }
                  else if (localMediaItem.getType() == 2) {
                    ((ArrayList)localObject1).add(localMediaItem.gVn);
                  }
                }
                if (AlbumPreviewUI.l(AlbumPreviewUI.this)) {
                  bool = true;
                }
                for (;;)
                {
                  paramAnonymousMenuItem.putExtra("CropImage_Compress_Img", bool);
                  paramAnonymousMenuItem.putStringArrayListExtra("key_select_video_list", (ArrayList)localObject1);
                  paramAnonymousMenuItem.putExtra("KSelectImgUseTime", System.currentTimeMillis() - AlbumPreviewUI.o(AlbumPreviewUI.this));
                  AlbumPreviewUI.p(AlbumPreviewUI.this);
                  if (((ArrayList)localObject2).size() <= 0) {
                    break label1192;
                  }
                  paramAnonymousMenuItem.setClassName(AlbumPreviewUI.this, "com.tencent.mm.ui.chatting.SendImgProxyUI");
                  paramAnonymousMenuItem.putStringArrayListExtra("CropImage_OutputPath_List", (ArrayList)localObject2);
                  paramAnonymousMenuItem.putExtra("GalleryUI_FromUser", AlbumPreviewUI.j(AlbumPreviewUI.this));
                  paramAnonymousMenuItem.putExtra("GalleryUI_ToUser", AlbumPreviewUI.k(AlbumPreviewUI.this));
                  paramAnonymousMenuItem.putExtra("CropImage_limit_Img_Size", 26214400);
                  w.i("MicroMsg.AlbumPreviewUI", "switch to SendImgProxyUI");
                  AlbumPreviewUI.this.startActivityForResult(paramAnonymousMenuItem, 4373);
                  break;
                  if (!AlbumPreviewUI.d(AlbumPreviewUI.this)) {
                    bool = true;
                  } else {
                    bool = false;
                  }
                }
                label1192:
                w.i("MicroMsg.AlbumPreviewUI", "QueryTypeImageAndVideo");
                AlbumPreviewUI.this.setResult(-1, paramAnonymousMenuItem);
                AlbumPreviewUI.this.finish();
              }
              else
              {
                w.i("MicroMsg.AlbumPreviewUI", "onMenuItemClick default");
                AlbumPreviewUI.this.setResult(-2);
                AlbumPreviewUI.this.finish();
              }
            }
          }
        };
        if (!bg.nm(this.lCT)) {
          a(0, this.lCT, (MenuItem.OnMenuItemClickListener)localObject);
        } else {
          a(0, oq(0), (MenuItem.OnMenuItemClickListener)localObject, p.b.vLG);
        }
      }
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(11950880718848L, 89041);
    GMTrace.o(11950880718848L, 89041);
    return 1;
  }
  
  public final void a(ArrayList<GalleryItem.MediaItem> paramArrayList, long paramLong)
  {
    GMTrace.i(11951417589760L, 89045);
    if (paramLong != this.lDj)
    {
      w.w("MicroMsg.AlbumPreviewUI", "%s %s, not my query, ignore.", new Object[] { Long.valueOf(paramLong), Long.valueOf(this.lDj) });
      w.w("MicroMsg.AlbumPreviewUI", "If you saw too mush this log, maybe user had too many photos. This can be optimized.");
      GMTrace.o(11951417589760L, 89045);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    if (paramArrayList != null)
    {
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext()) {
        localArrayList.add((GalleryItem.MediaItem)paramArrayList.next());
      }
    }
    if (this.lCK != null)
    {
      paramArrayList = new a();
      paramArrayList.lDu = new WeakReference(this.lCK);
      paramArrayList.lDv = new WeakReference(this.htG);
      paramArrayList.lDw = localArrayList;
      c.aCM().t(paramArrayList);
    }
    GMTrace.o(11951417589760L, 89045);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11950075412480L, 89035);
    int i = R.i.cFm;
    GMTrace.o(11950075412480L, 89035);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11951014936576L, 89042);
    w.i("MicroMsg.AlbumPreviewUI", "on activity result, requestCode[%d] resultCode[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    Object localObject1;
    Object localObject2;
    if (4369 == paramInt1)
    {
      if (-1 != paramInt2)
      {
        GMTrace.o(11951014936576L, 89042);
        return;
      }
      localObject1 = k.b(this.vKB.vKW.getApplicationContext(), paramIntent, com.tencent.mm.compatible.util.e.fRZ);
      if (bg.nm((String)localObject1))
      {
        w.w("MicroMsg.AlbumPreviewUI", "take photo, but result is null");
        GMTrace.o(11951014936576L, 89042);
        return;
      }
      w.i("MicroMsg.AlbumPreviewUI", "take photo, result[%s]", new Object[] { localObject1 });
      if ((c.aCL().aDo() == 0) || (c.aCL().aDo() == 5) || (c.aCL().aDo() == 11))
      {
        localObject2 = new Intent();
        ((Intent)localObject2).setData(Uri.parse("file://" + Uri.encode((String)localObject1)));
        w.i("MicroMsg.AlbumPreviewUI", "take photo finish");
        setResult(-1, (Intent)localObject2);
        finish();
        localObject1 = paramIntent;
      }
    }
    for (;;)
    {
      if ((localObject1 != null) && (((Intent)localObject1).getBooleanExtra("show_photo_edit_tip", false)))
      {
        paramIntent = getSharedPreferences("photo_edit_pref", 0);
        if (!paramIntent.getBoolean("has_show_tip", false))
        {
          this.lCM.setVisibility(0);
          this.lCM.setText(getString(R.l.dNF));
          localObject1 = AnimationUtils.loadAnimation(this.vKB.vKW, R.a.aLs);
          this.lCM.startAnimation((Animation)localObject1);
          ((Animation)localObject1).setAnimationListener(new Animation.AnimationListener()
          {
            private Runnable lDs;
            
            public final void onAnimationEnd(Animation paramAnonymousAnimation)
            {
              GMTrace.i(15622406668288L, 116396);
              AlbumPreviewUI.F(AlbumPreviewUI.this).setVisibility(0);
              AlbumPreviewUI.F(AlbumPreviewUI.this).postDelayed(this.lDs, 4000L);
              GMTrace.o(15622406668288L, 116396);
            }
            
            public final void onAnimationRepeat(Animation paramAnonymousAnimation)
            {
              GMTrace.i(15622540886016L, 116397);
              GMTrace.o(15622540886016L, 116397);
            }
            
            public final void onAnimationStart(Animation paramAnonymousAnimation)
            {
              GMTrace.i(15622272450560L, 116395);
              GMTrace.o(15622272450560L, 116395);
            }
          });
          paramIntent.edit().putBoolean("has_show_tip", true).commit();
        }
      }
      GMTrace.o(11951014936576L, 89042);
      return;
      localObject2 = new ArrayList(1);
      ((ArrayList)localObject2).add(localObject1);
      localObject1 = new Intent(this, ImagePreviewUI.class);
      ((Intent)localObject1).putExtra("isTakePhoto", true);
      ((Intent)localObject1).putExtra("max_select_count", 1);
      ((Intent)localObject1).putExtra("send_raw_img", this.lCY);
      ((Intent)localObject1).putStringArrayListExtra("preview_image_list", (ArrayList)localObject2);
      ((Intent)localObject1).putExtra("GalleryUI_FromUser", this.eMI);
      ((Intent)localObject1).putExtra("GalleryUI_ToUser", this.toUser);
      startActivityForResult((Intent)localObject1, 4370);
      localObject1 = paramIntent;
      continue;
      if (4370 == paramInt1)
      {
        if (-1 != paramInt2)
        {
          GMTrace.o(11951014936576L, 89042);
          return;
        }
        if (paramIntent.getBooleanExtra("GalleryUI_IsSendImgBackground", false))
        {
          w.i("MicroMsg.AlbumPreviewUI", "test onActivityResult");
          setResult(-1, paramIntent);
          finish();
          GMTrace.o(11951014936576L, 89042);
          return;
        }
        localObject1 = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
        if ((localObject1 == null) || (((ArrayList)localObject1).isEmpty()))
        {
          w.w("MicroMsg.AlbumPreviewUI", "send filepath is null or nil");
          GMTrace.o(11951014936576L, 89042);
          return;
        }
        w.i("MicroMsg.AlbumPreviewUI", "gallery photo:%s", new Object[] { localObject1 });
        setResult(-1, paramIntent);
        finish();
        localObject1 = paramIntent;
      }
      else if (4371 == paramInt1)
      {
        if (-1 != paramInt2)
        {
          GMTrace.o(11951014936576L, 89042);
          return;
        }
        if (paramIntent != null) {
          paramIntent.putExtra("from_record", true);
        }
        w.i("MicroMsg.AlbumPreviewUI", "custom record video, result[%s]", new Object[] { paramIntent });
        setResult(-1, paramIntent);
        finish();
        localObject1 = paramIntent;
      }
      else if (4372 == paramInt1)
      {
        if (-1 != paramInt2)
        {
          GMTrace.o(11951014936576L, 89042);
          return;
        }
        localObject1 = paramIntent;
        if (paramIntent == null) {
          localObject1 = new Intent();
        }
        w.i("MicroMsg.AlbumPreviewUI", "system record video, result[%s]", new Object[] { localObject1 });
        paramIntent = new ArrayList();
        localObject2 = getIntent().getStringExtra("video_full_path");
        if (!bg.nm((String)localObject2))
        {
          paramIntent.add(localObject2);
          ((Intent)localObject1).putExtra("key_select_video_list", paramIntent);
          ((Intent)localObject1).putExtra("key_selected_video_is_from_sys_camera", true);
        }
        setResult(-1, (Intent)localObject1);
        finish();
      }
      else if (4373 == paramInt1)
      {
        if (paramIntent != null)
        {
          paramIntent.putExtra("GalleryUI_IsSendImgBackground", true);
          w.e("MicroMsg.AlbumPreviewUI", "send img background, data is null!!");
        }
        w.i("MicroMsg.AlbumPreviewUI", "Request code sendimg proxy");
        setResult(-1, paramIntent);
        this.lDd = true;
        finish();
        localObject1 = paramIntent;
      }
      else if (4375 == paramInt1)
      {
        if (-1 != paramInt2)
        {
          GMTrace.o(11951014936576L, 89042);
          return;
        }
        localObject1 = paramIntent;
        if (paramIntent == null) {
          localObject1 = new Intent();
        }
        w.i("MicroMsg.AlbumPreviewUI", "sight capture record video, result[%s]", new Object[] { localObject1 });
        paramIntent = (SightCaptureResult)((Intent)localObject1).getParcelableExtra("key_req_result");
        if (paramIntent == null)
        {
          w.e("MicroMsg.AlbumPreviewUI", "sight capture result is null!");
          setResult(1);
          finish();
          GMTrace.o(11951014936576L, 89042);
          return;
        }
        localObject2 = new ArrayList();
        String str = paramIntent.mWH;
        if (!bg.nm(str))
        {
          ((ArrayList)localObject2).add(str);
          ((Intent)localObject1).putExtra("key_select_video_list", (Serializable)localObject2);
        }
        if ((paramIntent.mWF) && (!bg.nm(paramIntent.mWN)))
        {
          localObject2 = new ArrayList();
          ((ArrayList)localObject2).add(paramIntent.mWN);
          ((Intent)localObject1).putStringArrayListExtra("CropImage_OutputPath_List", (ArrayList)localObject2);
        }
        setResult(-1, (Intent)localObject1);
        finish();
      }
      else if (4376 == paramInt1)
      {
        if (-1 != paramInt2)
        {
          w.i("MicroMsg.AlbumPreviewUI", "REQUEST_SELECT_FOLDER goBack!");
          finish();
          localObject1 = paramIntent;
        }
        else
        {
          localObject1 = paramIntent;
          if (paramIntent != null)
          {
            localObject1 = (GalleryItem.AlbumItem)paramIntent.getParcelableExtra("select_folder_name");
            a((GalleryItem.AlbumItem)localObject1);
            sq(bg.aq(((GalleryItem.AlbumItem)localObject1).lBA, getString(R.l.dyH)));
            localObject1 = paramIntent;
          }
        }
      }
      else
      {
        switch (paramInt2)
        {
        default: 
          localObject1 = paramIntent;
          break;
        case -2: 
          w.e("MicroMsg.AlbumPreviewUI", "WTF!!!");
          finish();
          localObject1 = paramIntent;
          break;
        case -1: 
          localObject1 = paramIntent;
          if (paramIntent == null)
          {
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("CropImage_Compress_Img", true);
            ((Intent)localObject1).putStringArrayListExtra("CropImage_OutputPath_List", this.lCK.aDt());
          }
          w.i("MicroMsg.AlbumPreviewUI", "onActivity Result ok");
          this.lCI = true;
          setResult(-1, (Intent)localObject1);
          aDv();
          finish();
          break;
        case 0: 
          localObject1 = paramIntent;
          if (paramIntent != null)
          {
            localObject1 = paramIntent.getStringArrayListExtra("preview_image_list");
            if (localObject1 != null)
            {
              this.lCK.B((ArrayList)localObject1);
              this.lCK.notifyDataSetChanged();
              op(((ArrayList)localObject1).size());
            }
            if (!paramIntent.getBooleanExtra("CropImage_Compress_Img", true)) {}
            for (boolean bool = true;; bool = false)
            {
              this.lCY = bool;
              if (!this.lCY) {
                break label1336;
              }
              this.lCP.setImageResource(R.k.cOv);
              localObject1 = paramIntent;
              break;
            }
            label1336:
            this.lCP.setImageResource(R.k.cOu);
            localObject1 = paramIntent;
          }
          break;
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11949404323840L, 89030);
    super.onCreate(paramBundle);
    this.lDh = System.currentTimeMillis();
    w.i("MicroMsg.AlbumPreviewUI", "onCreate");
    if (paramBundle != null)
    {
      w.i("MicroMsg.AlbumPreviewUI", "savedInstanceState not null");
      this.lDc = paramBundle.getInt("constants_key");
      c.aCL().ol(this.lDc);
    }
    getString(R.l.cUG);
    this.htG = h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11959336435712L, 89104);
        GMTrace.o(11959336435712L, 89104);
      }
    });
    int i = getIntent().getIntExtra("query_source_type", 3);
    int j = getIntent().getIntExtra("query_media_type", 1);
    w.i("MicroMsg.AlbumPreviewUI", "query souce: " + i + ", queryType: " + j);
    c.aCL().ok(j);
    c.aCL().ol(i);
    MP();
    c.aCL().lBU.add(this);
    this.lDj = System.currentTimeMillis();
    paramBundle = c.aCL();
    String str = this.lCR;
    long l = this.lDj;
    paramBundle.e(str, paramBundle.lBW, l);
    bindService(new Intent(this.vKB.vKW, GalleryStubService.class), this.keh, 1);
    GMTrace.o(11949404323840L, 89030);
  }
  
  /* Error */
  protected void onDestroy()
  {
    // Byte code:
    //   0: ldc2_w 1396
    //   3: ldc_w 1398
    //   6: invokestatic 120	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: invokespecial 1400	com/tencent/mm/ui/MMActivity:onDestroy	()V
    //   13: ldc -11
    //   15: ldc_w 1401
    //   18: invokestatic 562	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: aload_0
    //   22: getfield 867	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:lCN	Lcom/tencent/mm/plugin/gallery/ui/ImageFolderMgrView;
    //   25: astore_1
    //   26: invokestatic 489	com/tencent/mm/plugin/gallery/model/c:aCL	()Lcom/tencent/mm/plugin/gallery/model/l;
    //   29: aload_1
    //   30: invokevirtual 1013	com/tencent/mm/plugin/gallery/model/l:b	(Lcom/tencent/mm/plugin/gallery/model/g$a;)V
    //   33: invokestatic 489	com/tencent/mm/plugin/gallery/model/c:aCL	()Lcom/tencent/mm/plugin/gallery/model/l;
    //   36: getfield 1382	com/tencent/mm/plugin/gallery/model/l:lBU	Ljava/util/HashSet;
    //   39: aload_0
    //   40: invokevirtual 1402	java/util/HashSet:remove	(Ljava/lang/Object;)Z
    //   43: pop
    //   44: aload_0
    //   45: getfield 150	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:lDe	I
    //   48: ifgt +10 -> 58
    //   51: aload_0
    //   52: getfield 152	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:lDf	I
    //   55: ifle +229 -> 284
    //   58: ldc -11
    //   60: ldc_w 1404
    //   63: iconst_2
    //   64: anewarray 263	java/lang/Object
    //   67: dup
    //   68: iconst_0
    //   69: aload_0
    //   70: getfield 150	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:lDe	I
    //   73: invokestatic 269	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   76: aastore
    //   77: dup
    //   78: iconst_1
    //   79: aload_0
    //   80: getfield 152	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:lDf	I
    //   83: invokestatic 269	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   86: aastore
    //   87: invokestatic 297	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   90: aload_0
    //   91: getfield 154	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:lCh	Lcom/tencent/mm/plugin/gallery/stub/a;
    //   94: sipush 11187
    //   97: new 546	java/lang/StringBuilder
    //   100: dup
    //   101: invokespecial 569	java/lang/StringBuilder:<init>	()V
    //   104: aload_0
    //   105: getfield 150	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:lDe	I
    //   108: invokevirtual 572	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   111: ldc_w 1406
    //   114: invokevirtual 555	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: aload_0
    //   118: getfield 152	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:lDf	I
    //   121: invokevirtual 572	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   124: invokevirtual 560	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   127: invokeinterface 1408 3 0
    //   132: aload_0
    //   133: getfield 156	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:lDg	J
    //   136: lconst_0
    //   137: lcmp
    //   138: ifgt +10 -> 148
    //   141: aload_0
    //   142: getfield 1340	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:lCI	Z
    //   145: ifeq +32 -> 177
    //   148: aload_0
    //   149: getfield 154	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:lCh	Lcom/tencent/mm/plugin/gallery/stub/a;
    //   152: aload_0
    //   153: getfield 1027	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:lCT	Ljava/lang/String;
    //   156: aload_0
    //   157: getfield 355	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:lCK	Lcom/tencent/mm/plugin/gallery/ui/a;
    //   160: getfield 387	com/tencent/mm/plugin/gallery/ui/a:lCj	Ljava/util/ArrayList;
    //   163: invokestatic 1410	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:C	(Ljava/util/ArrayList;)[I
    //   166: aload_0
    //   167: getfield 142	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:lCY	Z
    //   170: aload_0
    //   171: getfield 745	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:lCH	Z
    //   174: invokestatic 1413	com/tencent/mm/plugin/gallery/model/c:a	(Lcom/tencent/mm/plugin/gallery/stub/a;Ljava/lang/String;[IZZ)V
    //   177: aload_0
    //   178: getfield 154	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:lCh	Lcom/tencent/mm/plugin/gallery/stub/a;
    //   181: aload_0
    //   182: getfield 355	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:lCK	Lcom/tencent/mm/plugin/gallery/ui/a;
    //   185: getfield 387	com/tencent/mm/plugin/gallery/ui/a:lCj	Ljava/util/ArrayList;
    //   188: invokevirtual 201	java/util/ArrayList:size	()I
    //   191: aload_0
    //   192: getfield 142	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:lCY	Z
    //   195: invokestatic 1416	com/tencent/mm/plugin/gallery/model/c:a	(Lcom/tencent/mm/plugin/gallery/stub/a;IZ)V
    //   198: aload_0
    //   199: new 475	android/content/Intent
    //   202: dup
    //   203: ldc_w 1418
    //   206: invokespecial 1419	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   209: invokevirtual 1423	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:sendBroadcast	(Landroid/content/Intent;)V
    //   212: invokestatic 279	com/tencent/mm/plugin/gallery/model/c:aCO	()Ljava/util/HashSet;
    //   215: invokevirtual 1424	java/util/HashSet:clear	()V
    //   218: invokestatic 1427	com/tencent/mm/plugin/gallery/model/c:aCP	()Ljava/util/ArrayList;
    //   221: invokevirtual 427	java/util/ArrayList:clear	()V
    //   224: invokestatic 381	com/tencent/mm/plugin/gallery/model/c:aCQ	()Ljava/util/LinkedHashSet;
    //   227: invokevirtual 1428	java/util/LinkedHashSet:clear	()V
    //   230: aload_0
    //   231: aload_0
    //   232: getfield 163	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:keh	Landroid/content/ServiceConnection;
    //   235: invokevirtual 1432	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:unbindService	(Landroid/content/ServiceConnection;)V
    //   238: ldc2_w 1396
    //   241: ldc_w 1398
    //   244: invokestatic 125	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   247: return
    //   248: astore_1
    //   249: ldc -11
    //   251: ldc_w 1434
    //   254: iconst_1
    //   255: anewarray 263	java/lang/Object
    //   258: dup
    //   259: iconst_0
    //   260: aload_1
    //   261: invokevirtual 1437	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   264: aastore
    //   265: invokestatic 1439	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   268: ldc -11
    //   270: aload_1
    //   271: ldc_w 363
    //   274: iconst_0
    //   275: anewarray 263	java/lang/Object
    //   278: invokestatic 702	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   281: goto -149 -> 132
    //   284: ldc -11
    //   286: ldc_w 1441
    //   289: invokestatic 377	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   292: goto -160 -> 132
    //   295: astore_1
    //   296: ldc -11
    //   298: aload_1
    //   299: ldc_w 363
    //   302: iconst_0
    //   303: anewarray 263	java/lang/Object
    //   306: invokestatic 702	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   309: goto -111 -> 198
    //   312: astore_1
    //   313: ldc -11
    //   315: aload_1
    //   316: ldc_w 1443
    //   319: iconst_0
    //   320: anewarray 263	java/lang/Object
    //   323: invokestatic 702	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   326: ldc2_w 1396
    //   329: ldc_w 1398
    //   332: invokestatic 125	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   335: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	336	0	this	AlbumPreviewUI
    //   25	5	1	localImageFolderMgrView	ImageFolderMgrView
    //   248	23	1	localException	Exception
    //   295	4	1	localRemoteException	RemoteException
    //   312	4	1	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   90	132	248	java/lang/Exception
    //   132	148	295	android/os/RemoteException
    //   148	177	295	android/os/RemoteException
    //   177	198	295	android/os/RemoteException
    //   230	238	312	java/lang/Throwable
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(15619319660544L, 116373);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      w.i("MicroMsg.AlbumPreviewUI", "onKeyDown");
      setResult(-2);
      if (this.lCN.Ne)
      {
        this.lCN.aDy();
        GMTrace.o(15619319660544L, 116373);
        return true;
      }
      finish();
      GMTrace.o(15619319660544L, 116373);
      return true;
    }
    if (paramInt == 82)
    {
      this.lDf += 1;
      this.lCN.aDy();
      GMTrace.o(15619319660544L, 116373);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(15619319660544L, 116373);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(11949538541568L, 89031);
    super.onPause();
    this.lDa = true;
    c.aCM().aDa().removeCallbacksAndMessages(null);
    c.aCM().aDb();
    w.d("MicroMsg.AlbumPreviewUI", "shouldSaveLastChoosePath: " + this.lCV);
    if (this.lCV) {
      aDv();
    }
    if (this.lCN.Ne)
    {
      ImageFolderMgrView localImageFolderMgrView = this.lCN;
      if (!localImageFolderMgrView.Ne)
      {
        w.w("MicroMsg.ImageFolderMgrView", "want to close, but it was closed");
        GMTrace.o(11949538541568L, 89031);
        return;
      }
      if (localImageFolderMgrView.lDV)
      {
        w.d("MicroMsg.ImageFolderMgrView", "want to close, but it is in animation");
        GMTrace.o(11949538541568L, 89031);
        return;
      }
      localImageFolderMgrView.lDR.setVisibility(8);
      localImageFolderMgrView.Ne = false;
    }
    GMTrace.o(11949538541568L, 89031);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(11951686025216L, 89047);
    w.i("MicroMsg.AlbumPreviewUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(11951686025216L, 89047);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        ahJ();
        GMTrace.o(11951686025216L, 89047);
        return;
      }
      h.a(this, getString(R.l.dNn), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(15622809321472L, 116399);
          AlbumPreviewUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(15622809321472L, 116399);
        }
      }, null);
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(11949672759296L, 89032);
    super.onResume();
    w.d("MicroMsg.AlbumPreviewUI", "on resume");
    this.lDa = false;
    GMTrace.o(11949672759296L, 89032);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    GMTrace.i(11949941194752L, 89034);
    this.lDc = c.aCL().aDo();
    paramBundle.putInt("constants_key", this.lDc);
    GMTrace.o(11949941194752L, 89034);
  }
  
  private static final class a
    implements Runnable
  {
    public WeakReference<a> lDu;
    public WeakReference<ProgressDialog> lDv;
    public ArrayList<GalleryItem.MediaItem> lDw;
    
    public a()
    {
      GMTrace.i(11948733235200L, 89025);
      GMTrace.o(11948733235200L, 89025);
    }
    
    public final void run()
    {
      GMTrace.i(11948867452928L, 89026);
      if (this.lDw == null) {}
      for (int i = -1;; i = this.lDw.size())
      {
        w.d("MicroMsg.AlbumPreviewUI", "on NotifyMediaItemsChanged, size %d", new Object[] { Integer.valueOf(i) });
        if (this.lDu != null) {
          break;
        }
        GMTrace.o(11948867452928L, 89026);
        return;
      }
      Object localObject = (a)this.lDu.get();
      if (localObject == null)
      {
        GMTrace.o(11948867452928L, 89026);
        return;
      }
      AlbumPreviewUI.D(this.lDw);
      ArrayList localArrayList = this.lDw;
      ((a)localObject).lCi.addAll(localArrayList);
      ((a)localObject).notifyDataSetChanged();
      if (this.lDv == null)
      {
        GMTrace.o(11948867452928L, 89026);
        return;
      }
      localObject = (ProgressDialog)this.lDv.get();
      if ((localObject != null) && (((ProgressDialog)localObject).isShowing()))
      {
        ((ProgressDialog)localObject).dismiss();
        w.i("MicroMsg.AlbumPreviewUI", "[NotifyMediaItemsChanged] cost:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - AlbumPreviewUI.start) });
      }
      GMTrace.o(11948867452928L, 89026);
    }
    
    public final String toString()
    {
      GMTrace.i(11949001670656L, 89027);
      String str = super.toString() + "|notifyRunnable";
      GMTrace.o(11949001670656L, 89027);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\ui\AlbumPreviewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */