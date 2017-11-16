package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcdntran.f;
import com.tencent.mm.modelcdntran.j;
import com.tencent.mm.modelvideo.b.a;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.d.d.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class AppBrandOnlineVideoProxy
  implements com.tencent.mm.modelvideo.b
{
  private OnlineVideoProxy ilp;
  private b.a ilq;
  
  public AppBrandOnlineVideoProxy()
  {
    GMTrace.i(17339990933504L, 129193);
    GMTrace.o(17339990933504L, 129193);
  }
  
  public final void a(b.a parama)
  {
    GMTrace.i(17340662022144L, 129198);
    this.ilq = parama;
    if (this.ilp != null) {
      this.ilp.ilD = parama;
    }
    GMTrace.o(17340662022144L, 129198);
  }
  
  public final boolean ba(int paramInt1, int paramInt2)
  {
    GMTrace.i(17340527804416L, 129197);
    if (this.ilp == null)
    {
      GMTrace.o(17340527804416L, 129197);
      return false;
    }
    OnlineVideoProxy localOnlineVideoProxy = this.ilp;
    localOnlineVideoProxy.offset = paramInt1;
    localOnlineVideoProxy.length = paramInt2;
    localOnlineVideoProxy.ilu = 3;
    AppBrandMainProcessService.b(localOnlineVideoProxy);
    boolean bool = localOnlineVideoProxy.ilA;
    GMTrace.o(17340527804416L, 129197);
    return bool;
  }
  
  public final void g(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(17340393586688L, 129196);
    w.i("MicroMsg.AppBrandOnlineVideoProxy", "%s requestVideoData [%s, %d %d]", new Object[] { Integer.valueOf(hashCode()), paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.ilp != null)
    {
      paramString = this.ilp;
      paramString.offset = paramInt1;
      paramString.length = paramInt2;
      paramString.ilu = 2;
      AppBrandMainProcessService.a(paramString);
    }
    GMTrace.o(17340393586688L, 129196);
  }
  
  public final void lY(String paramString)
  {
    GMTrace.i(17340259368960L, 129195);
    w.i("MicroMsg.AppBrandOnlineVideoProxy", "%s stop http stream[%s]", new Object[] { Integer.valueOf(hashCode()), paramString });
    if (this.ilp != null)
    {
      this.ilp.ilD = null;
      paramString = this.ilp;
      paramString.ilu = 4;
      AppBrandMainProcessService.a(paramString);
      this.ilp.VN();
    }
    this.ilp = null;
    GMTrace.o(17340259368960L, 129195);
  }
  
  public final void n(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(17340125151232L, 129194);
    w.i("MicroMsg.AppBrandOnlineVideoProxy", "%s start http stream[%s, %s, %s]", new Object[] { Integer.valueOf(hashCode()), paramString1, paramString2, paramString3 });
    if (this.ilp == null)
    {
      this.ilp = new OnlineVideoProxy();
      this.ilp.ilD = this.ilq;
      this.ilp.VM();
    }
    OnlineVideoProxy localOnlineVideoProxy = this.ilp;
    w.i("MicroMsg.AppBrandOnlineVideoProxy", "%s OnlineVideoProxy start http stream[%s %s %s] ", new Object[] { Integer.valueOf(localOnlineVideoProxy.hashCode()), paramString1, paramString2, paramString3 });
    localOnlineVideoProxy.hah = paramString1;
    localOnlineVideoProxy.path = paramString2;
    localOnlineVideoProxy.url = paramString3;
    localOnlineVideoProxy.ilu = 1;
    AppBrandMainProcessService.a(localOnlineVideoProxy);
    GMTrace.o(17340125151232L, 129194);
  }
  
  private static class OnlineVideoProxy
    extends MainProcessTask
  {
    public static final Parcelable.Creator<OnlineVideoProxy> CREATOR;
    final int START;
    final int STOP;
    String hah;
    boolean ilA;
    int ilB;
    int ilC;
    b.a ilD;
    d.c ilE;
    final int ilr;
    final int ils;
    final int ilt;
    int ilu;
    final int ilv;
    final int ilw;
    final int ilx;
    final int ily;
    int ilz;
    int length;
    int offset;
    String path;
    String url;
    
    static
    {
      GMTrace.i(17374753325056L, 129452);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17374753325056L, 129452);
    }
    
    public OnlineVideoProxy()
    {
      GMTrace.i(17373411147776L, 129442);
      this.ilr = 0;
      this.START = 1;
      this.ils = 2;
      this.ilt = 3;
      this.STOP = 4;
      this.ilv = 10;
      this.ilw = 11;
      this.ilx = 12;
      this.ily = 13;
      this.ilA = false;
      this.ilE = new d.c()
      {
        public final void A(String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(17348446650368L, 129256);
          w.i("MicroMsg.AppBrandOnlineVideoProxy", "on finish [%s %d]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt) });
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilB = paramAnonymousInt;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilz = 13;
          e.So().oL(AppBrandOnlineVideoProxy.OnlineVideoProxy.this.hah);
          AppBrandOnlineVideoProxy.OnlineVideoProxy.d(AppBrandOnlineVideoProxy.OnlineVideoProxy.this);
          GMTrace.o(17348446650368L, 129256);
        }
        
        public final void bl(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(17348043997184L, 129253);
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilB = paramAnonymousInt1;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilC = paramAnonymousInt2;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilz = 10;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.a(AppBrandOnlineVideoProxy.OnlineVideoProxy.this);
          GMTrace.o(17348043997184L, 129253);
        }
        
        public final void bm(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(17348178214912L, 129254);
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilB = paramAnonymousInt1;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilC = paramAnonymousInt2;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilz = 11;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.b(AppBrandOnlineVideoProxy.OnlineVideoProxy.this);
          GMTrace.o(17348178214912L, 129254);
        }
        
        public final void bn(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(17348312432640L, 129255);
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilB = paramAnonymousInt1;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilC = paramAnonymousInt2;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilz = 12;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.c(AppBrandOnlineVideoProxy.OnlineVideoProxy.this);
          GMTrace.o(17348312432640L, 129255);
        }
      };
      GMTrace.o(17373411147776L, 129442);
    }
    
    public OnlineVideoProxy(Parcel paramParcel)
    {
      GMTrace.i(17373545365504L, 129443);
      this.ilr = 0;
      this.START = 1;
      this.ils = 2;
      this.ilt = 3;
      this.STOP = 4;
      this.ilv = 10;
      this.ilw = 11;
      this.ilx = 12;
      this.ily = 13;
      this.ilA = false;
      this.ilE = new d.c()
      {
        public final void A(String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(17348446650368L, 129256);
          w.i("MicroMsg.AppBrandOnlineVideoProxy", "on finish [%s %d]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt) });
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilB = paramAnonymousInt;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilz = 13;
          e.So().oL(AppBrandOnlineVideoProxy.OnlineVideoProxy.this.hah);
          AppBrandOnlineVideoProxy.OnlineVideoProxy.d(AppBrandOnlineVideoProxy.OnlineVideoProxy.this);
          GMTrace.o(17348446650368L, 129256);
        }
        
        public final void bl(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(17348043997184L, 129253);
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilB = paramAnonymousInt1;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilC = paramAnonymousInt2;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilz = 10;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.a(AppBrandOnlineVideoProxy.OnlineVideoProxy.this);
          GMTrace.o(17348043997184L, 129253);
        }
        
        public final void bm(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(17348178214912L, 129254);
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilB = paramAnonymousInt1;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilC = paramAnonymousInt2;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilz = 11;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.b(AppBrandOnlineVideoProxy.OnlineVideoProxy.this);
          GMTrace.o(17348178214912L, 129254);
        }
        
        public final void bn(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(17348312432640L, 129255);
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilB = paramAnonymousInt1;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilC = paramAnonymousInt2;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.ilz = 12;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.c(AppBrandOnlineVideoProxy.OnlineVideoProxy.this);
          GMTrace.o(17348312432640L, 129255);
        }
      };
      f(paramParcel);
      GMTrace.o(17373545365504L, 129443);
    }
    
    public final void RY()
    {
      GMTrace.i(17373813800960L, 129445);
      w.d("MicroMsg.AppBrandOnlineVideoProxy", "runInMainProcess cdnMediaId[%s] state[%d]", new Object[] { this.hah, Integer.valueOf(this.ilu) });
      switch (this.ilu)
      {
      default: 
        w.w("MicroMsg.AppBrandOnlineVideoProxy", "unknow state ");
      case 1: 
      case 4: 
      case 2: 
        for (;;)
        {
          this.ilu = 0;
          w.i("MicroMsg.AppBrandOnlineVideoProxy", "runInMainProcess reset mainState[%d] ", new Object[] { Integer.valueOf(this.ilu) });
          VL();
          GMTrace.o(17373813800960L, 129445);
          return;
          localObject1 = e.So();
          String str1 = this.hah;
          Object localObject2 = this.ilE;
          ((com.tencent.mm.plugin.appbrand.d.b)localObject1).hOw.put(str1, localObject2);
          localObject1 = e.So();
          str1 = this.hah;
          localObject2 = this.url;
          String str2 = this.path;
          w.i("MicroMsg.AppbrandCdnService", "add online video task [%s] url[%s] path[%s]", new Object[] { str1, localObject2, str2 });
          j localj = new j();
          localj.field_mediaId = str1;
          localj.field_fullpath = str2;
          localj.url = ((String)localObject2);
          localj.gAY = ((com.tencent.mm.plugin.appbrand.d.b)localObject1).hOx;
          localj.gAS = 1;
          localj.gAN = 3;
          o.Ni().a(localj, false);
          continue;
          e.So().oL(this.hah);
          e.So();
          localObject1 = this.hah;
          w.i("MicroMsg.AppbrandCdnService", "cancel online video task [%s]", new Object[] { localObject1 });
          o.Ni().b((String)localObject1, null);
          continue;
          e.So();
          localObject1 = this.hah;
          i = this.offset;
          j = this.length;
          w.i("MicroMsg.AppbrandCdnService", "request online video task [%s]", new Object[] { localObject1 });
          o.Ni();
          f.e((String)localObject1, i, j);
        }
      }
      e.So();
      Object localObject1 = this.hah;
      int i = this.offset;
      int j = this.length;
      w.i("MicroMsg.AppbrandCdnService", "check online video task [%s]", new Object[] { localObject1 });
      this.ilA = o.Ni().isVideoDataAvailable((String)localObject1, i, j);
      VL();
      GMTrace.o(17373813800960L, 129445);
    }
    
    public final void VK()
    {
      GMTrace.i(17373679583232L, 129444);
      w.d("MicroMsg.AppBrandOnlineVideoProxy", "runInClientProcess cdnMediaId[%s] clientState[%d] [%d %d]", new Object[] { this.hah, Integer.valueOf(this.ilz), Integer.valueOf(this.ilB), Integer.valueOf(this.ilC) });
      if (this.ilD == null)
      {
        GMTrace.o(17373679583232L, 129444);
        return;
      }
      switch (this.ilz)
      {
      }
      for (;;)
      {
        this.ilz = 0;
        w.i("MicroMsg.AppBrandOnlineVideoProxy", "runInClientProcess reset clientState[%d] ", new Object[] { Integer.valueOf(this.ilz) });
        GMTrace.o(17373679583232L, 129444);
        return;
        this.ilD.hl(this.ilB);
        continue;
        this.ilD.onDataAvailable(this.hah, this.ilB, this.ilC);
        continue;
        this.ilD.f(this.hah, this.ilB, this.ilC);
        continue;
        this.ilD.A(this.hah, this.ilB);
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool = true;
      GMTrace.i(17373948018688L, 129446);
      this.hah = paramParcel.readString();
      this.ilu = paramParcel.readInt();
      this.path = paramParcel.readString();
      this.url = paramParcel.readString();
      this.offset = paramParcel.readInt();
      this.length = paramParcel.readInt();
      if (paramParcel.readInt() == 1) {}
      for (;;)
      {
        this.ilA = bool;
        this.ilz = paramParcel.readInt();
        this.ilB = paramParcel.readInt();
        this.ilC = paramParcel.readInt();
        GMTrace.o(17373948018688L, 129446);
        return;
        bool = false;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17374082236416L, 129447);
      paramParcel.writeString(this.hah);
      paramParcel.writeInt(this.ilu);
      paramParcel.writeString(this.path);
      paramParcel.writeString(this.url);
      paramParcel.writeInt(this.offset);
      paramParcel.writeInt(this.length);
      if (this.ilA) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        paramParcel.writeInt(this.ilz);
        paramParcel.writeInt(this.ilB);
        paramParcel.writeInt(this.ilC);
        GMTrace.o(17374082236416L, 129447);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\video\AppBrandOnlineVideoProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */