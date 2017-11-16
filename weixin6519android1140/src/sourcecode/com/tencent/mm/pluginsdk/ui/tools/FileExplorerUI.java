package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.at;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class FileExplorerUI
  extends MMActivity
{
  private int tFS;
  private ListView tFT;
  private a tFU;
  private TextView tFV;
  private TextView tFW;
  private View tFX;
  private View tFY;
  private String tFZ;
  private String tGa;
  private File tGb;
  private File tGc;
  
  public FileExplorerUI()
  {
    GMTrace.i(1126086737920L, 8390);
    this.tFS = 0;
    GMTrace.o(1126086737920L, 8390);
  }
  
  public static int PE(String paramString)
  {
    int j = 0;
    GMTrace.i(1127294697472L, 8399);
    paramString = paramString.toLowerCase();
    String str = bg.nl(paramString).toLowerCase();
    if ((str.endsWith(".doc")) || (str.endsWith(".docx")) || (str.endsWith("wps"))) {}
    for (int i = 1; i != 0; i = 0)
    {
      i = R.k.cJs;
      GMTrace.o(1127294697472L, 8399);
      return i;
    }
    if (PF(paramString))
    {
      i = R.g.aZg;
      GMTrace.o(1127294697472L, 8399);
      return i;
    }
    str = bg.nl(paramString).toLowerCase();
    if ((str.endsWith(".rar")) || (str.endsWith(".zip")) || (str.endsWith(".7z")) || (str.endsWith("tar")) || (str.endsWith(".iso"))) {}
    for (i = 1; i != 0; i = 0)
    {
      i = R.k.cJj;
      GMTrace.o(1127294697472L, 8399);
      return i;
    }
    str = bg.nl(paramString).toLowerCase();
    if ((str.endsWith(".txt")) || (str.endsWith(".rtf"))) {}
    for (i = 1; i != 0; i = 0)
    {
      i = R.k.cJk;
      GMTrace.o(1127294697472L, 8399);
      return i;
    }
    if (bg.nl(paramString).toLowerCase().endsWith(".pdf"))
    {
      i = R.k.cJf;
      GMTrace.o(1127294697472L, 8399);
      return i;
    }
    str = bg.nl(paramString).toLowerCase();
    if ((str.endsWith(".ppt")) || (str.endsWith(".pptx"))) {}
    for (i = 1; i != 0; i = 0)
    {
      i = R.k.cJh;
      GMTrace.o(1127294697472L, 8399);
      return i;
    }
    paramString = bg.nl(paramString).toLowerCase();
    if (!paramString.endsWith(".xls"))
    {
      i = j;
      if (!paramString.endsWith(".xlsx")) {}
    }
    else
    {
      i = 1;
    }
    if (i != 0)
    {
      i = R.k.cIZ;
      GMTrace.o(1127294697472L, 8399);
      return i;
    }
    i = R.k.cJl;
    GMTrace.o(1127294697472L, 8399);
    return i;
  }
  
  public static boolean PF(String paramString)
  {
    GMTrace.i(1127428915200L, 8400);
    paramString = bg.nl(paramString).toLowerCase();
    if ((paramString.endsWith(".bmp")) || (paramString.endsWith(".png")) || (paramString.endsWith(".jpg")) || (paramString.endsWith(".jpeg")) || (paramString.endsWith(".gif")))
    {
      GMTrace.o(1127428915200L, 8400);
      return true;
    }
    GMTrace.o(1127428915200L, 8400);
    return false;
  }
  
  public static boolean PG(String paramString)
  {
    GMTrace.i(1127563132928L, 8401);
    paramString = bg.nl(paramString).toLowerCase();
    if ((paramString.endsWith(".mp3")) || (paramString.endsWith(".wma")) || (paramString.endsWith(".mp4")) || (paramString.endsWith(".rm")))
    {
      GMTrace.o(1127563132928L, 8401);
      return true;
    }
    GMTrace.o(1127563132928L, 8401);
    return false;
  }
  
  private void zI(int paramInt)
  {
    GMTrace.i(1127160479744L, 8398);
    if (1 == paramInt)
    {
      this.tFS = 1;
      this.tFW.setTextColor(getResources().getColor(R.e.aPp));
      this.tFV.setTextColor(getResources().getColor(R.e.aOE));
      this.tFX.setVisibility(4);
      this.tFY.setVisibility(0);
      GMTrace.o(1127160479744L, 8398);
      return;
    }
    this.tFS = 0;
    this.tFV.setTextColor(getResources().getColor(R.e.aPp));
    this.tFW.setTextColor(getResources().getColor(R.e.aOE));
    this.tFX.setVisibility(0);
    this.tFY.setVisibility(4);
    GMTrace.o(1127160479744L, 8398);
  }
  
  protected final void MP()
  {
    boolean bool2 = true;
    Object localObject2 = null;
    GMTrace.i(1127026262016L, 8397);
    this.tFT = ((ListView)findViewById(R.h.bVq));
    this.tFV = ((TextView)findViewById(R.h.bZj));
    this.tFX = findViewById(R.h.bZk);
    this.tFW = ((TextView)findViewById(R.h.bZR));
    this.tFY = findViewById(R.h.bZS);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1067836243968L, 7956);
        if (FileExplorerUI.a.a(FileExplorerUI.a(FileExplorerUI.this)) != null)
        {
          if (1 == FileExplorerUI.b(FileExplorerUI.this)) {
            FileExplorerUI.a(FileExplorerUI.this, FileExplorerUI.a.a(FileExplorerUI.a(FileExplorerUI.this)));
          }
          for (;;)
          {
            FileExplorerUI.a(FileExplorerUI.this).d(FileExplorerUI.a.a(FileExplorerUI.a(FileExplorerUI.this)).getParentFile(), FileExplorerUI.a.a(FileExplorerUI.a(FileExplorerUI.this)));
            FileExplorerUI.a(FileExplorerUI.this).notifyDataSetChanged();
            FileExplorerUI.c(FileExplorerUI.this).setSelection(0);
            FileExplorerUI.bNi();
            GMTrace.o(1067836243968L, 7956);
            return true;
            if (FileExplorerUI.b(FileExplorerUI.this) == 0) {
              FileExplorerUI.b(FileExplorerUI.this, FileExplorerUI.a.a(FileExplorerUI.a(FileExplorerUI.this)));
            }
          }
        }
        at.AR();
        com.tencent.mm.y.c.xh().set(131074, FileExplorerUI.d(FileExplorerUI.this).getAbsolutePath());
        at.AR();
        com.tencent.mm.y.c.xh().set(131073, FileExplorerUI.e(FileExplorerUI.this).getAbsolutePath());
        FileExplorerUI.this.finish();
        GMTrace.o(1067836243968L, 7956);
        return true;
      }
    });
    this.tFZ = getString(R.l.dOf);
    this.tGa = getString(R.l.dOg);
    final File localFile1 = h.getRootDirectory();
    final File localFile2;
    label138:
    Object localObject1;
    if (localFile1.canRead())
    {
      at.AR();
      if (!com.tencent.mm.y.c.isSDCardAvailable()) {
        break label489;
      }
      localFile2 = h.getExternalStorageDirectory();
      at.AR();
      t localt = com.tencent.mm.y.c.xh();
      if (localFile1 != null) {
        break label520;
      }
      localObject1 = null;
      label154:
      localObject1 = (String)localt.get(131073, localObject1);
      if ((localObject1 == null) || (localFile1 == null) || (localFile1.getAbsolutePath().equals(localObject1))) {
        break label529;
      }
      localObject1 = new File((String)localObject1);
      if (!((File)localObject1).exists()) {
        break label529;
      }
      label209:
      this.tGb = ((File)localObject1);
      at.AR();
      localt = com.tencent.mm.y.c.xh();
      if (localFile2 != null) {
        break label535;
      }
      localObject1 = localObject2;
      label233:
      localObject1 = (String)localt.get(131074, localObject1);
      if ((localObject1 == null) || (localFile2 == null) || (localFile2.getAbsolutePath().equals(localObject1))) {
        break label545;
      }
      localObject1 = new File((String)localObject1);
      if (!((File)localObject1).exists()) {
        break label545;
      }
      label290:
      this.tGc = ((File)localObject1);
      this.tFU = new a((byte)0);
      if (localFile2 == null) {
        break label552;
      }
      zI(1);
      this.tFU.haf = localFile2.getPath();
      this.tFU.d(this.tGc.getParentFile(), this.tGc);
      label349:
      localObject1 = this.tFV;
      if (localFile1 == null) {
        break label612;
      }
      bool1 = true;
      label361:
      ((TextView)localObject1).setEnabled(bool1);
      localObject1 = this.tFW;
      if (localFile2 == null) {
        break label617;
      }
    }
    label489:
    label520:
    label529:
    label535:
    label545:
    label552:
    label612:
    label617:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      ((TextView)localObject1).setEnabled(bool1);
      this.tFT.setAdapter(this.tFU);
      this.tFU.notifyDataSetChanged();
      this.tFT.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(1094679789568L, 8156);
          paramAnonymousAdapterView = (File)FileExplorerUI.a(FileExplorerUI.this).getItem(paramAnonymousInt);
          if (1 == FileExplorerUI.b(FileExplorerUI.this)) {
            if (paramAnonymousAdapterView.isFile())
            {
              at.AR();
              com.tencent.mm.y.c.xh().set(131074, FileExplorerUI.a.b(FileExplorerUI.a(FileExplorerUI.this)).getAbsolutePath());
              at.AR();
              com.tencent.mm.y.c.xh().set(131073, FileExplorerUI.e(FileExplorerUI.this).getAbsolutePath());
              if (paramAnonymousAdapterView != FileExplorerUI.a.a(FileExplorerUI.a(FileExplorerUI.this))) {
                break label261;
              }
              FileExplorerUI.a(FileExplorerUI.this).d(FileExplorerUI.a.a(FileExplorerUI.a(FileExplorerUI.this)).getParentFile(), FileExplorerUI.a.a(FileExplorerUI.a(FileExplorerUI.this)));
            }
          }
          for (;;)
          {
            FileExplorerUI.bNi();
            FileExplorerUI.a(FileExplorerUI.this).notifyDataSetChanged();
            FileExplorerUI.c(FileExplorerUI.this).setSelection(0);
            GMTrace.o(1094679789568L, 8156);
            return;
            FileExplorerUI.a(FileExplorerUI.this, paramAnonymousAdapterView);
            break;
            if (FileExplorerUI.b(FileExplorerUI.this) != 0) {
              break;
            }
            if (paramAnonymousAdapterView.isFile())
            {
              at.AR();
              com.tencent.mm.y.c.xh().set(131073, FileExplorerUI.a.b(FileExplorerUI.a(FileExplorerUI.this)).getAbsolutePath());
              at.AR();
              com.tencent.mm.y.c.xh().set(131074, FileExplorerUI.d(FileExplorerUI.this).getAbsolutePath());
              break;
            }
            FileExplorerUI.b(FileExplorerUI.this, paramAnonymousAdapterView);
            break;
            label261:
            if (paramAnonymousAdapterView.isDirectory())
            {
              FileExplorerUI.a(FileExplorerUI.this).d(FileExplorerUI.a.b(FileExplorerUI.a(FileExplorerUI.this)), paramAnonymousAdapterView);
            }
            else if (paramAnonymousAdapterView.isFile())
            {
              FileExplorerUI.this.setResult(-1, new Intent().putExtra("choosed_file_path", paramAnonymousAdapterView.getAbsolutePath()));
              FileExplorerUI.this.finish();
            }
          }
        }
      });
      this.tFV.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1079244750848L, 8041);
          FileExplorerUI.a(FileExplorerUI.this, 0);
          FileExplorerUI.a(FileExplorerUI.this).haf = localFile1.getPath();
          FileExplorerUI.a(FileExplorerUI.this).d(FileExplorerUI.e(FileExplorerUI.this).getParentFile(), FileExplorerUI.e(FileExplorerUI.this));
          FileExplorerUI.a(FileExplorerUI.this).notifyDataSetInvalidated();
          FileExplorerUI.a(FileExplorerUI.this).notifyDataSetChanged();
          FileExplorerUI.c(FileExplorerUI.this).setSelection(0);
          GMTrace.o(1079244750848L, 8041);
        }
      });
      this.tFW.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1106356731904L, 8243);
          FileExplorerUI.a(FileExplorerUI.this, 1);
          FileExplorerUI.a(FileExplorerUI.this).haf = localFile2.getPath();
          FileExplorerUI.a(FileExplorerUI.this).d(FileExplorerUI.d(FileExplorerUI.this).getParentFile(), FileExplorerUI.d(FileExplorerUI.this));
          FileExplorerUI.a(FileExplorerUI.this).notifyDataSetInvalidated();
          FileExplorerUI.a(FileExplorerUI.this).notifyDataSetChanged();
          FileExplorerUI.c(FileExplorerUI.this).setSelection(0);
          GMTrace.o(1106356731904L, 8243);
        }
      });
      GMTrace.o(1127026262016L, 8397);
      return;
      localFile1 = h.getDataDirectory();
      if (localFile1.canRead())
      {
        this.tFZ = localFile1.getName();
        break;
      }
      localFile1 = null;
      break;
      localFile2 = h.getDownloadCacheDirectory();
      if (localFile2.canRead())
      {
        this.tGa = localFile2.getName();
        break label138;
      }
      localFile2 = null;
      break label138;
      localObject1 = localFile1.getAbsolutePath();
      break label154;
      localObject1 = localFile1;
      break label209;
      localObject1 = localFile2.getAbsolutePath();
      break label233;
      localObject1 = localFile2;
      break label290;
      if (localFile1 != null)
      {
        zI(0);
        this.tFU.haf = localFile1.getPath();
        this.tFU.d(this.tGb.getParentFile(), this.tGb);
        break label349;
      }
      w.d("MicroMsg.FileExplorerUI", "left and right tag disabled in the same time.");
      GMTrace.o(1127026262016L, 8397);
      return;
      bool1 = false;
      break label361;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1126220955648L, 8391);
    int i = R.i.cAY;
    GMTrace.o(1126220955648L, 8391);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1126355173376L, 8392);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("key_title");
    if (bg.nm(paramBundle)) {
      oM(R.l.dOh);
    }
    for (;;)
    {
      MP();
      GMTrace.o(1126355173376L, 8392);
      return;
      sq(paramBundle);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(1126757826560L, 8395);
    super.onDestroy();
    GMTrace.o(1126757826560L, 8395);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(1126892044288L, 8396);
    if ((paramInt == 4) && (a.a(this.tFU) != null))
    {
      if (1 == this.tFS) {
        this.tGc = a.a(this.tFU);
      }
      for (;;)
      {
        this.tFU.d(a.a(this.tFU).getParentFile(), a.a(this.tFU));
        this.tFU.notifyDataSetChanged();
        this.tFT.setSelection(0);
        GMTrace.o(1126892044288L, 8396);
        return true;
        if (this.tFS == 0) {
          this.tGb = a.a(this.tFU);
        }
      }
    }
    if (this.tGc != null)
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(131074, this.tGc.getAbsolutePath());
    }
    if (this.tGb != null)
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(131073, this.tGb.getAbsolutePath());
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(1126892044288L, 8396);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(1126623608832L, 8394);
    super.onPause();
    GMTrace.o(1126623608832L, 8394);
  }
  
  protected void onResume()
  {
    GMTrace.i(1126489391104L, 8393);
    super.onResume();
    GMTrace.o(1126489391104L, 8393);
  }
  
  private final class a
    extends BaseAdapter
  {
    String haf;
    private File tGg;
    private File tGh;
    private File[] tGi;
    
    private a()
    {
      GMTrace.i(1065822978048L, 7941);
      GMTrace.o(1065822978048L, 7941);
    }
    
    public final void d(File paramFile1, File paramFile2)
    {
      GMTrace.i(1065957195776L, 7942);
      this.tGg = paramFile1;
      if (paramFile2.getAbsolutePath().equalsIgnoreCase(this.haf)) {
        this.tGg = null;
      }
      this.tGh = paramFile2;
      if ((this.tGh.canRead()) && (this.tGh.isDirectory()))
      {
        this.tGi = this.tGh.listFiles(new FileFilter()
        {
          public final boolean accept(File paramAnonymousFile)
          {
            GMTrace.i(1140582252544L, 8498);
            if (paramAnonymousFile.isHidden())
            {
              GMTrace.o(1140582252544L, 8498);
              return false;
            }
            GMTrace.o(1140582252544L, 8498);
            return true;
          }
        });
        if (this.tGi.length > 0)
        {
          paramFile1 = this.tGi;
          if ((paramFile1 == null) || (paramFile1.length == 0))
          {
            GMTrace.o(1065957195776L, 7942);
            return;
          }
          Object localObject = new ArrayList();
          paramFile2 = new ArrayList();
          int j = paramFile1.length;
          int i = 0;
          if (i < j)
          {
            File localFile = paramFile1[i];
            FileExplorerUI.b localb = new FileExplorerUI.b(FileExplorerUI.this);
            localb.file = localFile;
            localb.tGk = com.tencent.mm.platformtools.c.nb(localFile.getName()).toUpperCase();
            if (localFile.isDirectory()) {
              ((List)localObject).add(localb);
            }
            for (;;)
            {
              i += 1;
              break;
              paramFile2.add(localb);
            }
          }
          Collections.sort((List)localObject, new Comparator() {});
          Collections.sort(paramFile2, new Comparator() {});
          localObject = ((List)localObject).iterator();
          i = 0;
          while (((Iterator)localObject).hasNext())
          {
            paramFile1[i] = ((FileExplorerUI.b)((Iterator)localObject).next()).file;
            i += 1;
          }
          paramFile2 = paramFile2.iterator();
          while (paramFile2.hasNext())
          {
            paramFile1[i] = ((FileExplorerUI.b)paramFile2.next()).file;
            i += 1;
          }
          GMTrace.o(1065957195776L, 7942);
        }
      }
      else
      {
        this.tGi = new File[0];
      }
      GMTrace.o(1065957195776L, 7942);
    }
    
    public final int getCount()
    {
      int i = 0;
      GMTrace.i(1066091413504L, 7943);
      if (this.tGi == null)
      {
        GMTrace.o(1066091413504L, 7943);
        return 0;
      }
      int j = this.tGi.length;
      if (this.tGg != null) {
        i = 1;
      }
      GMTrace.o(1066091413504L, 7943);
      return i + j;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(1066225631232L, 7944);
      if ((this.tGg != null) && (paramInt == 0))
      {
        localObject = this.tGg;
        GMTrace.o(1066225631232L, 7944);
        return localObject;
      }
      w.d("FileExplorer", "pos:" + paramInt + ", subFile length:" + this.tGi.length);
      Object localObject = this.tGi;
      if (this.tGg == null) {}
      for (;;)
      {
        localObject = localObject[paramInt];
        GMTrace.o(1066225631232L, 7944);
        return localObject;
        paramInt -= 1;
      }
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(1066359848960L, 7945);
      GMTrace.o(1066359848960L, 7945);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(1066494066688L, 7946);
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = View.inflate(FileExplorerUI.this, R.i.cAZ, null);
        paramView = new FileExplorerUI.c(FileExplorerUI.this);
        paramView.iub = ((ImageView)paramViewGroup.findViewById(R.h.bzK));
        paramView.jUm = ((TextView)paramViewGroup.findViewById(R.h.bzQ));
        paramView.tGl = ((TextView)paramViewGroup.findViewById(R.h.bzT));
        paramViewGroup.setTag(paramView);
      }
      Object localObject = (FileExplorerUI.c)paramViewGroup.getTag();
      paramView = (File)getItem(paramInt);
      if (paramView == this.tGg)
      {
        ((FileExplorerUI.c)localObject).jUm.setText(paramView.getName());
        ((FileExplorerUI.c)localObject).iub.setImageResource(R.g.aZe);
        ((FileExplorerUI.c)localObject).tGl.setVisibility(0);
        GMTrace.o(1066494066688L, 7946);
        return paramViewGroup;
      }
      ((FileExplorerUI.c)localObject).iub.setImageResource(FileExplorerUI.z(paramView));
      ((FileExplorerUI.c)localObject).jUm.setText(paramView.getName());
      localObject = ((FileExplorerUI.c)localObject).tGl;
      StringBuilder localStringBuilder = new StringBuilder().append(DateFormat.format("yyyy-MM-dd hh:mm:ss", paramView.lastModified()).toString());
      if (paramView.isDirectory()) {}
      for (paramView = "";; paramView = "  " + bg.aF(paramView.length()))
      {
        ((TextView)localObject).setText(paramView);
        break;
      }
    }
  }
  
  private final class b
  {
    File file;
    String tGk;
    
    public b()
    {
      GMTrace.i(1086089854976L, 8092);
      GMTrace.o(1086089854976L, 8092);
    }
  }
  
  private final class c
  {
    ImageView iub;
    TextView jUm;
    TextView tGl;
    
    public c()
    {
      GMTrace.i(1060722704384L, 7903);
      GMTrace.o(1060722704384L, 7903);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\FileExplorerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */