package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import android.os.Bundle;
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
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.qqmail.b.p.a;
import com.tencent.mm.plugin.qqmail.b.p.c;
import com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CompressPreviewUI
  extends MMActivity
{
  private ProgressBar iZc;
  private TextView lAp;
  private String nRW;
  private String nSK;
  private c nUI;
  private String nUj;
  private List<a> nVA;
  private String nVB;
  private ListView nVC;
  private b nVD;
  private p.a nVE;
  private long nVz;
  
  public CompressPreviewUI()
  {
    GMTrace.i(5548024004608L, 41336);
    this.nRW = null;
    this.nSK = null;
    this.nVz = 0L;
    this.nUI = new c(this);
    this.nVA = new ArrayList();
    this.nVE = new p.a()
    {
      public final void onError(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(5503597936640L, 41005);
        if (paramAnonymousInt == -5)
        {
          CompressPreviewUI.j(CompressPreviewUI.this).a(new c.a()
          {
            public final void aYH()
            {
              GMTrace.i(5511919435776L, 41067);
              CompressPreviewUI.i(CompressPreviewUI.this);
              GMTrace.o(5511919435776L, 41067);
            }
            
            public final void aYI()
            {
              GMTrace.i(5512053653504L, 41068);
              GMTrace.o(5512053653504L, 41068);
            }
          });
          GMTrace.o(5503597936640L, 41005);
          return;
        }
        CompressPreviewUI.k(CompressPreviewUI.this).setVisibility(8);
        CompressPreviewUI.l(CompressPreviewUI.this).setVisibility(0);
        CompressPreviewUI.d(CompressPreviewUI.this).setVisibility(8);
        GMTrace.o(5503597936640L, 41005);
      }
      
      public final void onSuccess(String paramAnonymousString, Map<String, String> paramAnonymousMap)
      {
        GMTrace.i(5503463718912L, 41004);
        CompressPreviewUI.b(CompressPreviewUI.this, (String)paramAnonymousMap.get(".Response.result.compressfilepath"));
        int j = bg.getInt((String)paramAnonymousMap.get(".Response.result.filelist.count"), 0);
        int i = 0;
        if (i < j) {}
        for (;;)
        {
          try
          {
            Object localObject = new StringBuilder(".Response.result.filelist.list.item");
            if (i <= 0) {
              break label411;
            }
            paramAnonymousString = Integer.valueOf(i);
            paramAnonymousString = paramAnonymousString;
            localObject = (String)paramAnonymousMap.get(paramAnonymousString + ".path");
            if (localObject == null) {
              break label404;
            }
            localObject = URLDecoder.decode((String)localObject, "utf-8");
            String str1 = (String)paramAnonymousMap.get(paramAnonymousString + ".parentpath");
            int k = bg.getInt((String)paramAnonymousMap.get(paramAnonymousString + ".size"), 0);
            int m = bg.getInt((String)paramAnonymousMap.get(paramAnonymousString + ".type"), 0);
            boolean bool = ((String)paramAnonymousMap.get(paramAnonymousString + ".preview")).equals("1");
            String str2 = (String)paramAnonymousMap.get(paramAnonymousString + ".name");
            List localList = CompressPreviewUI.h(CompressPreviewUI.this);
            CompressPreviewUI localCompressPreviewUI = CompressPreviewUI.this;
            if (k == 0)
            {
              paramAnonymousString = "";
              localList.add(new CompressPreviewUI.a(localCompressPreviewUI, (String)localObject, str2, str1, m, paramAnonymousString, bool));
              break label404;
            }
            paramAnonymousString = "(" + bg.aF(k) + ")";
            continue;
            CompressPreviewUI.a(CompressPreviewUI.this, "");
          }
          catch (Exception paramAnonymousString)
          {
            com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.CompressPreviewUI", paramAnonymousString, "", new Object[0]);
          }
          GMTrace.o(5503463718912L, 41004);
          return;
          label404:
          i += 1;
          break;
          label411:
          paramAnonymousString = "";
        }
      }
    };
    GMTrace.o(5548024004608L, 41336);
  }
  
  private void Fd(String paramString)
  {
    GMTrace.i(5548829310976L, 41342);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CompressPreviewUI", "curPath=" + paramString);
    this.iZc.setVisibility(8);
    this.lAp.setVisibility(8);
    this.nVC.setVisibility(0);
    a locala1 = Fe(paramString);
    ArrayList localArrayList = new ArrayList();
    if (locala1 != null) {
      localArrayList.add(locala1);
    }
    int i = 0;
    while (i < this.nVA.size())
    {
      a locala2 = (a)this.nVA.get(i);
      if (((paramString.endsWith(locala2.nVH)) && (locala2.nVH.length() > 0)) || (locala2.nVH.equals(paramString))) {
        localArrayList.add(locala2);
      }
      i += 1;
    }
    paramString = this.nVD;
    paramString.nVK = locala1;
    paramString.nVL = localArrayList;
    this.nVD.notifyDataSetChanged();
    this.nVC.setSelection(0);
    GMTrace.o(5548829310976L, 41342);
  }
  
  private a Fe(String paramString)
  {
    GMTrace.i(5548963528704L, 41343);
    Iterator localIterator = this.nVA.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.id.equals(paramString))
      {
        GMTrace.o(5548963528704L, 41343);
        return locala;
      }
    }
    GMTrace.o(5548963528704L, 41343);
    return null;
  }
  
  private void aYW()
  {
    GMTrace.i(5549097746432L, 41344);
    HashMap localHashMap = new HashMap();
    localHashMap.put("mailid", this.nRW);
    localHashMap.put("attachid", this.nSK);
    localHashMap.put("fun", "list");
    com.tencent.mm.plugin.qqmail.b.p localp = com.tencent.mm.plugin.qqmail.b.w.aYE();
    p.a locala = this.nVE;
    localp.a("/cgi-bin/viewcompress", localHashMap, new p.c(), locala);
    GMTrace.o(5549097746432L, 41344);
  }
  
  protected final void MP()
  {
    GMTrace.i(5548426657792L, 41339);
    this.nVC = ((ListView)findViewById(R.h.bpR));
    this.lAp = ((TextView)findViewById(R.h.bpP));
    this.iZc = ((ProgressBar)findViewById(R.h.bpQ));
    if ((this.nRW == null) || (this.nSK == null))
    {
      this.iZc.setVisibility(8);
      this.lAp.setText(R.l.dHC);
      GMTrace.o(5548426657792L, 41339);
      return;
    }
    this.nVD = new b((byte)0);
    this.nVC.setAdapter(this.nVD);
    this.nVC.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5542923730944L, 41298);
        paramAnonymousView = CompressPreviewUI.a(CompressPreviewUI.this).sU(paramAnonymousInt);
        String str1 = paramAnonymousView.id;
        paramAnonymousAdapterView = CompressPreviewUI.a(CompressPreviewUI.this);
        if (paramAnonymousAdapterView.nVK == null) {}
        for (paramAnonymousAdapterView = null; str1.equals(paramAnonymousAdapterView); paramAnonymousAdapterView = paramAnonymousAdapterView.nVK.id)
        {
          CompressPreviewUI.a(CompressPreviewUI.this, CompressPreviewUI.a(CompressPreviewUI.this).aYY());
          GMTrace.o(5542923730944L, 41298);
          return;
        }
        if (paramAnonymousView.aYX())
        {
          CompressPreviewUI.a(CompressPreviewUI.this, paramAnonymousView.id);
          GMTrace.o(5542923730944L, 41298);
          return;
        }
        if (paramAnonymousView.nVJ)
        {
          paramAnonymousAdapterView = "mailid=" + CompressPreviewUI.b(CompressPreviewUI.this);
          str1 = "attachid=" + paramAnonymousView.id;
          String str2 = "compressfilepath=" + CompressPreviewUI.c(CompressPreviewUI.this);
          Intent localIntent = new Intent(CompressPreviewUI.this, MailWebViewUI.class);
          localIntent.putExtra("uri", "/cgi-bin/viewdocument");
          localIntent.putExtra("params", new String[] { paramAnonymousAdapterView, str1, str2, "texttype=html" });
          localIntent.putExtra("baseurl", com.tencent.mm.plugin.qqmail.b.p.aYz());
          localIntent.putExtra("method", "get");
          localIntent.putExtra("singleColumn", FileExplorerUI.PF(paramAnonymousView.name));
          localIntent.putExtra("title", CompressPreviewUI.this.getString(R.l.dPU));
          CompressPreviewUI.this.startActivity(localIntent);
        }
        GMTrace.o(5542923730944L, 41298);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5511382564864L, 41063);
        CompressPreviewUI.this.onKeyDown(4, null);
        GMTrace.o(5511382564864L, 41063);
        return true;
      }
    });
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5536883933184L, 41253);
        BackwardSupportUtil.c.a(CompressPreviewUI.d(CompressPreviewUI.this));
        GMTrace.o(5536883933184L, 41253);
      }
    };
    a(0, getString(R.l.cSw), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5501584670720L, 40990);
        paramAnonymousMenuItem = new Intent(CompressPreviewUI.this, AttachDownloadPage.class);
        paramAnonymousMenuItem.putExtra("attach_name", CompressPreviewUI.e(CompressPreviewUI.this));
        paramAnonymousMenuItem.putExtra("mail_id", CompressPreviewUI.b(CompressPreviewUI.this));
        paramAnonymousMenuItem.putExtra("attach_id", CompressPreviewUI.f(CompressPreviewUI.this));
        paramAnonymousMenuItem.putExtra("total_size", CompressPreviewUI.g(CompressPreviewUI.this));
        paramAnonymousMenuItem.putExtra("is_preview", 0);
        paramAnonymousMenuItem.putExtra("is_compress", true);
        CompressPreviewUI.this.startActivity(paramAnonymousMenuItem);
        GMTrace.o(5501584670720L, 40990);
        return true;
      }
    });
    aYW();
    GMTrace.o(5548426657792L, 41339);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5548158222336L, 41337);
    int i = R.i.cAX;
    GMTrace.o(5548158222336L, 41337);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5548292440064L, 41338);
    super.onCreate(paramBundle);
    this.nRW = getIntent().getStringExtra("mail_id");
    this.nSK = getIntent().getStringExtra("attach_id");
    this.nVz = getIntent().getLongExtra("attach_size", 0L);
    this.nUj = getIntent().getStringExtra("attach_name");
    MP();
    sq(this.nUj);
    GMTrace.o(5548292440064L, 41338);
  }
  
  public void onDestroy()
  {
    GMTrace.i(5548560875520L, 41340);
    super.onDestroy();
    this.nUI.release();
    GMTrace.o(5548560875520L, 41340);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(5548695093248L, 41341);
    if ((paramInt == 4) && (this.nVD.aYY() != null))
    {
      Fd(this.nVD.aYY());
      GMTrace.o(5548695093248L, 41341);
      return true;
    }
    if (paramKeyEvent == null)
    {
      finish();
      GMTrace.o(5548695093248L, 41341);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(5548695093248L, 41341);
    return bool;
  }
  
  private final class a
  {
    String id;
    String nVH;
    String nVI;
    boolean nVJ;
    String name;
    int type;
    
    public a(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, boolean paramBoolean)
    {
      GMTrace.i(5505879638016L, 41022);
      this.id = paramString1;
      this.name = paramString2;
      this$1 = paramString3;
      if (paramString3 == null) {
        this$1 = "";
      }
      this.nVH = CompressPreviewUI.this;
      this.type = paramInt;
      this.nVI = paramString4;
      this.nVJ = paramBoolean;
      GMTrace.o(5505879638016L, 41022);
    }
    
    public final boolean aYX()
    {
      GMTrace.i(5506013855744L, 41023);
      if (this.type == 1)
      {
        GMTrace.o(5506013855744L, 41023);
        return true;
      }
      GMTrace.o(5506013855744L, 41023);
      return false;
    }
  }
  
  private final class b
    extends BaseAdapter
  {
    CompressPreviewUI.a nVK;
    List<CompressPreviewUI.a> nVL;
    
    private b()
    {
      GMTrace.i(5493128953856L, 40927);
      this.nVL = null;
      GMTrace.o(5493128953856L, 40927);
    }
    
    public final String aYY()
    {
      GMTrace.i(5493263171584L, 40928);
      if ((this.nVK == null) || (this.nVK.nVH == null))
      {
        GMTrace.o(5493263171584L, 40928);
        return null;
      }
      if (this.nVK.nVH.length() == 0)
      {
        GMTrace.o(5493263171584L, 40928);
        return "";
      }
      int i = this.nVK.id.indexOf(this.nVK.nVH);
      if (i >= 0)
      {
        String str = this.nVK.id.substring(0, i) + this.nVK.nVH;
        GMTrace.o(5493263171584L, 40928);
        return str;
      }
      GMTrace.o(5493263171584L, 40928);
      return null;
    }
    
    public final int getCount()
    {
      GMTrace.i(5493397389312L, 40929);
      if (this.nVL != null)
      {
        int i = this.nVL.size();
        GMTrace.o(5493397389312L, 40929);
        return i;
      }
      GMTrace.o(5493397389312L, 40929);
      return 0;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(5493665824768L, 40931);
      GMTrace.o(5493665824768L, 40931);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(5493800042496L, 40932);
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = View.inflate(CompressPreviewUI.this.vKB.vKW, R.i.cAW, null);
        paramView = new a();
        paramView.iub = ((ImageView)paramViewGroup.findViewById(R.h.bzK));
        paramView.jUm = ((TextView)paramViewGroup.findViewById(R.h.bzQ));
        paramView.nVM = ((TextView)paramViewGroup.findViewById(R.h.bzR));
        paramView.nVN = ((ImageView)paramViewGroup.findViewById(R.h.bzS));
        paramViewGroup.setTag(paramView);
      }
      a locala = (a)paramViewGroup.getTag();
      CompressPreviewUI.a locala1 = sU(paramInt);
      if ((paramInt == 0) && (aYY() != null))
      {
        paramView = locala.iub;
        paramInt = R.g.aZe;
        paramView.setImageResource(paramInt);
        paramView = locala.nVN;
        if (!locala1.nVJ) {
          break label234;
        }
      }
      label234:
      for (paramInt = 0;; paramInt = 4)
      {
        paramView.setVisibility(paramInt);
        locala.jUm.setText(locala1.name);
        locala.nVM.setText(locala1.nVI);
        GMTrace.o(5493800042496L, 40932);
        return paramViewGroup;
        paramView = locala.iub;
        if (locala1.aYX())
        {
          paramInt = R.g.aZf;
          break;
        }
        paramInt = FileExplorerUI.PE(locala1.name);
        break;
      }
    }
    
    public final CompressPreviewUI.a sU(int paramInt)
    {
      GMTrace.i(5493531607040L, 40930);
      if ((this.nVL != null) && (this.nVL.size() > paramInt))
      {
        CompressPreviewUI.a locala = (CompressPreviewUI.a)this.nVL.get(paramInt);
        GMTrace.o(5493531607040L, 40930);
        return locala;
      }
      GMTrace.o(5493531607040L, 40930);
      return null;
    }
    
    private final class a
    {
      ImageView iub;
      TextView jUm;
      TextView nVM;
      ImageView nVN;
      
      public a()
      {
        GMTrace.i(5511516782592L, 41064);
        GMTrace.o(5511516782592L, 41064);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\ui\CompressPreviewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */