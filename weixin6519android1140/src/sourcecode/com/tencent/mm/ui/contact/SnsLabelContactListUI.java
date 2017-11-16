package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.app.WorkerProfile;
import com.tencent.mm.g.a.hn;
import com.tencent.mm.g.a.hn.b;
import com.tencent.mm.g.a.ns;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class SnsLabelContactListUI
  extends MMActivity
{
  private ListView mvH;
  private bfh oWK;
  private a wUn;
  private ArrayList<String> wUo;
  private int wUp;
  private String wUq;
  private b wUr;
  
  public SnsLabelContactListUI()
  {
    GMTrace.i(1833145729024L, 13658);
    this.wUo = new ArrayList();
    GMTrace.o(1833145729024L, 13658);
  }
  
  private void cgM()
  {
    GMTrace.i(1833414164480L, 13660);
    Iterator localIterator;
    if (this.oWK.uEI == 3)
    {
      this.wUq = getString(R.l.edk);
      localIterator = this.oWK.uRb.iterator();
      while (localIterator.hasNext()) {
        this.wUo.add(((azq)localIterator.next()).uNR);
      }
      GMTrace.o(1833414164480L, 13660);
      return;
    }
    if (this.oWK.uEI == 5)
    {
      this.wUq = getString(R.l.edl);
      localIterator = this.oWK.uDw.iterator();
      while (localIterator.hasNext()) {
        this.wUo.add(((azq)localIterator.next()).uNR);
      }
    }
    GMTrace.o(1833414164480L, 13660);
  }
  
  protected final void MP()
  {
    GMTrace.i(1833548382208L, 13661);
    sq(this.wUq);
    findViewById(R.h.bKK).setVisibility(8);
    this.mvH = ((ListView)findViewById(R.h.bcT));
    ((TextView)findViewById(R.h.bwx)).setVisibility(8);
    findViewById(R.h.bdc).setVisibility(8);
    this.mvH.setBackgroundColor(getResources().getColor(R.e.white));
    ((View)this.mvH.getParent()).setBackgroundColor(getResources().getColor(R.e.white));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1844822671360L, 13745);
        SnsLabelContactListUI.this.finish();
        GMTrace.o(1844822671360L, 13745);
        return true;
      }
    });
    lg(false);
    if ((this.wUo != null) && (this.wUo.size() != 0))
    {
      this.wUn = new a(this, this.wUo);
      this.mvH.setAdapter(this.wUn);
      this.mvH.setVisibility(0);
      this.mvH.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(1803215175680L, 13435);
          paramAnonymousView = new Intent();
          paramAnonymousAdapterView = (com.tencent.mm.l.a)SnsLabelContactListUI.a(SnsLabelContactListUI.this).getItem(paramAnonymousInt);
          com.tencent.mm.plugin.sns.b.h localh = n.poT;
          if (localh == null)
          {
            SnsLabelContactListUI.this.finish();
            GMTrace.o(1803215175680L, 13435);
            return;
          }
          paramAnonymousView = localh.f(paramAnonymousView, paramAnonymousAdapterView.field_username);
          if (paramAnonymousView == null)
          {
            SnsLabelContactListUI.this.finish();
            GMTrace.o(1803215175680L, 13435);
            return;
          }
          paramAnonymousView.putExtra("Contact_User", paramAnonymousAdapterView.field_username);
          WorkerProfile.pz().etF.d(paramAnonymousView, SnsLabelContactListUI.this);
          GMTrace.o(1803215175680L, 13435);
        }
      });
    }
    GMTrace.o(1833548382208L, 13661);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1833951035392L, 13664);
    int i = R.i.coT;
    GMTrace.o(1833951035392L, 13664);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1833279946752L, 13659);
    super.onCreate(paramBundle);
    this.wUr = new b((byte)0);
    com.tencent.mm.sdk.b.a.vgX.b(this.wUr);
    this.wUp = getIntent().getIntExtra("sns_label_sns_info", -1);
    if (this.wUp == -1)
    {
      finish();
      GMTrace.o(1833279946752L, 13659);
      return;
    }
    paramBundle = new hn();
    paramBundle.eKO.eGH = this.wUp;
    com.tencent.mm.sdk.b.a.vgX.m(paramBundle);
    this.oWK = paramBundle.eKP.eKQ;
    if ((this.oWK != null) && (((this.oWK.uEI == 3) && (this.oWK.uRb != null) && (this.oWK.uRb.size() > 0)) || ((this.oWK.uEI == 5) && (this.oWK.uDw != null) && (this.oWK.uDw.size() > 0))))
    {
      cgM();
      MP();
    }
    GMTrace.o(1833279946752L, 13659);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(1833816817664L, 13663);
    com.tencent.mm.sdk.b.a.vgX.c(this.wUr);
    super.onDestroy();
    GMTrace.o(1833816817664L, 13663);
  }
  
  public void onResume()
  {
    GMTrace.i(1833682599936L, 13662);
    super.onResume();
    if (this.wUn != null) {
      this.wUn.notifyDataSetChanged();
    }
    GMTrace.o(1833682599936L, 13662);
  }
  
  private static final class a
    extends BaseAdapter
  {
    private Context context;
    private ar pYO;
    private Map<Integer, com.tencent.mm.l.a> wUt;
    private ColorStateList wUu;
    private ColorStateList wUv;
    
    /* Error */
    public a(Context paramContext, java.util.List<String> paramList)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 4
      //   3: aload_0
      //   4: invokespecial 26	android/widget/BaseAdapter:<init>	()V
      //   7: ldc2_w 27
      //   10: sipush 13252
      //   13: invokestatic 34	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   16: aload_0
      //   17: aconst_null
      //   18: putfield 36	com/tencent/mm/ui/contact/SnsLabelContactListUI$a:context	Landroid/content/Context;
      //   21: aload_0
      //   22: new 38	java/util/HashMap
      //   25: dup
      //   26: invokespecial 39	java/util/HashMap:<init>	()V
      //   29: putfield 41	com/tencent/mm/ui/contact/SnsLabelContactListUI$a:wUt	Ljava/util/Map;
      //   32: aload_0
      //   33: aconst_null
      //   34: putfield 43	com/tencent/mm/ui/contact/SnsLabelContactListUI$a:pYO	Lcom/tencent/mm/storage/ar;
      //   37: aload_0
      //   38: aload_1
      //   39: putfield 36	com/tencent/mm/ui/contact/SnsLabelContactListUI$a:context	Landroid/content/Context;
      //   42: aload_0
      //   43: getfield 41	com/tencent/mm/ui/contact/SnsLabelContactListUI$a:wUt	Ljava/util/Map;
      //   46: invokeinterface 48 1 0
      //   51: invokestatic 54	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
      //   54: pop
      //   55: aload_0
      //   56: invokestatic 60	com/tencent/mm/y/c:yK	()Lcom/tencent/mm/storage/ar;
      //   59: putfield 43	com/tencent/mm/ui/contact/SnsLabelContactListUI$a:pYO	Lcom/tencent/mm/storage/ar;
      //   62: aload_2
      //   63: invokeinterface 66 1 0
      //   68: astore_2
      //   69: iconst_0
      //   70: istore_3
      //   71: aload_2
      //   72: invokeinterface 72 1 0
      //   77: ifeq +53 -> 130
      //   80: aload_2
      //   81: invokeinterface 76 1 0
      //   86: checkcast 78	java/lang/String
      //   89: astore 5
      //   91: new 80	com/tencent/mm/l/a
      //   94: dup
      //   95: invokespecial 81	com/tencent/mm/l/a:<init>	()V
      //   98: astore 6
      //   100: aload 6
      //   102: aload 5
      //   104: invokevirtual 85	com/tencent/mm/l/a:setUsername	(Ljava/lang/String;)V
      //   107: aload_0
      //   108: getfield 41	com/tencent/mm/ui/contact/SnsLabelContactListUI$a:wUt	Ljava/util/Map;
      //   111: iload_3
      //   112: invokestatic 91	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   115: aload 6
      //   117: invokeinterface 95 3 0
      //   122: pop
      //   123: iload_3
      //   124: iconst_1
      //   125: iadd
      //   126: istore_3
      //   127: goto -56 -> 71
      //   130: aload_1
      //   131: invokevirtual 101	android/content/Context:getResources	()Landroid/content/res/Resources;
      //   134: getstatic 107	com/tencent/mm/R$e:aOq	I
      //   137: invokevirtual 113	android/content/res/Resources:getXml	(I)Landroid/content/res/XmlResourceParser;
      //   140: astore_2
      //   141: aload_1
      //   142: invokevirtual 101	android/content/Context:getResources	()Landroid/content/res/Resources;
      //   145: getstatic 116	com/tencent/mm/R$e:aOr	I
      //   148: invokevirtual 113	android/content/res/Resources:getXml	(I)Landroid/content/res/XmlResourceParser;
      //   151: astore 4
      //   153: aload 4
      //   155: astore 6
      //   157: aload_2
      //   158: astore 5
      //   160: aload_0
      //   161: aload_1
      //   162: invokevirtual 101	android/content/Context:getResources	()Landroid/content/res/Resources;
      //   165: aload_2
      //   166: invokestatic 122	android/content/res/ColorStateList:createFromXml	(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;)Landroid/content/res/ColorStateList;
      //   169: putfield 124	com/tencent/mm/ui/contact/SnsLabelContactListUI$a:wUu	Landroid/content/res/ColorStateList;
      //   172: aload 4
      //   174: astore 6
      //   176: aload_2
      //   177: astore 5
      //   179: aload_0
      //   180: aload_1
      //   181: invokevirtual 101	android/content/Context:getResources	()Landroid/content/res/Resources;
      //   184: aload 4
      //   186: invokestatic 122	android/content/res/ColorStateList:createFromXml	(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;)Landroid/content/res/ColorStateList;
      //   189: putfield 126	com/tencent/mm/ui/contact/SnsLabelContactListUI$a:wUv	Landroid/content/res/ColorStateList;
      //   192: aload_2
      //   193: ifnull +9 -> 202
      //   196: aload_2
      //   197: invokeinterface 131 1 0
      //   202: aload 4
      //   204: ifnull +162 -> 366
      //   207: aload 4
      //   209: invokeinterface 131 1 0
      //   214: ldc2_w 27
      //   217: sipush 13252
      //   220: invokestatic 134	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   223: return
      //   224: astore_2
      //   225: aconst_null
      //   226: astore 5
      //   228: aload 4
      //   230: astore_1
      //   231: aload 5
      //   233: astore 4
      //   235: ldc -120
      //   237: aload_2
      //   238: ldc -118
      //   240: iconst_0
      //   241: anewarray 140	java/lang/Object
      //   244: invokestatic 146	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   247: aload_1
      //   248: ifnull +9 -> 257
      //   251: aload_1
      //   252: invokeinterface 131 1 0
      //   257: aload 4
      //   259: ifnull +107 -> 366
      //   262: aload 4
      //   264: invokeinterface 131 1 0
      //   269: ldc2_w 27
      //   272: sipush 13252
      //   275: invokestatic 134	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   278: return
      //   279: astore_1
      //   280: aconst_null
      //   281: astore 4
      //   283: aconst_null
      //   284: astore_2
      //   285: aload 4
      //   287: astore 6
      //   289: aload_2
      //   290: astore 5
      //   292: ldc -120
      //   294: aload_1
      //   295: ldc -118
      //   297: iconst_0
      //   298: anewarray 140	java/lang/Object
      //   301: invokestatic 146	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   304: aload_2
      //   305: ifnull +9 -> 314
      //   308: aload_2
      //   309: invokeinterface 131 1 0
      //   314: aload 4
      //   316: ifnull +50 -> 366
      //   319: aload 4
      //   321: invokeinterface 131 1 0
      //   326: ldc2_w 27
      //   329: sipush 13252
      //   332: invokestatic 134	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   335: return
      //   336: astore_1
      //   337: aconst_null
      //   338: astore 4
      //   340: aconst_null
      //   341: astore_2
      //   342: aload_2
      //   343: ifnull +9 -> 352
      //   346: aload_2
      //   347: invokeinterface 131 1 0
      //   352: aload 4
      //   354: ifnull +10 -> 364
      //   357: aload 4
      //   359: invokeinterface 131 1 0
      //   364: aload_1
      //   365: athrow
      //   366: ldc2_w 27
      //   369: sipush 13252
      //   372: invokestatic 134	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   375: return
      //   376: astore_1
      //   377: aconst_null
      //   378: astore 4
      //   380: goto -38 -> 342
      //   383: astore_1
      //   384: aload 6
      //   386: astore 4
      //   388: aload 5
      //   390: astore_2
      //   391: goto -49 -> 342
      //   394: astore 5
      //   396: aload_1
      //   397: astore_2
      //   398: aload 5
      //   400: astore_1
      //   401: goto -59 -> 342
      //   404: astore_1
      //   405: aconst_null
      //   406: astore 4
      //   408: goto -123 -> 285
      //   411: astore_1
      //   412: goto -127 -> 285
      //   415: astore 5
      //   417: aconst_null
      //   418: astore 4
      //   420: aload_2
      //   421: astore_1
      //   422: aload 5
      //   424: astore_2
      //   425: goto -190 -> 235
      //   428: astore 5
      //   430: aload_2
      //   431: astore_1
      //   432: aload 5
      //   434: astore_2
      //   435: goto -200 -> 235
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	438	0	this	a
      //   0	438	1	paramContext	Context
      //   0	438	2	paramList	java.util.List<String>
      //   70	57	3	i	int
      //   1	418	4	localObject1	Object
      //   89	300	5	localObject2	Object
      //   394	5	5	localObject3	Object
      //   415	8	5	localXmlPullParserException1	org.xmlpull.v1.XmlPullParserException
      //   428	5	5	localXmlPullParserException2	org.xmlpull.v1.XmlPullParserException
      //   98	287	6	localObject4	Object
      // Exception table:
      //   from	to	target	type
      //   130	141	224	org/xmlpull/v1/XmlPullParserException
      //   130	141	279	java/io/IOException
      //   130	141	336	finally
      //   141	153	376	finally
      //   160	172	383	finally
      //   179	192	383	finally
      //   292	304	383	finally
      //   235	247	394	finally
      //   141	153	404	java/io/IOException
      //   160	172	411	java/io/IOException
      //   179	192	411	java/io/IOException
      //   141	153	415	org/xmlpull/v1/XmlPullParserException
      //   160	172	428	org/xmlpull/v1/XmlPullParserException
      //   179	192	428	org/xmlpull/v1/XmlPullParserException
    }
    
    public final int getCount()
    {
      GMTrace.i(1778787549184L, 13253);
      int i = this.wUt.size();
      GMTrace.o(1778787549184L, 13253);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(1778921766912L, 13254);
      if (paramInt < 0)
      {
        GMTrace.o(1778921766912L, 13254);
        return null;
      }
      com.tencent.mm.l.a locala = (com.tencent.mm.l.a)this.wUt.get(Integer.valueOf(paramInt));
      Object localObject = locala;
      if (locala.field_showHead == 0)
      {
        x localx = this.pYO.TE(locala.field_username);
        localObject = locala;
        if (localx != null)
        {
          this.wUt.put(Integer.valueOf(paramInt), localx);
          localObject = localx;
        }
      }
      GMTrace.o(1778921766912L, 13254);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(1779055984640L, 13255);
      GMTrace.o(1779055984640L, 13255);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(1779190202368L, 13256);
      com.tencent.mm.l.a locala;
      TextView localTextView;
      if (paramView == null)
      {
        paramView = View.inflate(this.context, R.i.ctM, null);
        paramViewGroup = new SnsLabelContactListUI.c();
        paramViewGroup.mpk = ((TextView)paramView.findViewById(R.h.brF));
        paramViewGroup.jRj = ((MaskLayout)paramView.findViewById(R.h.brD));
        paramViewGroup.jtr = ((TextView)paramView.findViewById(R.h.brH));
        paramViewGroup.wUx = ((TextView)paramView.findViewById(R.h.brB));
        paramView.setTag(paramViewGroup);
        getItem(paramInt);
        locala = (com.tencent.mm.l.a)getItem(paramInt);
        paramViewGroup.mpk.setVisibility(8);
        localTextView = paramViewGroup.jtr;
        if (s.gm(locala.field_username)) {
          break label241;
        }
      }
      label241:
      for (ColorStateList localColorStateList = this.wUu;; localColorStateList = this.wUv)
      {
        localTextView.setTextColor(localColorStateList);
        a.b.b((ImageView)paramViewGroup.jRj.view, locala.field_username, true);
        paramViewGroup.wUx.setVisibility(8);
        paramViewGroup.jRj.setVisibility(0);
        paramViewGroup.jtr.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.context, locala.vk(), paramViewGroup.jtr.getTextSize()));
        paramViewGroup.jtr.setVisibility(0);
        GMTrace.o(1779190202368L, 13256);
        return paramView;
        paramViewGroup = (SnsLabelContactListUI.c)paramView.getTag();
        break;
      }
    }
  }
  
  private final class b
    extends c<ns>
  {
    private b()
    {
      GMTrace.i(1748185907200L, 13025);
      this.vhf = ns.class.getName().hashCode();
      GMTrace.o(1748185907200L, 13025);
    }
  }
  
  private static final class c
  {
    MaskLayout jRj;
    TextView jtr;
    TextView mpk;
    TextView wUx;
    
    public c()
    {
      GMTrace.i(1733958828032L, 12919);
      GMTrace.o(1733958828032L, 12919);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\SnsLabelContactListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */