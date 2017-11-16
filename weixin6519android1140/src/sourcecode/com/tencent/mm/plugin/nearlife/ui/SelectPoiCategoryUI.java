package com.tencent.mm.plugin.nearlife.ui;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.aw.k;
import com.tencent.mm.g.a.lo;
import com.tencent.mm.g.a.lo.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.at;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SelectPoiCategoryUI
  extends MMActivity
{
  static final String nwE;
  private ListView Ev;
  private a nwF;
  private ArrayAdapter<String> nwG;
  private List<String> nwH;
  private AdapterView.OnItemClickListener nwI;
  private MenuItem.OnMenuItemClickListener nwz;
  
  static
  {
    GMTrace.i(12547478519808L, 93486);
    nwE = com.tencent.mm.storage.w.ghv + "poi_categories";
    GMTrace.o(12547478519808L, 93486);
  }
  
  public SelectPoiCategoryUI()
  {
    GMTrace.i(12546136342528L, 93476);
    this.nwI = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(12556739543040L, 93555);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SelectPoiCategoryUI", "item click on pos:%d, len:%d", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(SelectPoiCategoryUI.a(SelectPoiCategoryUI.this).size()) });
        paramAnonymousAdapterView = new Intent();
        paramAnonymousAdapterView.putExtra("poi_category", (String)SelectPoiCategoryUI.a(SelectPoiCategoryUI.this).get(paramAnonymousInt));
        SelectPoiCategoryUI.this.setResult(-1, paramAnonymousAdapterView);
        SelectPoiCategoryUI.this.finish();
        GMTrace.o(12556739543040L, 93555);
      }
    };
    this.nwz = new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12559289679872L, 93574);
        SelectPoiCategoryUI.this.setResult(0, null);
        SelectPoiCategoryUI.this.finish();
        GMTrace.o(12559289679872L, 93574);
        return true;
      }
    };
    GMTrace.o(12546136342528L, 93476);
  }
  
  private boolean DU(String paramString)
  {
    GMTrace.i(12546807431168L, 93481);
    if (bg.nm(paramString))
    {
      GMTrace.o(12546807431168L, 93481);
      return false;
    }
    File localFile = new File(paramString);
    if (!localFile.exists())
    {
      GMTrace.o(12546807431168L, 93481);
      return false;
    }
    try
    {
      boolean bool = m(new FileInputStream(localFile));
      GMTrace.o(12546807431168L, 93481);
      return bool;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SelectPoiCategoryUI", "update poi categories failed, path:%s, msg:%s", new Object[] { paramString, localFileNotFoundException.getMessage() });
      GMTrace.o(12546807431168L, 93481);
    }
    return false;
  }
  
  /* Error */
  private boolean m(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: ldc2_w 132
    //   3: ldc -122
    //   5: invokestatic 38	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_1
    //   9: ifnonnull +13 -> 22
    //   12: ldc2_w 132
    //   15: ldc -122
    //   17: invokestatic 63	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   20: iconst_0
    //   21: ireturn
    //   22: aload_0
    //   23: getfield 127	com/tencent/mm/plugin/nearlife/ui/SelectPoiCategoryUI:nwH	Ljava/util/List;
    //   26: invokeinterface 139 1 0
    //   31: new 141	java/io/BufferedReader
    //   34: dup
    //   35: new 143	java/io/InputStreamReader
    //   38: dup
    //   39: aload_1
    //   40: ldc -111
    //   42: invokespecial 148	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   45: invokespecial 151	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   48: astore_3
    //   49: aload_3
    //   50: astore_2
    //   51: aload_3
    //   52: invokevirtual 154	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   55: astore 4
    //   57: aload 4
    //   59: ifnull +71 -> 130
    //   62: aload_3
    //   63: astore_2
    //   64: aload_0
    //   65: getfield 127	com/tencent/mm/plugin/nearlife/ui/SelectPoiCategoryUI:nwH	Ljava/util/List;
    //   68: aload 4
    //   70: invokeinterface 158 2 0
    //   75: pop
    //   76: goto -27 -> 49
    //   79: astore 4
    //   81: aload_3
    //   82: astore_2
    //   83: ldc 108
    //   85: new 40	java/lang/StringBuilder
    //   88: dup
    //   89: ldc -96
    //   91: invokespecial 161	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   94: aload 4
    //   96: invokevirtual 162	java/io/IOException:getMessage	()Ljava/lang/String;
    //   99: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: invokestatic 165	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   108: aload_3
    //   109: ifnull +7 -> 116
    //   112: aload_3
    //   113: invokevirtual 168	java/io/BufferedReader:close	()V
    //   116: aload_1
    //   117: invokevirtual 171	java/io/InputStream:close	()V
    //   120: ldc2_w 132
    //   123: ldc -122
    //   125: invokestatic 63	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   128: iconst_1
    //   129: ireturn
    //   130: aload_3
    //   131: invokevirtual 168	java/io/BufferedReader:close	()V
    //   134: aload_1
    //   135: invokevirtual 171	java/io/InputStream:close	()V
    //   138: goto -18 -> 120
    //   141: astore_1
    //   142: ldc 108
    //   144: new 40	java/lang/StringBuilder
    //   147: dup
    //   148: ldc -83
    //   150: invokespecial 161	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   153: aload_1
    //   154: invokevirtual 174	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   157: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: invokestatic 165	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   166: goto -46 -> 120
    //   169: astore_1
    //   170: ldc 108
    //   172: new 40	java/lang/StringBuilder
    //   175: dup
    //   176: ldc -83
    //   178: invokespecial 161	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   181: aload_1
    //   182: invokevirtual 174	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   185: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   191: invokestatic 165	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   194: goto -74 -> 120
    //   197: astore_3
    //   198: aconst_null
    //   199: astore_2
    //   200: aload_2
    //   201: ifnull +7 -> 208
    //   204: aload_2
    //   205: invokevirtual 168	java/io/BufferedReader:close	()V
    //   208: aload_1
    //   209: invokevirtual 171	java/io/InputStream:close	()V
    //   212: aload_3
    //   213: athrow
    //   214: astore_1
    //   215: ldc 108
    //   217: new 40	java/lang/StringBuilder
    //   220: dup
    //   221: ldc -83
    //   223: invokespecial 161	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   226: aload_1
    //   227: invokevirtual 174	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   230: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   236: invokestatic 165	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   239: goto -27 -> 212
    //   242: astore_3
    //   243: goto -43 -> 200
    //   246: astore 4
    //   248: aconst_null
    //   249: astore_3
    //   250: goto -169 -> 81
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	253	0	this	SelectPoiCategoryUI
    //   0	253	1	paramInputStream	java.io.InputStream
    //   50	155	2	localBufferedReader1	java.io.BufferedReader
    //   48	83	3	localBufferedReader2	java.io.BufferedReader
    //   197	16	3	localObject1	Object
    //   242	1	3	localObject2	Object
    //   249	1	3	localObject3	Object
    //   55	14	4	str	String
    //   79	16	4	localIOException1	IOException
    //   246	1	4	localIOException2	IOException
    // Exception table:
    //   from	to	target	type
    //   51	57	79	java/io/IOException
    //   64	76	79	java/io/IOException
    //   130	138	141	java/lang/Exception
    //   112	116	169	java/lang/Exception
    //   116	120	169	java/lang/Exception
    //   31	49	197	finally
    //   204	208	214	java/lang/Exception
    //   208	212	214	java/lang/Exception
    //   51	57	242	finally
    //   64	76	242	finally
    //   83	108	242	finally
    //   31	49	246	java/io/IOException
  }
  
  protected final void MP()
  {
    GMTrace.i(12546538995712L, 93479);
    oM(R.l.dLC);
    a(this.nwz);
    this.nwG = new ArrayAdapter(this, R.i.cDp);
    this.Ev = ((ListView)findViewById(R.h.blW));
    this.Ev.setAdapter(this.nwG);
    this.Ev.setOnItemClickListener(this.nwI);
    AssetManager localAssetManager;
    if (!DU(nwE + "/lastest_poi_categories.dat")) {
      localAssetManager = getAssets();
    }
    try
    {
      m(localAssetManager.open("default_poi_categories.dat"));
      aTX();
      GMTrace.o(12546538995712L, 93479);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SelectPoiCategoryUI", "open file from assets failed: " + localIOException.getMessage());
      }
    }
  }
  
  final void aA(byte[] paramArrayOfByte)
  {
    GMTrace.i(12547075866624L, 93483);
    paramArrayOfByte = new String(paramArrayOfByte).split("\n");
    this.nwH.clear();
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      this.nwH.add(paramArrayOfByte[i].trim());
      i += 1;
    }
    GMTrace.o(12547075866624L, 93483);
  }
  
  final void aTX()
  {
    GMTrace.i(12547210084352L, 93484);
    this.nwG.clear();
    int i = 0;
    while (i < this.nwH.size())
    {
      this.nwG.add(this.nwH.get(i));
      i += 1;
    }
    this.nwG.notifyDataSetChanged();
    GMTrace.o(12547210084352L, 93484);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12546270560256L, 93477);
    int i = R.i.cFL;
    GMTrace.o(12546270560256L, 93477);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12546404777984L, 93478);
    super.onCreate(paramBundle);
    this.nwH = new ArrayList();
    MP();
    this.nwF = new a();
    paramBundle = this.nwF;
    a.vgX.b(paramBundle);
    this.nwF.nwK = this;
    paramBundle = new k(17);
    at.wS().a(paramBundle, 0);
    GMTrace.o(12546404777984L, 93478);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12546941648896L, 93482);
    super.onDestroy();
    a locala = this.nwF;
    a.vgX.c(locala);
    GMTrace.o(12546941648896L, 93482);
  }
  
  private final class a
    extends c<lo>
  {
    SelectPoiCategoryUI nwK;
    
    public a()
    {
      super();
      GMTrace.i(12559423897600L, 93575);
      this.vhf = lo.class.getName().hashCode();
      GMTrace.o(12559423897600L, 93575);
    }
    
    private boolean a(lo paramlo)
    {
      GMTrace.i(12559558115328L, 93576);
      SelectPoiCategoryUI localSelectPoiCategoryUI;
      Object localObject;
      if ((paramlo instanceof lo))
      {
        localSelectPoiCategoryUI = this.nwK;
        paramlo = paramlo.ePW.content;
        localObject = new File(SelectPoiCategoryUI.nwE);
        if (!((File)localObject).exists()) {
          ((File)localObject).mkdir();
        }
      }
      try
      {
        localObject = SelectPoiCategoryUI.nwE + "/lastest_poi_categories.dat";
        File localFile = new File((String)localObject);
        if (!localFile.exists()) {
          localFile.createNewFile();
        }
        e.b((String)localObject, paramlo, paramlo.length);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SelectPoiCategoryUI", "write file failed: " + localException.getMessage());
        }
      }
      localSelectPoiCategoryUI.aA(paramlo);
      localSelectPoiCategoryUI.aTX();
      GMTrace.o(12559558115328L, 93576);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearlife\ui\SelectPoiCategoryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */