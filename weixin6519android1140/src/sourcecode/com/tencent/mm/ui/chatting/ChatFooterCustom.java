package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.af.d.b;
import com.tencent.mm.af.d.b.b;
import com.tencent.mm.af.j;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.g.a.du;
import com.tencent.mm.g.a.lt;
import com.tencent.mm.g.a.lt.a;
import com.tencent.mm.g.a.lu;
import com.tencent.mm.g.a.lu.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.v;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.d;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bt.a;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class ChatFooterCustom
  extends LinearLayout
  implements View.OnClickListener, bt.a
{
  x eMY;
  private String iAx;
  private com.tencent.mm.af.d jsU;
  private LinearLayout kuN;
  private Object oNZ;
  ChatFooter.d tzD;
  private com.tencent.mm.ui.u vMc;
  private ImageView wtI;
  ImageView wtJ;
  y wtK;
  En_5b8fbb1e.a.b wtL;
  private int wtM;
  private ay wtN;
  private a wtO;
  private b wtP;
  private List<String> wtQ;
  private final String wtR;
  private final String wtS;
  private j wtT;
  
  public ChatFooterCustom(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(2137819971584L, 15928);
    GMTrace.o(2137819971584L, 15928);
  }
  
  public ChatFooterCustom(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2137954189312L, 15929);
    this.kuN = null;
    this.wtI = null;
    this.wtJ = null;
    this.wtK = null;
    this.tzD = null;
    this.wtL = null;
    this.wtM = 0;
    this.wtQ = new LinkedList();
    this.wtR = "qrcode";
    this.wtS = "barcode";
    this.oNZ = new Object();
    GMTrace.o(2137954189312L, 15929);
  }
  
  private boolean a(j paramj)
  {
    GMTrace.i(17918603558912L, 133504);
    if (paramj == null)
    {
      GMTrace.o(17918603558912L, 133504);
      return false;
    }
    String str = paramj.id + paramj.amf;
    paramj = this.oNZ;
    for (int i = 0;; i = -1) {
      try
      {
        while (i < this.wtQ.size())
        {
          if (((String)this.wtQ.get(i)).equals(str))
          {
            if (i >= 0)
            {
              this.wtQ.remove(i);
              w.e("ChatCustomFooter", "removeOneFromMenuClickCmdList success %s %d", new Object[] { str, Integer.valueOf(this.wtQ.size()) });
              GMTrace.o(17918603558912L, 133504);
              return true;
            }
          }
          else
          {
            i += 1;
            continue;
          }
          w.e("ChatCustomFooter", "removeOneFromMenuClickCmdList fail %s %d", new Object[] { str, Integer.valueOf(this.wtQ.size()) });
          GMTrace.o(17918603558912L, 133504);
          return false;
        }
      }
      finally {}
    }
  }
  
  private void b(j paramj)
  {
    GMTrace.i(17918737776640L, 133505);
    com.tencent.mm.plugin.report.service.g.ork.i(10809, new Object[] { this.iAx, Integer.valueOf(paramj.id), paramj.amf, j.gxb, "" });
    GMTrace.o(17918737776640L, 133505);
  }
  
  private boolean bO(Object paramObject)
  {
    GMTrace.i(2139430584320L, 15940);
    if (!(paramObject instanceof lt))
    {
      w.e("ChatCustomFooter", "send current location data type error!");
      GMTrace.o(2139430584320L, 15940);
      return true;
    }
    Object localObject = (lt)paramObject;
    double d1 = ((lt)localObject).eQj.lat;
    double d2 = ((lt)localObject).eQj.lng;
    int i = ((lt)localObject).eQj.eMn;
    paramObject = ((lt)localObject).eQj.label;
    String str = ((lt)localObject).eQj.eQm;
    w.i("ChatCustomFooter", "lat:%f , lng:%f , scale: %d , label:%s , poiname:%s", new Object[] { Double.valueOf(d1), Double.valueOf(d2), Integer.valueOf(i), paramObject, str });
    if ((this.wtT == null) || (this.wtT.gxf != 105))
    {
      w.e("ChatCustomFooter", "cache lost or location type is not correct");
      GMTrace.o(2139430584320L, 15940);
      return true;
    }
    this.wtT.state = j.gxd;
    localObject = this.wtT;
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("x", String.valueOf(d1));
      localJSONObject.put("y", String.valueOf(d2));
      localJSONObject.put("scale", i);
      localJSONObject.put("label", paramObject);
      localJSONObject.put("poiname", str);
      paramObject = new JSONObject();
      ((JSONObject)paramObject).put("location", localJSONObject);
      ((j)localObject).content = ((JSONObject)paramObject).toString();
      w.v("MicroMsg.BizMenuItem", ((j)localObject).content);
      if (a(this.wtT))
      {
        d(this.wtT);
        c(this.wtT);
      }
      GMTrace.o(2139430584320L, 15940);
      return true;
    }
    catch (JSONException paramObject)
    {
      for (;;)
      {
        w.e("MicroMsg.BizMenuItem", ((JSONException)paramObject).toString());
      }
    }
  }
  
  private boolean bP(Object paramObject)
  {
    GMTrace.i(2139564802048L, 15941);
    if (!(paramObject instanceof lu))
    {
      w.e("ChatCustomFooter", "send current location data type error!");
      GMTrace.o(2139564802048L, 15941);
      return false;
    }
    Object localObject = (lu)paramObject;
    if ((this.wtT == null) || ((this.wtT.gxf != 100) && (this.wtT.gxf != 101)))
    {
      w.e("ChatCustomFooter", "null pointer in cache or type error");
      GMTrace.o(2139564802048L, 15941);
      return false;
    }
    switch (((lu)localObject).eQn.eQp)
    {
    default: 
      paramObject = "";
    }
    for (;;)
    {
      String str = ((lu)localObject).eQn.scanResult;
      w.i("ChatCustomFooter", "scan type: %s , scan result:%s", new Object[] { paramObject, str });
      this.wtT.state = j.gxd;
      localObject = this.wtT;
      w.v("MicroMsg.BizMenuItem", "type is %s , result is %s", new Object[] { paramObject, str });
      try
      {
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("scan_type", paramObject);
        localJSONObject.put("scan_result", str);
        paramObject = new JSONObject();
        ((JSONObject)paramObject).put("scan_code", localJSONObject);
        ((j)localObject).content = ((JSONObject)paramObject).toString();
        w.v("MicroMsg.BizMenuItem", "content: %s", new Object[] { ((j)localObject).content });
        if (a(this.wtT))
        {
          d(this.wtT);
          c(this.wtT);
        }
        GMTrace.o(2139564802048L, 15941);
        return true;
        paramObject = "qrcode";
        continue;
        paramObject = "barcode";
      }
      catch (JSONException paramObject)
      {
        for (;;)
        {
          w.e("MicroMsg.BizMenuItem", ((JSONException)paramObject).toString());
        }
      }
    }
  }
  
  private void c(j paramj)
  {
    GMTrace.i(17918871994368L, 133506);
    com.tencent.mm.plugin.report.service.g.ork.i(10809, new Object[] { this.iAx, Integer.valueOf(paramj.id), paramj.amf, j.gxd, paramj.content });
    GMTrace.o(17918871994368L, 133506);
  }
  
  private void cbV()
  {
    GMTrace.i(2138356842496L, 15932);
    if ((this.vMc != null) && (this.eMY != null) && (!com.tencent.mm.platformtools.t.nm(this.iAx))) {
      k.b(this.vMc, 9, this.iAx, this.eMY.field_username);
    }
    GMTrace.o(2138356842496L, 15932);
  }
  
  private void cbW()
  {
    GMTrace.i(2138491060224L, 15933);
    File localFile = new File(e.fRZ);
    if ((!localFile.exists()) && (!localFile.mkdir()))
    {
      Toast.makeText((Activity)getContext(), getContext().getString(R.l.dhy), 1).show();
      GMTrace.o(2138491060224L, 15933);
      return;
    }
    if ((this.vMc != null) && (!k.a(this.vMc, e.fRZ, "microMsg." + System.currentTimeMillis() + ".jpg"))) {
      Toast.makeText((Activity)getContext(), getContext().getString(R.l.dWY), 1).show();
    }
    GMTrace.o(2138491060224L, 15933);
  }
  
  private void cbY()
  {
    GMTrace.i(2140101672960L, 15945);
    w.i("ChatCustomFooter", "switch footer");
    if (this.tzD != null)
    {
      this.wtK.cca();
      this.tzD.ks(true);
    }
    GMTrace.o(2140101672960L, 15945);
  }
  
  private void cbZ()
  {
    GMTrace.i(2140235890688L, 15946);
    if (this.eMY == null)
    {
      GMTrace.o(2140235890688L, 15946);
      return;
    }
    if (this.eMY.fjs == 1)
    {
      at.AR();
      com.tencent.mm.y.c.yP().TS(this.eMY.field_username);
    }
    GMTrace.o(2140235890688L, 15946);
  }
  
  private void d(j paramj)
  {
    GMTrace.i(17919006212096L, 133507);
    w.i("ChatCustomFooter", paramj.getInfo());
    paramj = new com.tencent.mm.af.q(this.iAx, 1, paramj.getInfo(), null);
    at.wS().a(paramj, 0);
    GMTrace.o(17919006212096L, 133507);
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(2139967455232L, 15944);
    parama = com.tencent.mm.platformtools.n.a(parama.gtM.tPY);
    w.i("ChatCustomFooter", "SysCmdMsgExtension:" + parama);
    for (;;)
    {
      Object localObject;
      try
      {
        localObject = XmlPullParserFactory.newInstance();
        ((XmlPullParserFactory)localObject).setNamespaceAware(true);
        localObject = ((XmlPullParserFactory)localObject).newPullParser();
        ((XmlPullParser)localObject).setInput(new StringReader(parama));
        i = ((XmlPullParser)localObject).getEventType();
      }
      catch (Exception parama)
      {
        w.printErrStackTrace("ChatCustomFooter", parama, "", new Object[0]);
        GMTrace.o(2139967455232L, 15944);
        return;
      }
      int i = ((XmlPullParser)localObject).next();
      break label207;
      parama = ((XmlPullParser)localObject).getName();
      if ("sysmsg".equals(parama))
      {
        if ("type".equals(((XmlPullParser)localObject).getAttributeName(0))) {
          ((XmlPullParser)localObject).getAttributeValue(0);
        }
      }
      else if ("username".equals(parama))
      {
        ((XmlPullParser)localObject).nextText();
      }
      else if ("data".equals(parama))
      {
        ((XmlPullParser)localObject).nextText();
        label207:
        while (i == 1)
        {
          GMTrace.o(2139967455232L, 15944);
          return;
        }
        switch (i)
        {
        }
      }
    }
  }
  
  public final void a(com.tencent.mm.ui.u paramu, com.tencent.mm.af.d paramd, String paramString)
  {
    GMTrace.i(19221052391424L, 143208);
    d.b.b localb = paramd.bq(false).Ff();
    if ((localb == null) || (localb.gwx == null) || (paramString == null)) {
      throw new IllegalArgumentException(" menuInfo or username is null ! ");
    }
    this.wtM = Math.min(localb.gwx.size(), 6);
    w.i("ChatCustomFooter", "setMenus, count:" + this.wtM);
    if (this.wtM <= 0) {
      throw new IllegalArgumentException(" mTabCount is invalid ! ");
    }
    int i;
    label144:
    FrameLayout localFrameLayout;
    TextView localTextView;
    ImageView localImageView;
    if (this.wtM > 3)
    {
      this.wtI.setVisibility(0);
      this.kuN.setWeightSum(Math.min(this.wtM, 3));
      i = 0;
      if (i >= 6) {
        break label373;
      }
      localFrameLayout = (FrameLayout)this.kuN.getChildAt(i);
      localTextView = (TextView)localFrameLayout.getChildAt(0).findViewById(R.h.bnz);
      localFrameLayout.getChildAt(0).findViewById(R.h.bny).setVisibility(8);
      localImageView = (ImageView)localFrameLayout.getChildAt(1);
      localImageView.setVisibility(8);
      if (i >= this.wtM) {
        break label314;
      }
      j localj = (j)localb.gwx.get(i);
      localFrameLayout.setTag(localj);
      localTextView.setText(com.tencent.mm.pluginsdk.ui.d.h.a(getContext(), localj.name));
      if (localj.type == 0) {
        localImageView.setVisibility(0);
      }
      localFrameLayout.setOnClickListener(this);
      localFrameLayout.setVisibility(0);
    }
    for (;;)
    {
      i += 1;
      break label144;
      this.wtI.setVisibility(8);
      break;
      label314:
      if ((i >= 3) && (this.wtM > 3))
      {
        localFrameLayout.setTag(null);
        localTextView.setText("");
        localImageView.setVisibility(8);
        localFrameLayout.setOnClickListener(null);
        localFrameLayout.setVisibility(0);
      }
      else
      {
        localFrameLayout.setVisibility(8);
      }
    }
    label373:
    this.vMc = paramu;
    this.iAx = paramString;
    this.jsU = paramd;
    if (this.wtO != null) {
      com.tencent.mm.sdk.b.a.vgX.c(this.wtO);
    }
    if (this.wtP != null) {
      com.tencent.mm.sdk.b.a.vgX.c(this.wtP);
    }
    this.wtO = new a((byte)0);
    this.wtP = new b((byte)0);
    com.tencent.mm.sdk.b.a.vgX.b(this.wtO);
    com.tencent.mm.sdk.b.a.vgX.b(this.wtP);
    GMTrace.o(19221052391424L, 143208);
  }
  
  public final void boW()
  {
    GMTrace.i(2138222624768L, 15931);
    if (this.wtO != null) {
      com.tencent.mm.sdk.b.a.vgX.c(this.wtO);
    }
    if (this.wtP != null) {
      com.tencent.mm.sdk.b.a.vgX.c(this.wtP);
    }
    GMTrace.o(2138222624768L, 15931);
  }
  
  public final void cbX()
  {
    GMTrace.i(2138625277952L, 15934);
    if (this.wtK != null) {
      this.wtK.cca();
    }
    GMTrace.o(2138625277952L, 15934);
  }
  
  public final boolean h(int paramInt, Object paramObject)
  {
    GMTrace.i(2139296366592L, 15939);
    if (paramObject == null)
    {
      w.e("ChatCustomFooter", "returned data is null, maybe serve for UI");
      GMTrace.o(2139296366592L, 15939);
      return true;
    }
    switch (paramInt)
    {
    }
    for (;;)
    {
      switch (paramInt)
      {
      default: 
        GMTrace.o(2139296366592L, 15939);
        return true;
        paramInt = 1001;
        continue;
        paramInt = 1002;
      }
    }
    w.i("ChatCustomFooter", "return from camera");
    if (!(paramObject instanceof Intent))
    {
      w.e("ChatCustomFooter", "type error");
      GMTrace.o(2139296366592L, 15939);
      return true;
    }
    paramObject = ((Intent)paramObject).getStringExtra("CropImage_OutputPath");
    if (paramObject == null)
    {
      w.e("ChatCustomFooter", "return null path");
      GMTrace.o(2139296366592L, 15939);
      return true;
    }
    Object localObject = new File((String)paramObject);
    if ((((File)localObject).exists()) && (((File)localObject).isFile()))
    {
      w.i("ChatCustomFooter", "%s retrieved!", new Object[] { paramObject });
      paramObject = com.tencent.mm.a.g.h((File)localObject);
      w.i("ChatCustomFooter", "MD5 is %s", new Object[] { paramObject });
      if ((this.wtT == null) || ((this.wtT.gxf != 102) && (this.wtT.gxf != 103)))
      {
        w.e("ChatCustomFooter", "camera photo cache lost or temp type error! cannot pass info!");
        GMTrace.o(2139296366592L, 15939);
        return true;
      }
      localObject = new ArrayList();
      ((ArrayList)localObject).add(paramObject);
      this.wtT.state = j.gxd;
      this.wtT.e((ArrayList)localObject);
      if (a(this.wtT))
      {
        d(this.wtT);
        c(this.wtT);
      }
    }
    for (;;)
    {
      GMTrace.o(2139296366592L, 15939);
      return true;
      w.e("ChatCustomFooter", "%s cannot be retrieved as file or is directory!!", new Object[] { paramObject });
    }
    w.i("ChatCustomFooter", "return from albumn");
    if (!(paramObject instanceof Intent))
    {
      w.e("ChatCustomFooter", "type error");
      GMTrace.o(2139296366592L, 15939);
      return true;
    }
    localObject = ((Intent)paramObject).getStringArrayListExtra("CropImage_OutputPath_List");
    paramObject = new ArrayList();
    if ((localObject != null) && (((ArrayList)localObject).size() != 0))
    {
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        w.i("ChatCustomFooter", "retrieving bitmap path %s", new Object[] { str });
        if (str != null)
        {
          File localFile = new File(str);
          if ((localFile.exists()) && (localFile.isFile()))
          {
            w.i("ChatCustomFooter", "%s retrieved!", new Object[] { str });
            str = com.tencent.mm.a.g.h(localFile);
            ((ArrayList)paramObject).add(str);
            w.i("ChatCustomFooter", "MD5 is %s", new Object[] { str });
          }
        }
        else
        {
          w.e("ChatCustomFooter", "no file contained!");
          continue;
        }
        w.e("ChatCustomFooter", "%s cannot be retrieved as file or is directory!!", new Object[] { str });
      }
      if ((this.wtT == null) || ((this.wtT.gxf != 104) && (this.wtT.gxf != 103) && (this.wtT.gxf != 102)))
      {
        w.e("ChatCustomFooter", "albumn photo cache lost or temp type error! cannot pass info!");
        GMTrace.o(2139296366592L, 15939);
        return true;
      }
      this.wtT.state = j.gxd;
      this.wtT.e((ArrayList)paramObject);
      if (a(this.wtT))
      {
        d(this.wtT);
        c(this.wtT);
      }
    }
    GMTrace.o(2139296366592L, 15939);
    return true;
    w.i("ChatCustomFooter", "send current");
    bO(paramObject);
    GMTrace.o(2139296366592L, 15939);
    return true;
    w.i("ChatCustomFooter", "send selected");
    bO(paramObject);
    GMTrace.o(2139296366592L, 15939);
    return true;
    w.i("ChatCustomFooter", "send qrcode wait msg");
    if (!bP(paramObject))
    {
      GMTrace.o(2139296366592L, 15939);
      return true;
    }
    this.wtL.ceu();
    GMTrace.o(2139296366592L, 15939);
    return true;
    w.i("ChatCustomFooter", "send qrcode direct");
    bP(paramObject);
    GMTrace.o(2139296366592L, 15939);
    return true;
  }
  
  public final void k(ViewGroup paramViewGroup)
  {
    GMTrace.i(2139833237504L, 15943);
    this.kuN = ((LinearLayout)findViewById(R.h.bnx));
    this.wtJ = ((ImageView)findViewById(R.h.bnB));
    this.wtJ.setVisibility(0);
    this.wtJ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2252039258112L, 16779);
        ChatFooterCustom.c(ChatFooterCustom.this);
        GMTrace.o(2252039258112L, 16779);
      }
    });
    this.wtI = ((ImageView)findViewById(R.h.bnw));
    this.wtI.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2162784468992L, 16114);
        ChatFooterCustom.d(ChatFooterCustom.this).cca();
        paramAnonymousView = (ImageView)paramAnonymousView;
        int j;
        if (paramAnonymousView.getTag() == null)
        {
          paramAnonymousView.setTag(new Object());
          paramAnonymousView.setImageResource(R.g.aXY);
          i = 0;
          if (i < ChatFooterCustom.e(ChatFooterCustom.this))
          {
            paramAnonymousView = ChatFooterCustom.f(ChatFooterCustom.this).getChildAt(i);
            if (i >= 3) {}
            for (j = 0;; j = 8)
            {
              paramAnonymousView.setVisibility(j);
              i += 1;
              break;
            }
          }
          GMTrace.o(2162784468992L, 16114);
          return;
        }
        paramAnonymousView.setTag(null);
        paramAnonymousView.setImageResource(R.g.aXX);
        int i = 0;
        if (i < ChatFooterCustom.e(ChatFooterCustom.this))
        {
          paramAnonymousView = ChatFooterCustom.f(ChatFooterCustom.this).getChildAt(i);
          if (i < 3) {}
          for (j = 0;; j = 8)
          {
            paramAnonymousView.setVisibility(j);
            i += 1;
            break;
          }
        }
        GMTrace.o(2162784468992L, 16114);
      }
    });
    this.wtK = new y(getContext(), paramViewGroup);
    this.wtK.wtV = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(2209358020608L, 16461);
        ChatFooterCustom.this.onClick(paramAnonymousView);
        GMTrace.o(2209358020608L, 16461);
      }
    };
    GMTrace.o(2139833237504L, 15943);
  }
  
  public void onClick(View arg1)
  {
    label100:
    Object localObject4;
    for (;;)
    {
      Object localObject1;
      try
      {
        GMTrace.i(2138759495680L, 15935);
        localObject1 = ???.getTag();
        if (!(localObject1 instanceof j))
        {
          GMTrace.o(2138759495680L, 15935);
          return;
        }
        com.tencent.mm.pluginsdk.wallet.h.zJ(8);
        localObject1 = (j)localObject1;
        ((j)localObject1).content = "";
        switch (((j)localObject1).type)
        {
        case 0: 
          GMTrace.o(2138759495680L, 15935);
          continue;
          localObject4 = new int[2];
        }
      }
      finally {}
      ???.getLocationOnScreen((int[])localObject4);
      w.i("ChatCustomFooter", "show/dismiss submenu, pos:(%d, %d), view width:%d", new Object[] { Integer.valueOf(localObject4[0]), Integer.valueOf(localObject4[1]), Integer.valueOf(???.getWidth()) });
      Object localObject5 = this.wtK;
      int i = localObject4[0] + ???.getWidth() / 2;
      int j = localObject4[1];
      if (!((y)localObject5).isShowing())
      {
        ((y)localObject5).a((j)localObject1, i, j, false);
        GMTrace.o(2138759495680L, 15935);
      }
      else
      {
        ((y)localObject5).cca();
        if ((localObject1 != null) && ((((y)localObject5).wub.id != ((j)localObject1).id) || (!((y)localObject5).wub.amf.equals(((j)localObject1).amf)))) {
          ((y)localObject5).a((j)localObject1, i, j, false);
        }
        GMTrace.o(2138759495680L, 15935);
        continue;
        w.i("ChatCustomFooter", "start webview url");
        cbZ();
        this.wtK.cca();
        ((j)localObject1).state = j.gxb;
        b((j)localObject1);
        d((j)localObject1);
        if ((!p.a.tme.b(getContext(), ((j)localObject1).value, new Object[0])) && (!s.a(((j)localObject1).eYm, getContext(), this.vMc, this.iAx)))
        {
          ??? = new Intent();
          ???.putExtra("KPublisherId", "custom_menu");
          ???.putExtra("pre_username", this.iAx);
          ???.putExtra("prePublishId", "custom_menu");
          ???.putExtra("preUsername", this.iAx);
          ???.putExtra("preChatName", this.iAx);
          ???.putExtra("preChatTYPE", com.tencent.mm.y.t.H(this.iAx, this.iAx));
          ???.putExtra("rawUrl", ((j)localObject1).value);
          ???.putExtra("geta8key_username", this.iAx);
          ???.putExtra("from_scence", 1);
          com.tencent.mm.bj.d.b(getContext(), "webview", ".ui.tools.WebViewUI", ???);
          GMTrace.o(2138759495680L, 15935);
          continue;
          w.i("ChatCustomFooter", "switch to input");
          this.wtK.cca();
          cbY();
          ((j)localObject1).state = j.gxb;
          b((j)localObject1);
          d((j)localObject1);
          GMTrace.o(2138759495680L, 15935);
          continue;
          w.i("ChatCustomFooter", "get latest message");
          cbZ();
          this.wtK.cca();
          ((j)localObject1).state = j.gxb;
          b((j)localObject1);
          d((j)localObject1);
          this.wtL.ceu();
          GMTrace.o(2138759495680L, 15935);
          continue;
          cbZ();
          this.wtK.cca();
          ((j)localObject1).state = j.gxb;
          b((j)localObject1);
          d((j)localObject1);
          bool = TextUtils.isEmpty(((j)localObject1).value);
          if (!bool)
          {
            try
            {
              ??? = new JSONObject(((j)localObject1).value);
              localObject1 = new AppBrandStatObject();
              ((AppBrandStatObject)localObject1).scene = 1035;
              ((AppBrandStatObject)localObject1).eAv = this.iAx;
              localObject4 = (com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class);
              localObject5 = getContext();
              String str1 = ???.optString("userName");
              String str2 = ???.optString("pagePath");
              if (this.jsU == null) {}
              for (??? = null;; ??? = this.jsU.field_appId)
              {
                ((com.tencent.mm.plugin.appbrand.k.c)localObject4).a((Context)localObject5, str1, null, 0, 0, str2, (AppBrandStatObject)localObject1, ???);
                GMTrace.o(2138759495680L, 15935);
                break;
              }
            }
            catch (JSONException ???)
            {
              GMTrace.o(2138759495680L, 15935);
            }
            w.i("ChatCustomFooter", "MM_BIZ_CUSTOM_MENU_TYPE_CUSTOM_CLICK");
            cbZ();
            this.wtK.cca();
            ((j)localObject1).state = j.gxc;
            localObject4 = ((j)localObject1).id + ((j)localObject1).amf;
            synchronized (this.oNZ)
            {
              this.wtQ.add(localObject4);
              w.i("ChatCustomFooter", "addToMenuClickCmdList %s %d", new Object[] { localObject4, Integer.valueOf(this.wtQ.size()) });
              com.tencent.mm.plugin.report.service.g.ork.i(10809, new Object[] { this.iAx, Integer.valueOf(((j)localObject1).id), ((j)localObject1).amf, j.gxc, "" });
              this.wtT = ((j)localObject1);
              switch (((j)localObject1).gxf)
              {
              case 100: 
                ??? = new Intent();
                ???.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
                ???.putExtra("BaseScanUI_qrcode_right_btn_direct_album", true);
                ???.putExtra("key_is_finish_on_scanned", true);
                ???.putExtra("key_is_hide_right_btn", true);
                if ((com.tencent.mm.p.a.aQ(getContext())) || (com.tencent.mm.p.a.aP(getContext()))) {
                  continue;
                }
                com.tencent.mm.bj.d.b(getContext(), "scanner", ".ui.BaseScanUI", ???);
                GMTrace.o(2138759495680L, 15935);
              }
            }
            ??? = new Intent();
            ???.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
            ???.putExtra("BaseScanUI_qrcode_right_btn_direct_album", true);
            ???.putExtra("key_is_finish_on_scanned", false);
            ???.putExtra("key_is_hide_right_btn", true);
            if ((!com.tencent.mm.p.a.aQ(getContext())) && (!com.tencent.mm.p.a.aP(getContext())))
            {
              com.tencent.mm.bj.d.b(getContext(), "scanner", ".ui.BaseScanUI", ???);
              GMTrace.o(2138759495680L, 15935);
              continue;
              cbW();
              GMTrace.o(2138759495680L, 15935);
              continue;
              at.AR();
              if (!com.tencent.mm.y.c.isSDCardAvailable())
              {
                com.tencent.mm.ui.base.u.fo(getContext());
                GMTrace.o(2138759495680L, 15935);
              }
              else
              {
                ??? = getContext().getString(R.l.dff);
                localObject3 = getContext().getString(R.l.dfe);
                localObject4 = getContext();
                localObject5 = new h.c()
                {
                  public final void hQ(int paramAnonymousInt)
                  {
                    GMTrace.i(2219961221120L, 16540);
                    switch (paramAnonymousInt)
                    {
                    }
                    for (;;)
                    {
                      GMTrace.o(2219961221120L, 16540);
                      return;
                      ChatFooterCustom.a(ChatFooterCustom.this);
                      GMTrace.o(2219961221120L, 16540);
                      return;
                      ChatFooterCustom.b(ChatFooterCustom.this);
                    }
                  }
                };
                com.tencent.mm.ui.base.h.a((Context)localObject4, null, new String[] { ???, localObject3 }, null, (h.c)localObject5);
                GMTrace.o(2138759495680L, 15935);
                continue;
                cbV();
                GMTrace.o(2138759495680L, 15935);
              }
            }
          }
        }
      }
    }
    Object localObject3 = new Intent();
    ((Intent)localObject3).putExtra("map_view_type", 0);
    ??? = new StringBuilder("getSender ");
    if (this.wtN == null) {}
    for (boolean bool = true;; bool = false)
    {
      localObject4 = ???.append(bool).append(" ");
      if (this.wtN == null)
      {
        ??? = com.tencent.mm.y.q.zE();
        label1427:
        w.i("ChatCustomFooter", ???);
        if (this.wtN != null) {
          break label1539;
        }
        ??? = com.tencent.mm.y.q.zE();
        label1452:
        ((Intent)localObject3).putExtra("map_sender_name", ???);
        if (this.eMY != null) {
          break label1550;
        }
      }
      label1539:
      label1550:
      for (??? = null;; ??? = this.eMY.field_username)
      {
        ((Intent)localObject3).putExtra("map_talker_name", ???);
        ((Intent)localObject3).putExtra("view_type_key", 1);
        ((Intent)localObject3).putExtra("key_get_location_type", 1);
        com.tencent.mm.bj.d.b(getContext(), "location", ".ui.RedirectUI", (Intent)localObject3);
        GMTrace.o(2138759495680L, 15935);
        break;
        ??? = this.wtN.name;
        break label1427;
        ??? = this.wtN.name;
        break label1452;
      }
      ??? = new du();
      ???.eFy.op = 1;
      ???.eFy.userName = this.eMY.field_username;
      ???.eFy.context = getContext();
      com.tencent.mm.sdk.b.a.vgX.m(???);
      GMTrace.o(2138759495680L, 15935);
      break;
      ??? = new du();
      ???.eFy.op = 2;
      ???.eFy.userName = this.eMY.field_username;
      ???.eFy.context = getContext();
      com.tencent.mm.sdk.b.a.vgX.m(???);
      break label100;
      break label100;
      break label100;
    }
  }
  
  private final class a
    extends com.tencent.mm.sdk.b.c<lt>
  {
    private a()
    {
      GMTrace.i(2208015843328L, 16451);
      this.vhf = lt.class.getName().hashCode();
      GMTrace.o(2208015843328L, 16451);
    }
  }
  
  private final class b
    extends com.tencent.mm.sdk.b.c<lu>
  {
    private b()
    {
      GMTrace.i(2282775117824L, 17008);
      this.vhf = lu.class.getName().hashCode();
      GMTrace.o(2282775117824L, 17008);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ChatFooterCustom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */