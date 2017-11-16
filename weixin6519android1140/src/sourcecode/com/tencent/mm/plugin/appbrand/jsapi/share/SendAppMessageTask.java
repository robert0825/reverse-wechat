package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.g.a.ol;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.buj;
import com.tencent.mm.protocal.c.buk;
import com.tencent.mm.protocal.c.but;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.c;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.s;
import com.tencent.mm.y.u.b;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class SendAppMessageTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<SendAppMessageTask> CREATOR;
  String appId;
  String description;
  String eAv;
  String eCQ;
  int eII;
  String hRZ;
  String hUt;
  Runnable hYr;
  String iconUrl;
  String ikS;
  String ikT;
  String ikU;
  int ikV;
  String ikW;
  String ikX;
  String ikY;
  boolean ikZ;
  String ila;
  ArrayList<ShareInfo> ilb;
  String path;
  int scene;
  String title;
  String toUser;
  int type;
  String url;
  String userName;
  int version;
  boolean withShareTicket;
  
  static
  {
    GMTrace.i(18236565356544L, 135873);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18236565356544L, 135873);
  }
  
  public SendAppMessageTask()
  {
    GMTrace.i(18235491614720L, 135865);
    this.scene = 1000;
    GMTrace.o(18235491614720L, 135865);
  }
  
  protected SendAppMessageTask(Parcel paramParcel)
  {
    GMTrace.i(18236431138816L, 135872);
    this.scene = 1000;
    f(paramParcel);
    GMTrace.o(18236431138816L, 135872);
  }
  
  public final void RY()
  {
    GMTrace.i(18235625832448L, 135866);
    w.i("MicroMsg.SendAppMessageTask", "username = %s, thumbIconUrl = %s", new Object[] { this.userName, this.ikT });
    final Object localObject2 = new byte[0];
    final Object localObject1 = null;
    final Object localObject3;
    if ((!bg.nm(this.ikT)) && ((this.ikT.startsWith("http://")) || (this.ikT.startsWith("https://"))))
    {
      localObject1 = com.tencent.mm.modelappbrand.a.b.CT().hx(this.ikT);
      if ((localObject1 == null) || (((Bitmap)localObject1).isRecycled())) {
        break label785;
      }
      w.i("MicroMsg.SendAppMessageTask", "thumb image is not null ");
      localObject2 = Bitmap.createBitmap(((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight(), Bitmap.Config.ARGB_8888);
      localObject3 = new Canvas((Bitmap)localObject2);
      ((Canvas)localObject3).drawColor(-1);
      ((Canvas)localObject3).drawBitmap((Bitmap)localObject1, 0.0F, 0.0F, null);
      localObject1 = new ByteArrayOutputStream();
      ((Bitmap)localObject2).compress(Bitmap.CompressFormat.JPEG, 100, (OutputStream)localObject1);
      localObject1 = ((ByteArrayOutputStream)localObject1).toByteArray();
      ((Bitmap)localObject2).recycle();
    }
    for (;;)
    {
      w.i("MicroMsg.SendAppMessageTask", "doSendMessage, appId : %s, title = %s, description = %s ,username = %s ,path = %s, thumbIconUrl = %s", new Object[] { this.appId, this.title, this.description, this.userName, this.path, this.ikT });
      localObject2 = com.tencent.mm.y.u.gy("wxapp_" + this.appId + this.path);
      com.tencent.mm.y.u.Av().p((String)localObject2, true).o("prePublishId", "wxapp_" + this.appId + this.path);
      localObject2 = new f.a();
      ((f.a)localObject2).title = this.title;
      ((f.a)localObject2).description = this.description;
      ((f.a)localObject2).type = 33;
      ((f.a)localObject2).gkR = this.userName;
      ((f.a)localObject2).gkQ = this.path;
      ((f.a)localObject2).gkS = this.appId;
      ((f.a)localObject2).gkY = this.eII;
      ((f.a)localObject2).gkZ = this.version;
      ((f.a)localObject2).gkU = this.hRZ;
      ((f.a)localObject2).gkT = this.type;
      ((f.a)localObject2).url = this.url;
      ((f.a)localObject2).gla = this.iconUrl;
      ((f.a)localObject2).eTu = ("wxapp_" + this.appId + this.path);
      ((f.a)localObject2).eTo = this.userName;
      ((f.a)localObject2).eTp = this.eCQ;
      localObject3 = new com.tencent.mm.x.a();
      ((com.tencent.mm.x.a)localObject3).gin = this.ikZ;
      ((com.tencent.mm.x.a)localObject3).gio = this.hUt;
      ((f.a)localObject2).a((c)localObject3);
      localObject3 = new StringBuilder("1_");
      ((StringBuilder)localObject3).append(this.appId);
      ((StringBuilder)localObject3).append("_");
      h.xw();
      ((StringBuilder)localObject3).append(o.getString(com.tencent.mm.kernel.a.ww()));
      ((StringBuilder)localObject3).append("_");
      ((StringBuilder)localObject3).append(bg.Pu());
      ((StringBuilder)localObject3).append("_");
      ((StringBuilder)localObject3).append(this.ikV);
      ((f.a)localObject2).gkW = ((StringBuilder)localObject3).toString();
      if (!this.withShareTicket) {
        break label799;
      }
      final int i = this.scene;
      localObject4 = new b.a();
      ((b.a)localObject4).gtE = 1118;
      ((b.a)localObject4).uri = "/cgi-bin/mmbiz-bin/wxaapp/getshareinfo";
      buj localbuj = new buj();
      localbuj.eSd = this.appId;
      final LinkedList localLinkedList = new LinkedList(bg.g(this.toUser.split(",")));
      localbuj.vcL = localLinkedList;
      ((b.a)localObject4).gtF = localbuj;
      ((b.a)localObject4).gtG = new buk();
      com.tencent.mm.ad.u.a(((b.a)localObject4).DA(), new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(18235088961536L, 135862);
          w.i("MicroMsg.SendAppMessageTask", "callback, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          paramAnonymousString = (buk)paramAnonymousb.gtD.gtK;
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && (paramAnonymousString != null) && (paramAnonymousString.vcM != null))
          {
            paramAnonymousb = paramAnonymousString.vcM;
            SendAppMessageTask.this.ilb = new ArrayList();
            paramAnonymousInt1 = 0;
            if (paramAnonymousInt1 < localLinkedList.size())
            {
              if (paramAnonymousInt1 < paramAnonymousb.size()) {}
              for (paramAnonymousString = (but)paramAnonymousb.get(paramAnonymousInt1);; paramAnonymousString = new but())
              {
                localObject2.gkX = paramAnonymousString.vdk;
                SendAppMessageTask.this.ilb.add(new ShareInfo(paramAnonymousString.vdk, paramAnonymousString.vdj));
                SendAppMessageTask.this.a(localObject2, localObject1, (String)localLinkedList.get(paramAnonymousInt1), localObject3, i);
                paramAnonymousInt1 += 1;
                break;
              }
            }
          }
          else
          {
            if (localObject2.gkT == 3) {
              localObject2.gkT = 2;
            }
            paramAnonymousString = localLinkedList.iterator();
            while (paramAnonymousString.hasNext())
            {
              paramAnonymousb = (String)paramAnonymousString.next();
              SendAppMessageTask.this.a(localObject2, localObject1, paramAnonymousb, localObject3, i);
            }
          }
          SendAppMessageTask.this.VL();
          GMTrace.o(18235088961536L, 135862);
          return 0;
        }
      });
      GMTrace.o(18235625832448L, 135866);
      return;
      if (bg.nm(this.ikU)) {
        break;
      }
      localObject1 = d.RD(this.ikU);
      boolean bool = com.tencent.mm.loader.stub.b.deleteFile(this.ikU);
      w.v("MicroMsg.SendAppMessageTask", "decode thumb icon bitmap by path(%s), and deleted(%s) file.", new Object[] { this.ikU, Boolean.valueOf(bool) });
      break;
      label785:
      w.e("MicroMsg.SendAppMessageTask", "thumb image is null");
      localObject1 = localObject2;
    }
    label799:
    Object localObject4 = new LinkedList(bg.g(this.toUser.split(","))).iterator();
    while (((Iterator)localObject4).hasNext()) {
      a((f.a)localObject2, (byte[])localObject1, (String)((Iterator)localObject4).next(), (StringBuilder)localObject3, this.scene);
    }
    GMTrace.o(18235625832448L, 135866);
  }
  
  public final void VK()
  {
    GMTrace.i(18235760050176L, 135867);
    if (this.hYr != null) {
      this.hYr.run();
    }
    GMTrace.o(18235760050176L, 135867);
  }
  
  public final void a(f.a parama, byte[] paramArrayOfByte, String paramString, StringBuilder paramStringBuilder, int paramInt)
  {
    GMTrace.i(18235894267904L, 135868);
    ((com.tencent.mm.plugin.appbrand.compat.a.a)h.h(com.tencent.mm.plugin.appbrand.compat.a.a.class)).a(parama, this.appId, this.title, paramString, paramArrayOfByte);
    if (!bg.nm(this.ikS))
    {
      parama = new ol();
      parama.eTx.eTy = paramString;
      parama.eTx.content = this.ikS;
      parama.eTx.type = s.go(paramString);
      parama.eTx.flags = 0;
      com.tencent.mm.sdk.b.a.vgX.m(parama);
    }
    int i = 1;
    if (paramString.toLowerCase().endsWith("@chatroom"))
    {
      parama = ((com.tencent.mm.plugin.chatroom.b.b)h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gG(paramString);
      if (parama == null) {
        break label228;
      }
    }
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    String str8;
    String str9;
    String str1;
    label228:
    for (i = parama.size();; i = 0)
    {
      str2 = this.appId;
      str3 = this.eAv;
      str4 = this.ikW;
      str5 = this.title;
      str6 = this.path;
      str7 = this.ikX;
      str8 = this.ikY;
      str9 = paramStringBuilder.toString();
      str1 = this.ila;
      if (!bg.nm(str2)) {
        break;
      }
      w.e("MicroMsg.SendAppMessageTask", "appId is Null!");
      GMTrace.o(18235894267904L, 135868);
      return;
    }
    parama = "";
    try
    {
      paramArrayOfByte = p.encode(bg.nl(str6), "UTF-8");
      parama = paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      for (;;)
      {
        w.e("MicroMsg.SendAppMessageTask", "encode share page path error!");
      }
    }
    paramArrayOfByte = "";
    try
    {
      paramStringBuilder = p.encode(bg.nl(str7), "UTF-8");
      paramArrayOfByte = paramStringBuilder;
    }
    catch (UnsupportedEncodingException paramStringBuilder)
    {
      for (;;)
      {
        w.e("MicroMsg.SendAppMessageTask", "encode current page path error!");
      }
    }
    paramStringBuilder = "";
    try
    {
      str1 = p.encode(bg.nl(str1), "UTF-8");
      paramStringBuilder = str1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        w.e("MicroMsg.SendAppMessageTask", "encode current html url error!");
      }
    }
    w.d("MicroMsg.SendAppMessageTask", "stev report(%s), appId %s, scene %s, sceneNote %s, sessionId %s, currentPath %s, currentTitle %s,shareTitle %s, sharePath %s, shareActionId %s, destinationUserCount %s, destinationUserName %s", new Object[] { Integer.valueOf(14077), str2, Integer.valueOf(paramInt), str3, str4, str7, str8, str5, str6, str9, Integer.valueOf(i), paramString });
    g.ork.i(14077, new Object[] { str2, Integer.valueOf(paramInt), str3, str4, paramArrayOfByte, str8, str5, parama, str9, "", Integer.valueOf(i), paramString, paramStringBuilder });
    GMTrace.o(18235894267904L, 135868);
  }
  
  public int describeContents()
  {
    GMTrace.i(18236162703360L, 135870);
    GMTrace.o(18236162703360L, 135870);
    return 0;
  }
  
  public final void f(Parcel paramParcel)
  {
    boolean bool2 = true;
    GMTrace.i(18236028485632L, 135869);
    this.appId = paramParcel.readString();
    this.userName = paramParcel.readString();
    this.title = paramParcel.readString();
    this.description = paramParcel.readString();
    this.ikS = paramParcel.readString();
    this.toUser = paramParcel.readString();
    this.url = paramParcel.readString();
    this.path = paramParcel.readString();
    this.type = paramParcel.readInt();
    this.ikT = paramParcel.readString();
    this.iconUrl = paramParcel.readString();
    this.ikU = paramParcel.readString();
    this.eII = paramParcel.readInt();
    this.hRZ = paramParcel.readString();
    this.version = paramParcel.readInt();
    this.eCQ = paramParcel.readString();
    this.ikV = paramParcel.readInt();
    this.scene = paramParcel.readInt();
    this.eAv = paramParcel.readString();
    this.ikW = paramParcel.readString();
    this.ikX = paramParcel.readString();
    this.ikY = paramParcel.readString();
    if (paramParcel.readByte() == 1)
    {
      bool1 = true;
      this.withShareTicket = bool1;
      if (paramParcel.readInt() != 1) {
        break label261;
      }
    }
    label261:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.ikZ = bool1;
      this.hUt = paramParcel.readString();
      this.ila = paramParcel.readString();
      this.ilb = paramParcel.readArrayList(SendAppMessageTask.class.getClassLoader());
      GMTrace.o(18236028485632L, 135869);
      return;
      bool1 = false;
      break;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    GMTrace.i(18236296921088L, 135871);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.userName);
    paramParcel.writeString(this.title);
    paramParcel.writeString(this.description);
    paramParcel.writeString(this.ikS);
    paramParcel.writeString(this.toUser);
    paramParcel.writeString(this.url);
    paramParcel.writeString(this.path);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.ikT);
    paramParcel.writeString(this.iconUrl);
    paramParcel.writeString(this.ikU);
    paramParcel.writeInt(this.eII);
    paramParcel.writeString(this.hRZ);
    paramParcel.writeInt(this.version);
    paramParcel.writeString(this.eCQ);
    paramParcel.writeInt(this.ikV);
    paramParcel.writeInt(this.scene);
    paramParcel.writeString(this.eAv);
    paramParcel.writeString(this.ikW);
    paramParcel.writeString(this.ikX);
    paramParcel.writeString(this.ikY);
    if (this.withShareTicket)
    {
      paramInt = 1;
      paramParcel.writeByte((byte)paramInt);
      if (!this.ikZ) {
        break label261;
      }
    }
    label261:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.hUt);
      paramParcel.writeString(this.ila);
      paramParcel.writeList(this.ilb);
      GMTrace.o(18236296921088L, 135871);
      return;
      paramInt = 0;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\share\SendAppMessageTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */