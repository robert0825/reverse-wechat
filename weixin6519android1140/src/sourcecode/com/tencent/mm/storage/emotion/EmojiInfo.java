package com.tencent.mm.storage.emotion;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.api.i;
import com.tencent.mm.g.b.ao;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.emoji.b.c;
import com.tencent.mm.plugin.gif.g;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Map;

public class EmojiInfo
  extends ao
  implements Parcelable, i
{
  public static final Parcelable.Creator<EmojiInfo> CREATOR;
  public static int TYPE_TEXT;
  protected static c.a fTp;
  public static final String kkd;
  public static int vCA;
  public static int vCB;
  public static int vCC;
  public static int vCD;
  public static int vCE;
  public static int vCF;
  public static int vCG;
  public static int vCH;
  public static int vCI;
  public static int vCJ;
  public static int vCk;
  public static int vCo;
  public static String vCp;
  public static int vCq;
  public static int vCr;
  public static int vCs;
  public static int vCt;
  public static int vCu;
  public static int vCv;
  public static int vCw;
  public static int vCx;
  public static int vCy;
  public static int vCz;
  public final String nSe;
  
  static
  {
    GMTrace.i(1555046596608L, 11586);
    vCp = ".gif";
    vCq = 17;
    vCr = 32;
    vCs = 49;
    vCt = 50;
    vCo = 65;
    vCu = 81;
    vCk = -1;
    vCv = 1;
    vCw = 2;
    vCx = 3;
    TYPE_TEXT = 4;
    vCy = 10;
    vCz = 11;
    vCA = 0;
    vCB = 1;
    vCC = 3;
    vCD = 4;
    vCE = 8;
    vCF = 0;
    vCG = 1;
    vCH = 0;
    vCI = 1;
    vCJ = 1;
    c.a locala = new c.a();
    locala.gZM = new Field[31];
    locala.columns = new String[32];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "md5";
    locala.vmt.put("md5", "TEXT PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(" md5 TEXT PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(", ");
    locala.vms = "md5";
    locala.columns[1] = "svrid";
    locala.vmt.put("svrid", "TEXT");
    localStringBuilder.append(" svrid TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "catalog";
    locala.vmt.put("catalog", "INTEGER");
    localStringBuilder.append(" catalog INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "type";
    locala.vmt.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "size";
    locala.vmt.put("size", "INTEGER");
    localStringBuilder.append(" size INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "start";
    locala.vmt.put("start", "INTEGER");
    localStringBuilder.append(" start INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "state";
    locala.vmt.put("state", "INTEGER");
    localStringBuilder.append(" state INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "name";
    locala.vmt.put("name", "TEXT");
    localStringBuilder.append(" name TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "content";
    locala.vmt.put("content", "TEXT");
    localStringBuilder.append(" content TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "reserved1";
    locala.vmt.put("reserved1", "TEXT");
    localStringBuilder.append(" reserved1 TEXT");
    localStringBuilder.append(", ");
    locala.columns[10] = "reserved2";
    locala.vmt.put("reserved2", "TEXT");
    localStringBuilder.append(" reserved2 TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "reserved3";
    locala.vmt.put("reserved3", "INTEGER");
    localStringBuilder.append(" reserved3 INTEGER");
    localStringBuilder.append(", ");
    locala.columns[12] = "reserved4";
    locala.vmt.put("reserved4", "INTEGER");
    localStringBuilder.append(" reserved4 INTEGER");
    localStringBuilder.append(", ");
    locala.columns[13] = "app_id";
    locala.vmt.put("app_id", "TEXT");
    localStringBuilder.append(" app_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "groupId";
    locala.vmt.put("groupId", "TEXT default '' ");
    localStringBuilder.append(" groupId TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[15] = "lastUseTime";
    locala.vmt.put("lastUseTime", "LONG");
    localStringBuilder.append(" lastUseTime LONG");
    localStringBuilder.append(", ");
    locala.columns[16] = "framesInfo";
    locala.vmt.put("framesInfo", "TEXT default '' ");
    localStringBuilder.append(" framesInfo TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[17] = "idx";
    locala.vmt.put("idx", "INTEGER default '0' ");
    localStringBuilder.append(" idx INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[18] = "temp";
    locala.vmt.put("temp", "INTEGER default '0' ");
    localStringBuilder.append(" temp INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[19] = "source";
    locala.vmt.put("source", "INTEGER default '0' ");
    localStringBuilder.append(" source INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[20] = "needupload";
    locala.vmt.put("needupload", "INTEGER default '0' ");
    localStringBuilder.append(" needupload INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[21] = "designerID";
    locala.vmt.put("designerID", "TEXT");
    localStringBuilder.append(" designerID TEXT");
    localStringBuilder.append(", ");
    locala.columns[22] = "thumbUrl";
    locala.vmt.put("thumbUrl", "TEXT");
    localStringBuilder.append(" thumbUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[23] = "cdnUrl";
    locala.vmt.put("cdnUrl", "TEXT");
    localStringBuilder.append(" cdnUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[24] = "encrypturl";
    locala.vmt.put("encrypturl", "TEXT");
    localStringBuilder.append(" encrypturl TEXT");
    localStringBuilder.append(", ");
    locala.columns[25] = "aeskey";
    locala.vmt.put("aeskey", "TEXT");
    localStringBuilder.append(" aeskey TEXT");
    localStringBuilder.append(", ");
    locala.columns[26] = "width";
    locala.vmt.put("width", "INTEGER default '0' ");
    localStringBuilder.append(" width INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[27] = "height";
    locala.vmt.put("height", "INTEGER default '0' ");
    localStringBuilder.append(" height INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[28] = "externUrl";
    locala.vmt.put("externUrl", "TEXT");
    localStringBuilder.append(" externUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[29] = "externMd5";
    locala.vmt.put("externMd5", "TEXT");
    localStringBuilder.append(" externMd5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[30] = "activityid";
    locala.vmt.put("activityid", "TEXT");
    localStringBuilder.append(" activityid TEXT");
    locala.columns[31] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    kkd = File.separator;
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(1555046596608L, 11586);
  }
  
  public EmojiInfo()
  {
    GMTrace.i(1551422717952L, 11559);
    StringBuilder localStringBuilder;
    if (((f)h.xv().wZ()).eR(""))
    {
      localStringBuilder = new StringBuilder();
      h.xz();
    }
    for (this.nSe = (h.xy().fYU + "emoji/");; this.nSe = (((c)h.j(c.class)).getProvider().zo() + "emoji/"))
    {
      reset();
      GMTrace.o(1551422717952L, 11559);
      return;
    }
  }
  
  protected EmojiInfo(Parcel paramParcel)
  {
    GMTrace.i(20129169539072L, 149974);
    this.nSe = paramParcel.readString();
    this.field_md5 = paramParcel.readString();
    this.field_svrid = paramParcel.readString();
    this.field_catalog = paramParcel.readInt();
    this.field_type = paramParcel.readInt();
    this.field_size = paramParcel.readInt();
    this.field_start = paramParcel.readInt();
    this.field_state = paramParcel.readInt();
    this.field_name = paramParcel.readString();
    this.field_content = paramParcel.readString();
    this.field_reserved1 = paramParcel.readString();
    this.field_reserved2 = paramParcel.readString();
    this.field_reserved3 = paramParcel.readInt();
    this.field_reserved4 = paramParcel.readInt();
    this.field_app_id = paramParcel.readString();
    this.field_groupId = paramParcel.readString();
    this.field_lastUseTime = paramParcel.readLong();
    this.field_framesInfo = paramParcel.readString();
    this.field_idx = paramParcel.readInt();
    this.field_temp = paramParcel.readInt();
    this.field_source = paramParcel.readInt();
    this.field_needupload = paramParcel.readInt();
    this.field_designerID = paramParcel.readString();
    this.field_thumbUrl = paramParcel.readString();
    this.field_cdnUrl = paramParcel.readString();
    this.field_encrypturl = paramParcel.readString();
    this.field_aeskey = paramParcel.readString();
    this.field_width = paramParcel.readInt();
    this.field_height = paramParcel.readInt();
    this.field_activityid = paramParcel.readString();
    this.vmr = paramParcel.readLong();
    GMTrace.o(20129169539072L, 149974);
  }
  
  public EmojiInfo(String paramString)
  {
    GMTrace.i(1551556935680L, 11560);
    this.nSe = paramString;
    reset();
    GMTrace.o(1551556935680L, 11560);
  }
  
  public static boolean Az(int paramInt)
  {
    GMTrace.i(1553167548416L, 11572);
    if ((paramInt == vCt) || (paramInt == vCs))
    {
      GMTrace.o(1553167548416L, 11572);
      return true;
    }
    GMTrace.o(1553167548416L, 11572);
    return false;
  }
  
  public static InputStream bd(Context paramContext, String paramString)
  {
    GMTrace.i(1552228024320L, 11565);
    if ((paramContext == null) || (bg.nm(paramString)))
    {
      GMTrace.o(1552228024320L, 11565);
      return null;
    }
    try
    {
      paramString = paramString.split("\\.")[0];
      w.d("MicroMsg.emoji.EmojiInfo", "emoji drawable name is %s", new Object[] { paramString });
      int i = paramContext.getResources().getIdentifier(paramString, "drawable", paramContext.getPackageName());
      paramContext = paramContext.getResources().openRawResource(i);
      GMTrace.o(1552228024320L, 11565);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      w.w("MicroMsg.emoji.EmojiInfo", "get emoji file fail, %s", new Object[] { paramContext.getMessage() });
      GMTrace.o(1552228024320L, 11565);
    }
    return null;
  }
  
  public final void AA(int paramInt)
  {
    GMTrace.i(18616804179968L, 138706);
    this.field_catalog = paramInt;
    GMTrace.o(18616804179968L, 138706);
  }
  
  public final void AB(int paramInt)
  {
    GMTrace.i(18617206833152L, 138709);
    this.field_temp = 1;
    GMTrace.o(18617206833152L, 138709);
  }
  
  public final String GS()
  {
    GMTrace.i(1553435983872L, 11574);
    if (this.field_md5 == null)
    {
      GMTrace.o(1553435983872L, 11574);
      return "";
    }
    String str = this.field_md5;
    GMTrace.o(1553435983872L, 11574);
    return str;
  }
  
  public final Bitmap ae(Context paramContext)
  {
    int j = 0;
    int i;
    for (;;)
    {
      try
      {
        GMTrace.i(20128632668160L, 149970);
        if ((this.field_catalog == EmojiGroupInfo.vCm) || (this.field_catalog == vCt) || (this.field_catalog == vCs))
        {
          localObject = getName();
          if (!bg.nm((String)localObject))
          {
            if (((String)localObject).startsWith("jsb"))
            {
              localObject = "jsb";
              i = paramContext.getResources().getIdentifier((String)localObject, "drawable", ab.getPackageName());
              paramContext = com.tencent.mm.sdk.platformtools.d.t(paramContext.getResources().getDrawable(i));
              w.i("MicroMsg.emoji.EmojiInfo", "id:%s width:%s height:%s", new Object[] { Integer.valueOf(this.field_catalog), Integer.valueOf(paramContext.getWidth()), Integer.valueOf(paramContext.getHeight()) });
              GMTrace.o(20128632668160L, 149970);
              return paramContext;
            }
            if (((String)localObject).startsWith("dice"))
            {
              localObject = "dice";
              continue;
            }
            localObject = ((String)localObject).replaceAll(".png", "");
            continue;
          }
          w.i("MicroMsg.emoji.EmojiInfo", "name is null");
          w.i("MicroMsg.emoji.EmojiInfo", "emoji:%s", new Object[] { this });
          paramContext = null;
          GMTrace.o(20128632668160L, 149970);
          continue;
        }
        if (this.field_catalog != EmojiGroupInfo.vCl) {
          break label412;
        }
      }
      finally {}
      localObject = getName();
      if (!bg.nm((String)localObject)) {
        if (bg.nm(rc()))
        {
          localObject = getName();
          label277:
          localObject = ((String)localObject).replaceAll(".png", "");
        }
      }
      for (;;)
      {
        w.i("MicroMsg.emoji.EmojiInfo", "[addEmoji] drawable name:%s", new Object[] { localObject });
        i = paramContext.getResources().getIdentifier((String)localObject, "drawable", ab.getPackageName());
        paramContext = com.tencent.mm.sdk.platformtools.d.t(paramContext.getResources().getDrawable(i));
        w.i("MicroMsg.emoji.EmojiInfo", "id:%s width:%s height:%s", new Object[] { Integer.valueOf(this.field_catalog), Integer.valueOf(paramContext.getWidth()), Integer.valueOf(paramContext.getHeight()) });
        GMTrace.o(20128632668160L, 149970);
        break;
        localObject = rc();
        break label277;
        w.i("MicroMsg.emoji.EmojiInfo", "name is null");
      }
      label412:
      paramContext = bUU() + "_cover";
      boolean bool = com.tencent.mm.a.e.aZ(paramContext);
      w.i("MicroMsg.emoji.EmojiInfo", "[addEmoji] thumbPath:%s isExist:%s", new Object[] { paramContext, Boolean.valueOf(bool) });
      if (bool) {
        break;
      }
      paramContext = bUU();
      bool = com.tencent.mm.a.e.aZ(paramContext);
      if (bool)
      {
        paramContext = ((c)h.j(c.class)).getProvider().a(this);
        if (paramContext == null)
        {
          w.e("MicroMsg.emoji.EmojiInfo", "bytes is null!");
          paramContext = null;
          GMTrace.o(20128632668160L, 149970);
        }
        else
        {
          w.i("MicroMsg.emoji.EmojiInfo", "bytes size:%s", new Object[] { Integer.valueOf(paramContext.length) });
          if (o.bk(paramContext)) {}
          for (paramContext = g.av(paramContext);; paramContext = com.tencent.mm.sdk.platformtools.d.decodeByteArray(paramContext, 480, 480))
          {
            if (paramContext != null) {
              w.i("MicroMsg.emoji.EmojiInfo", "emoji:%s width:%s height:%s", new Object[] { this, Integer.valueOf(paramContext.getWidth()), Integer.valueOf(paramContext.getHeight()) });
            }
            GMTrace.o(20128632668160L, 149970);
            break;
          }
        }
      }
      else
      {
        w.w("MicroMsg.emoji.EmojiInfo", "[addEmoji] Path:%s isExist:%s", new Object[] { paramContext, Boolean.valueOf(bool) });
      }
    }
    Object localObject = new BitmapFactory.Options();
    ((BitmapFactory.Options)localObject).inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramContext, (BitmapFactory.Options)localObject);
    label723:
    int k;
    if ((((BitmapFactory.Options)localObject).outHeight < 480) && (((BitmapFactory.Options)localObject).outWidth < 480))
    {
      paramContext = com.tencent.mm.sdk.platformtools.d.T(paramContext, ((BitmapFactory.Options)localObject).outHeight, ((BitmapFactory.Options)localObject).outWidth);
      k = this.field_catalog;
      if (paramContext != null) {
        break label800;
      }
      i = 0;
      label735:
      if (paramContext != null) {
        break label808;
      }
    }
    for (;;)
    {
      w.i("MicroMsg.emoji.EmojiInfo", "id:%s width:%s height:%s", new Object[] { Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j) });
      GMTrace.o(20128632668160L, 149970);
      break;
      paramContext = com.tencent.mm.sdk.platformtools.d.T(paramContext, 480, 480);
      break label723;
      label800:
      i = paramContext.getWidth();
      break label735;
      label808:
      j = paramContext.getHeight();
    }
  }
  
  public final boolean bJs()
  {
    GMTrace.i(1552630677504L, 11568);
    if ((this.field_catalog == vCt) || (this.field_catalog == vCs))
    {
      GMTrace.o(1552630677504L, 11568);
      return true;
    }
    GMTrace.o(1552630677504L, 11568);
    return false;
  }
  
  public final boolean bK(Object paramObject)
  {
    GMTrace.i(1554778161152L, 11584);
    if ((paramObject != null) && ((paramObject instanceof EmojiInfo)) && (((EmojiInfo)paramObject).GS().equalsIgnoreCase(this.field_md5)))
    {
      GMTrace.o(1554778161152L, 11584);
      return true;
    }
    GMTrace.o(1554778161152L, 11584);
    return false;
  }
  
  public final boolean bUN()
  {
    GMTrace.i(1551959588864L, 11563);
    if ((this.field_catalog == vCq) || (this.field_catalog == vCt) || (this.field_catalog == vCs))
    {
      GMTrace.o(1551959588864L, 11563);
      return true;
    }
    if (!bg.nm(this.field_groupId)) {}
    for (File localFile = new File(this.nSe + this.field_groupId + File.separator + GS()); (localFile.exists()) && (localFile.length() > 0L); localFile = new File(this.nSe + GS()))
    {
      GMTrace.o(1551959588864L, 11563);
      return true;
    }
    GMTrace.o(1551959588864L, 11563);
    return false;
  }
  
  public final void bUO()
  {
    GMTrace.i(1552093806592L, 11564);
    if ((this.field_catalog == vCq) || (this.field_catalog == vCt) || (this.field_catalog == vCs))
    {
      GMTrace.o(1552093806592L, 11564);
      return;
    }
    if (!bg.nm(this.field_groupId)) {}
    for (File localFile = new File(this.nSe + this.field_groupId + File.separator + GS());; localFile = new File(this.nSe + GS()))
    {
      if (localFile.exists()) {
        localFile.delete();
      }
      GMTrace.o(1552093806592L, 11564);
      return;
    }
  }
  
  public final boolean bUP()
  {
    GMTrace.i(1552764895232L, 11569);
    if ((this.field_catalog == vCq) || (this.field_catalog == vCt) || (this.field_catalog == vCs))
    {
      GMTrace.o(1552764895232L, 11569);
      return true;
    }
    GMTrace.o(1552764895232L, 11569);
    return false;
  }
  
  public final boolean bUQ()
  {
    GMTrace.i(1552899112960L, 11570);
    boolean bool = this.field_groupId.equalsIgnoreCase("com.tencent.xin.emoticon.tuzki2");
    GMTrace.o(1552899112960L, 11570);
    return bool;
  }
  
  public final boolean bUR()
  {
    GMTrace.i(1553301766144L, 11573);
    if ((bg.nm(this.field_app_id)) && (!bg.nm(this.field_groupId)) && (!this.field_groupId.equals(String.valueOf(EmojiGroupInfo.vCm))) && (!this.field_groupId.equals(String.valueOf(EmojiGroupInfo.vCl))) && (!this.field_groupId.equals(String.valueOf(EmojiGroupInfo.vCn))) && (!this.field_groupId.equals(String.valueOf(vCo))))
    {
      GMTrace.o(1553301766144L, 11573);
      return true;
    }
    GMTrace.o(1553301766144L, 11573);
    return false;
  }
  
  public final boolean bUS()
  {
    GMTrace.i(1553570201600L, 11575);
    if (GS().length() == 32)
    {
      GMTrace.o(1553570201600L, 11575);
      return true;
    }
    GMTrace.o(1553570201600L, 11575);
    return false;
  }
  
  public final boolean bUT()
  {
    GMTrace.i(1554375507968L, 11581);
    if ((this.field_catalog == vCq) || (this.field_catalog == EmojiGroupInfo.vCm) || (this.field_catalog == vCt) || (this.field_catalog == vCs))
    {
      GMTrace.o(1554375507968L, 11581);
      return true;
    }
    if (bUR())
    {
      String str = bUU();
      localObject = str;
      if (str == null) {
        localObject = this.nSe + this.field_groupId + File.separator + GS();
      }
    }
    for (Object localObject = new File((String)localObject); (((File)localObject).exists()) && (((File)localObject).length() > 0L); localObject = new File(this.nSe + GS()))
    {
      GMTrace.o(1554375507968L, 11581);
      return true;
    }
    GMTrace.o(1554375507968L, 11581);
    return false;
  }
  
  public final String bUU()
  {
    String str = null;
    GMTrace.i(20128766885888L, 149971);
    if ((bg.nm(this.field_groupId)) && (bg.nm(this.field_md5)))
    {
      w.w("MicroMsg.emoji.EmojiInfo", "[cpan] get icon path failed. product id and md5 are null.");
      GMTrace.o(20128766885888L, 149971);
      return null;
    }
    if (!bg.nm(this.field_md5)) {
      if (!bg.nm(this.field_groupId)) {
        break label107;
      }
    }
    label107:
    for (str = this.nSe + this.field_md5;; str = this.nSe + this.field_groupId + kkd + this.field_md5)
    {
      GMTrace.o(20128766885888L, 149971);
      return str;
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(20128901103616L, 149972);
    GMTrace.o(20128901103616L, 149972);
    return 0;
  }
  
  public final Bitmap eT(Context paramContext)
  {
    try
    {
      GMTrace.i(1552362242048L, 11566);
      paramContext = eU(paramContext);
      GMTrace.o(1552362242048L, 11566);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  /* Error */
  public final Bitmap eU(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 7
    //   6: aconst_null
    //   7: astore 5
    //   9: aconst_null
    //   10: astore 8
    //   12: aconst_null
    //   13: astore 6
    //   15: aload_0
    //   16: monitorenter
    //   17: ldc2_w 773
    //   20: sipush 11567
    //   23: invokestatic 53	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   26: aload_1
    //   27: bipush 120
    //   29: invokestatic 780	com/tencent/mm/br/a:fromDPToPix	(Landroid/content/Context;I)I
    //   32: pop
    //   33: aload_0
    //   34: getfield 385	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   37: getstatic 59	com/tencent/mm/storage/emotion/EmojiInfo:vCq	I
    //   40: if_icmpeq +37 -> 77
    //   43: aload_0
    //   44: getfield 385	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   47: getstatic 558	com/tencent/mm/storage/emotion/EmojiGroupInfo:vCm	I
    //   50: if_icmpeq +27 -> 77
    //   53: aload_0
    //   54: getfield 385	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   57: getstatic 65	com/tencent/mm/storage/emotion/EmojiInfo:vCt	I
    //   60: if_icmpeq +17 -> 77
    //   63: aload_0
    //   64: getfield 385	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   67: istore_2
    //   68: getstatic 63	com/tencent/mm/storage/emotion/EmojiInfo:vCs	I
    //   71: istore_3
    //   72: iload_2
    //   73: iload_3
    //   74: if_icmpne +238 -> 312
    //   77: aload_0
    //   78: invokevirtual 561	com/tencent/mm/storage/emotion/EmojiInfo:getName	()Ljava/lang/String;
    //   81: astore 4
    //   83: aload_0
    //   84: getfield 388	com/tencent/mm/storage/emotion/EmojiInfo:field_type	I
    //   87: getstatic 75	com/tencent/mm/storage/emotion/EmojiInfo:vCw	I
    //   90: if_icmpne +19 -> 109
    //   93: aload_0
    //   94: invokevirtual 618	com/tencent/mm/storage/emotion/EmojiInfo:rc	()Ljava/lang/String;
    //   97: invokestatic 489	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   100: ifeq +53 -> 153
    //   103: aload_0
    //   104: invokevirtual 561	com/tencent/mm/storage/emotion/EmojiInfo:getName	()Ljava/lang/String;
    //   107: astore 4
    //   109: aload_1
    //   110: aload 4
    //   112: invokestatic 782	com/tencent/mm/storage/emotion/EmojiInfo:bd	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   115: astore 4
    //   117: aload 4
    //   119: astore_1
    //   120: aload 4
    //   122: invokestatic 786	com/tencent/mm/sdk/platformtools/d:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   125: astore 5
    //   127: aload 4
    //   129: ifnull +1121 -> 1250
    //   132: aload 4
    //   134: invokevirtual 791	java/io/InputStream:close	()V
    //   137: aload 5
    //   139: astore_1
    //   140: ldc2_w 773
    //   143: sipush 11567
    //   146: invokestatic 302	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   149: aload_0
    //   150: monitorexit
    //   151: aload_1
    //   152: areturn
    //   153: aload_0
    //   154: invokevirtual 618	com/tencent/mm/storage/emotion/EmojiInfo:rc	()Ljava/lang/String;
    //   157: astore 4
    //   159: goto -50 -> 109
    //   162: astore_1
    //   163: ldc_w 497
    //   166: ldc_w 793
    //   169: iconst_1
    //   170: anewarray 501	java/lang/Object
    //   173: dup
    //   174: iconst_0
    //   175: aload_1
    //   176: invokestatic 797	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   179: aastore
    //   180: invokestatic 799	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   183: aload 5
    //   185: astore_1
    //   186: goto -46 -> 140
    //   189: astore 5
    //   191: aconst_null
    //   192: astore 4
    //   194: aload 4
    //   196: astore_1
    //   197: ldc_w 497
    //   200: ldc_w 793
    //   203: iconst_1
    //   204: anewarray 501	java/lang/Object
    //   207: dup
    //   208: iconst_0
    //   209: aload 5
    //   211: invokestatic 797	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   214: aastore
    //   215: invokestatic 799	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   218: aload 4
    //   220: ifnull +87 -> 307
    //   223: aload 4
    //   225: invokevirtual 791	java/io/InputStream:close	()V
    //   228: aconst_null
    //   229: astore_1
    //   230: goto -90 -> 140
    //   233: astore_1
    //   234: ldc_w 497
    //   237: ldc_w 793
    //   240: iconst_1
    //   241: anewarray 501	java/lang/Object
    //   244: dup
    //   245: iconst_0
    //   246: aload_1
    //   247: invokestatic 797	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   250: aastore
    //   251: invokestatic 799	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   254: aconst_null
    //   255: astore_1
    //   256: goto -116 -> 140
    //   259: astore_1
    //   260: aload 6
    //   262: astore 4
    //   264: aload 4
    //   266: ifnull +8 -> 274
    //   269: aload 4
    //   271: invokevirtual 791	java/io/InputStream:close	()V
    //   274: aload_1
    //   275: athrow
    //   276: astore_1
    //   277: aload_0
    //   278: monitorexit
    //   279: aload_1
    //   280: athrow
    //   281: astore 4
    //   283: ldc_w 497
    //   286: ldc_w 793
    //   289: iconst_1
    //   290: anewarray 501	java/lang/Object
    //   293: dup
    //   294: iconst_0
    //   295: aload 4
    //   297: invokestatic 797	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   300: aastore
    //   301: invokestatic 799	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   304: goto -30 -> 274
    //   307: aconst_null
    //   308: astore_1
    //   309: goto -169 -> 140
    //   312: aload 8
    //   314: astore 6
    //   316: aload_0
    //   317: invokevirtual 751	com/tencent/mm/storage/emotion/EmojiInfo:bUR	()Z
    //   320: ifeq +156 -> 476
    //   323: aload 8
    //   325: astore 6
    //   327: aload_0
    //   328: invokevirtual 623	com/tencent/mm/storage/emotion/EmojiInfo:bUU	()Ljava/lang/String;
    //   331: astore_1
    //   332: aload_1
    //   333: ifnonnull +914 -> 1247
    //   336: aload 8
    //   338: astore 6
    //   340: new 122	java/lang/StringBuilder
    //   343: dup
    //   344: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   347: aload_0
    //   348: getfield 345	com/tencent/mm/storage/emotion/EmojiInfo:nSe	Ljava/lang/String;
    //   351: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: aload_0
    //   355: getfield 421	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
    //   358: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   361: getstatic 294	java/io/File:separator	Ljava/lang/String;
    //   364: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: aload_0
    //   368: invokevirtual 701	com/tencent/mm/storage/emotion/EmojiInfo:GS	()Ljava/lang/String;
    //   371: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   374: ldc_w 801
    //   377: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   380: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   383: astore_1
    //   384: aload 8
    //   386: astore 6
    //   388: new 291	java/io/File
    //   391: dup
    //   392: aload_1
    //   393: invokespecial 709	java/io/File:<init>	(Ljava/lang/String;)V
    //   396: astore_1
    //   397: aload 8
    //   399: astore 6
    //   401: aload_1
    //   402: invokevirtual 712	java/io/File:exists	()Z
    //   405: ifeq +213 -> 618
    //   408: aload 8
    //   410: astore 6
    //   412: new 803	java/io/FileInputStream
    //   415: dup
    //   416: aload_1
    //   417: invokespecial 806	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   420: astore_1
    //   421: aload_1
    //   422: invokestatic 786	com/tencent/mm/sdk/platformtools/d:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   425: astore 5
    //   427: aload_1
    //   428: astore 7
    //   430: aload 5
    //   432: astore_1
    //   433: aload 7
    //   435: ifnull -295 -> 140
    //   438: aload 7
    //   440: invokevirtual 807	java/io/FileInputStream:close	()V
    //   443: aload 5
    //   445: astore_1
    //   446: goto -306 -> 140
    //   449: astore_1
    //   450: ldc_w 497
    //   453: ldc_w 793
    //   456: iconst_1
    //   457: anewarray 501	java/lang/Object
    //   460: dup
    //   461: iconst_0
    //   462: aload_1
    //   463: invokestatic 797	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   466: aastore
    //   467: invokestatic 799	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   470: aload 5
    //   472: astore_1
    //   473: goto -333 -> 140
    //   476: aload 8
    //   478: astore 6
    //   480: new 291	java/io/File
    //   483: dup
    //   484: new 122	java/lang/StringBuilder
    //   487: dup
    //   488: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   491: aload_0
    //   492: getfield 345	com/tencent/mm/storage/emotion/EmojiInfo:nSe	Ljava/lang/String;
    //   495: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   498: aload_0
    //   499: invokevirtual 701	com/tencent/mm/storage/emotion/EmojiInfo:GS	()Ljava/lang/String;
    //   502: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   505: ldc_w 809
    //   508: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   511: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   514: invokespecial 709	java/io/File:<init>	(Ljava/lang/String;)V
    //   517: astore_1
    //   518: goto -121 -> 397
    //   521: astore 7
    //   523: aconst_null
    //   524: astore_1
    //   525: aload 4
    //   527: astore 5
    //   529: aload_1
    //   530: astore 4
    //   532: aload 5
    //   534: astore 6
    //   536: ldc_w 497
    //   539: ldc_w 793
    //   542: iconst_1
    //   543: anewarray 501	java/lang/Object
    //   546: dup
    //   547: iconst_0
    //   548: aload 7
    //   550: invokestatic 797	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   553: aastore
    //   554: invokestatic 799	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   557: aload 5
    //   559: astore 6
    //   561: ldc_w 497
    //   564: aload 7
    //   566: invokevirtual 810	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   569: invokestatic 646	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   572: aload 4
    //   574: astore_1
    //   575: aload 5
    //   577: ifnull -437 -> 140
    //   580: aload 5
    //   582: invokevirtual 807	java/io/FileInputStream:close	()V
    //   585: aload 4
    //   587: astore_1
    //   588: goto -448 -> 140
    //   591: astore_1
    //   592: ldc_w 497
    //   595: ldc_w 793
    //   598: iconst_1
    //   599: anewarray 501	java/lang/Object
    //   602: dup
    //   603: iconst_0
    //   604: aload_1
    //   605: invokestatic 797	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   608: aastore
    //   609: invokestatic 799	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   612: aload 4
    //   614: astore_1
    //   615: goto -475 -> 140
    //   618: aload 8
    //   620: astore 6
    //   622: aload_0
    //   623: invokevirtual 751	com/tencent/mm/storage/emotion/EmojiInfo:bUR	()Z
    //   626: ifeq +251 -> 877
    //   629: aload 8
    //   631: astore 6
    //   633: getstatic 815	android/os/Build$VERSION:SDK_INT	I
    //   636: bipush 19
    //   638: if_icmpge +600 -> 1238
    //   641: aload 8
    //   643: astore 6
    //   645: new 803	java/io/FileInputStream
    //   648: dup
    //   649: new 122	java/lang/StringBuilder
    //   652: dup
    //   653: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   656: aload_0
    //   657: getfield 345	com/tencent/mm/storage/emotion/EmojiInfo:nSe	Ljava/lang/String;
    //   660: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   663: aload_0
    //   664: getfield 421	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
    //   667: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   670: getstatic 294	java/io/File:separator	Ljava/lang/String;
    //   673: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   676: aload_0
    //   677: invokevirtual 701	com/tencent/mm/storage/emotion/EmojiInfo:GS	()Ljava/lang/String;
    //   680: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   683: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   686: invokespecial 816	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   689: astore_1
    //   690: aload_1
    //   691: invokestatic 786	com/tencent/mm/sdk/platformtools/d:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   694: astore 4
    //   696: aload_1
    //   697: astore 6
    //   699: aload_0
    //   700: invokevirtual 751	com/tencent/mm/storage/emotion/EmojiInfo:bUR	()Z
    //   703: ifeq +219 -> 922
    //   706: aload_1
    //   707: astore 6
    //   709: ldc_w 497
    //   712: ldc_w 818
    //   715: invokestatic 820	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   718: aload 4
    //   720: astore 5
    //   722: aload_1
    //   723: astore 7
    //   725: aload_1
    //   726: astore 6
    //   728: new 291	java/io/File
    //   731: dup
    //   732: new 122	java/lang/StringBuilder
    //   735: dup
    //   736: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   739: aload_0
    //   740: getfield 345	com/tencent/mm/storage/emotion/EmojiInfo:nSe	Ljava/lang/String;
    //   743: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   746: aload_0
    //   747: getfield 421	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
    //   750: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   753: getstatic 294	java/io/File:separator	Ljava/lang/String;
    //   756: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   759: aload_0
    //   760: invokevirtual 701	com/tencent/mm/storage/emotion/EmojiInfo:GS	()Ljava/lang/String;
    //   763: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   766: ldc_w 625
    //   769: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   772: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   775: invokespecial 709	java/io/File:<init>	(Ljava/lang/String;)V
    //   778: invokevirtual 712	java/io/File:exists	()Z
    //   781: ifne -351 -> 430
    //   784: aload 4
    //   786: astore 5
    //   788: aload_1
    //   789: astore 7
    //   791: aload_1
    //   792: astore 6
    //   794: getstatic 815	android/os/Build$VERSION:SDK_INT	I
    //   797: bipush 19
    //   799: if_icmpge -369 -> 430
    //   802: aload_1
    //   803: astore 6
    //   805: aload 4
    //   807: bipush 100
    //   809: getstatic 826	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   812: new 122	java/lang/StringBuilder
    //   815: dup
    //   816: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   819: aload_0
    //   820: getfield 345	com/tencent/mm/storage/emotion/EmojiInfo:nSe	Ljava/lang/String;
    //   823: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   826: aload_0
    //   827: getfield 421	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
    //   830: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   833: getstatic 294	java/io/File:separator	Ljava/lang/String;
    //   836: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   839: aload_0
    //   840: invokevirtual 701	com/tencent/mm/storage/emotion/EmojiInfo:GS	()Ljava/lang/String;
    //   843: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   846: ldc_w 625
    //   849: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   852: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   855: iconst_0
    //   856: invokestatic 829	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   859: aload 4
    //   861: astore 5
    //   863: aload_1
    //   864: astore 7
    //   866: goto -436 -> 430
    //   869: astore 7
    //   871: aload_1
    //   872: astore 5
    //   874: goto -342 -> 532
    //   877: aload 8
    //   879: astore 6
    //   881: new 803	java/io/FileInputStream
    //   884: dup
    //   885: new 122	java/lang/StringBuilder
    //   888: dup
    //   889: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   892: aload_0
    //   893: getfield 345	com/tencent/mm/storage/emotion/EmojiInfo:nSe	Ljava/lang/String;
    //   896: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   899: aload_0
    //   900: invokevirtual 701	com/tencent/mm/storage/emotion/EmojiInfo:GS	()Ljava/lang/String;
    //   903: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   906: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   909: invokespecial 816	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   912: astore_1
    //   913: aload_1
    //   914: invokestatic 786	com/tencent/mm/sdk/platformtools/d:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   917: astore 4
    //   919: goto -223 -> 696
    //   922: aload_1
    //   923: astore 6
    //   925: aload 4
    //   927: bipush 100
    //   929: getstatic 826	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   932: new 122	java/lang/StringBuilder
    //   935: dup
    //   936: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   939: aload_0
    //   940: getfield 345	com/tencent/mm/storage/emotion/EmojiInfo:nSe	Ljava/lang/String;
    //   943: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   946: aload_0
    //   947: invokevirtual 701	com/tencent/mm/storage/emotion/EmojiInfo:GS	()Ljava/lang/String;
    //   950: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   953: ldc_w 809
    //   956: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   959: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   962: iconst_0
    //   963: invokestatic 829	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   966: aload 4
    //   968: astore 5
    //   970: aload_1
    //   971: astore 7
    //   973: goto -543 -> 430
    //   976: astore 6
    //   978: aload_1
    //   979: astore 5
    //   981: aload 6
    //   983: astore_1
    //   984: aload 5
    //   986: astore 6
    //   988: ldc_w 497
    //   991: ldc_w 793
    //   994: iconst_1
    //   995: anewarray 501	java/lang/Object
    //   998: dup
    //   999: iconst_0
    //   1000: aload_1
    //   1001: invokestatic 797	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1004: aastore
    //   1005: invokestatic 799	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1008: aload 5
    //   1010: astore 6
    //   1012: ldc_w 497
    //   1015: aload_1
    //   1016: invokevirtual 533	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1019: invokestatic 646	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1022: aload 4
    //   1024: astore_1
    //   1025: aload 5
    //   1027: ifnull -887 -> 140
    //   1030: aload 5
    //   1032: invokevirtual 807	java/io/FileInputStream:close	()V
    //   1035: aload 4
    //   1037: astore_1
    //   1038: goto -898 -> 140
    //   1041: astore_1
    //   1042: ldc_w 497
    //   1045: ldc_w 793
    //   1048: iconst_1
    //   1049: anewarray 501	java/lang/Object
    //   1052: dup
    //   1053: iconst_0
    //   1054: aload_1
    //   1055: invokestatic 797	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1058: aastore
    //   1059: invokestatic 799	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1062: aload 4
    //   1064: astore_1
    //   1065: goto -925 -> 140
    //   1068: astore_1
    //   1069: aload 6
    //   1071: ifnull +8 -> 1079
    //   1074: aload 6
    //   1076: invokevirtual 807	java/io/FileInputStream:close	()V
    //   1079: aload_1
    //   1080: athrow
    //   1081: astore 4
    //   1083: ldc_w 497
    //   1086: ldc_w 793
    //   1089: iconst_1
    //   1090: anewarray 501	java/lang/Object
    //   1093: dup
    //   1094: iconst_0
    //   1095: aload 4
    //   1097: invokestatic 797	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1100: aastore
    //   1101: invokestatic 799	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1104: goto -25 -> 1079
    //   1107: astore 4
    //   1109: aload_1
    //   1110: astore 6
    //   1112: aload 4
    //   1114: astore_1
    //   1115: goto -46 -> 1069
    //   1118: astore 4
    //   1120: aload_1
    //   1121: astore 6
    //   1123: aload 4
    //   1125: astore_1
    //   1126: goto -57 -> 1069
    //   1129: astore 4
    //   1131: aload_1
    //   1132: astore 6
    //   1134: aload 4
    //   1136: astore_1
    //   1137: goto -68 -> 1069
    //   1140: astore_1
    //   1141: aconst_null
    //   1142: astore 4
    //   1144: goto -160 -> 984
    //   1147: astore 6
    //   1149: aconst_null
    //   1150: astore 4
    //   1152: aload_1
    //   1153: astore 5
    //   1155: aload 6
    //   1157: astore_1
    //   1158: goto -174 -> 984
    //   1161: astore 6
    //   1163: aconst_null
    //   1164: astore 4
    //   1166: aload_1
    //   1167: astore 5
    //   1169: aload 6
    //   1171: astore_1
    //   1172: goto -188 -> 984
    //   1175: astore 6
    //   1177: aconst_null
    //   1178: astore 4
    //   1180: aload_1
    //   1181: astore 5
    //   1183: aload 6
    //   1185: astore_1
    //   1186: goto -202 -> 984
    //   1189: astore 7
    //   1191: aconst_null
    //   1192: astore 4
    //   1194: aload_1
    //   1195: astore 5
    //   1197: goto -665 -> 532
    //   1200: astore 7
    //   1202: aconst_null
    //   1203: astore 4
    //   1205: aload_1
    //   1206: astore 5
    //   1208: goto -676 -> 532
    //   1211: astore 7
    //   1213: aconst_null
    //   1214: astore 4
    //   1216: aload_1
    //   1217: astore 5
    //   1219: goto -687 -> 532
    //   1222: astore 5
    //   1224: aload_1
    //   1225: astore 4
    //   1227: aload 5
    //   1229: astore_1
    //   1230: goto -966 -> 264
    //   1233: astore 5
    //   1235: goto -1041 -> 194
    //   1238: aconst_null
    //   1239: astore 4
    //   1241: aload 7
    //   1243: astore_1
    //   1244: goto -548 -> 696
    //   1247: goto -863 -> 384
    //   1250: aload 5
    //   1252: astore_1
    //   1253: goto -1113 -> 140
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1256	0	this	EmojiInfo
    //   0	1256	1	paramContext	Context
    //   67	8	2	i	int
    //   71	4	3	j	int
    //   1	269	4	localObject1	Object
    //   281	245	4	localIOException1	java.io.IOException
    //   530	533	4	localObject2	Object
    //   1081	15	4	localIOException2	java.io.IOException
    //   1107	6	4	localObject3	Object
    //   1118	6	4	localObject4	Object
    //   1129	6	4	localObject5	Object
    //   1142	98	4	localContext1	Context
    //   7	177	5	localBitmap	Bitmap
    //   189	21	5	localException1	Exception
    //   425	793	5	localObject6	Object
    //   1222	6	5	localObject7	Object
    //   1233	18	5	localException2	Exception
    //   13	911	6	localObject8	Object
    //   976	6	6	localException3	Exception
    //   986	147	6	localObject9	Object
    //   1147	9	6	localException4	Exception
    //   1161	9	6	localException5	Exception
    //   1175	9	6	localException6	Exception
    //   4	435	7	localContext2	Context
    //   521	44	7	localFileNotFoundException1	java.io.FileNotFoundException
    //   723	142	7	localContext3	Context
    //   869	1	7	localFileNotFoundException2	java.io.FileNotFoundException
    //   971	1	7	localContext4	Context
    //   1189	1	7	localFileNotFoundException3	java.io.FileNotFoundException
    //   1200	1	7	localFileNotFoundException4	java.io.FileNotFoundException
    //   1211	31	7	localFileNotFoundException5	java.io.FileNotFoundException
    //   10	868	8	localObject10	Object
    // Exception table:
    //   from	to	target	type
    //   132	137	162	java/io/IOException
    //   77	83	189	java/lang/Exception
    //   83	109	189	java/lang/Exception
    //   109	117	189	java/lang/Exception
    //   153	159	189	java/lang/Exception
    //   223	228	233	java/io/IOException
    //   77	83	259	finally
    //   83	109	259	finally
    //   109	117	259	finally
    //   153	159	259	finally
    //   17	72	276	finally
    //   132	137	276	finally
    //   140	149	276	finally
    //   163	183	276	finally
    //   223	228	276	finally
    //   234	254	276	finally
    //   269	274	276	finally
    //   274	276	276	finally
    //   283	304	276	finally
    //   438	443	276	finally
    //   450	470	276	finally
    //   580	585	276	finally
    //   592	612	276	finally
    //   1030	1035	276	finally
    //   1042	1062	276	finally
    //   1074	1079	276	finally
    //   1079	1081	276	finally
    //   1083	1104	276	finally
    //   269	274	281	java/io/IOException
    //   438	443	449	java/io/IOException
    //   316	323	521	java/io/FileNotFoundException
    //   327	332	521	java/io/FileNotFoundException
    //   340	384	521	java/io/FileNotFoundException
    //   388	397	521	java/io/FileNotFoundException
    //   401	408	521	java/io/FileNotFoundException
    //   412	421	521	java/io/FileNotFoundException
    //   480	518	521	java/io/FileNotFoundException
    //   622	629	521	java/io/FileNotFoundException
    //   633	641	521	java/io/FileNotFoundException
    //   645	690	521	java/io/FileNotFoundException
    //   881	913	521	java/io/FileNotFoundException
    //   580	585	591	java/io/IOException
    //   699	706	869	java/io/FileNotFoundException
    //   709	718	869	java/io/FileNotFoundException
    //   728	784	869	java/io/FileNotFoundException
    //   794	802	869	java/io/FileNotFoundException
    //   805	859	869	java/io/FileNotFoundException
    //   925	966	869	java/io/FileNotFoundException
    //   699	706	976	java/lang/Exception
    //   709	718	976	java/lang/Exception
    //   728	784	976	java/lang/Exception
    //   794	802	976	java/lang/Exception
    //   805	859	976	java/lang/Exception
    //   925	966	976	java/lang/Exception
    //   1030	1035	1041	java/io/IOException
    //   316	323	1068	finally
    //   327	332	1068	finally
    //   340	384	1068	finally
    //   388	397	1068	finally
    //   401	408	1068	finally
    //   412	421	1068	finally
    //   480	518	1068	finally
    //   536	557	1068	finally
    //   561	572	1068	finally
    //   622	629	1068	finally
    //   633	641	1068	finally
    //   645	690	1068	finally
    //   699	706	1068	finally
    //   709	718	1068	finally
    //   728	784	1068	finally
    //   794	802	1068	finally
    //   805	859	1068	finally
    //   881	913	1068	finally
    //   925	966	1068	finally
    //   988	1008	1068	finally
    //   1012	1022	1068	finally
    //   1074	1079	1081	java/io/IOException
    //   421	427	1107	finally
    //   690	696	1118	finally
    //   913	919	1129	finally
    //   316	323	1140	java/lang/Exception
    //   327	332	1140	java/lang/Exception
    //   340	384	1140	java/lang/Exception
    //   388	397	1140	java/lang/Exception
    //   401	408	1140	java/lang/Exception
    //   412	421	1140	java/lang/Exception
    //   480	518	1140	java/lang/Exception
    //   622	629	1140	java/lang/Exception
    //   633	641	1140	java/lang/Exception
    //   645	690	1140	java/lang/Exception
    //   881	913	1140	java/lang/Exception
    //   421	427	1147	java/lang/Exception
    //   690	696	1161	java/lang/Exception
    //   913	919	1175	java/lang/Exception
    //   421	427	1189	java/io/FileNotFoundException
    //   690	696	1200	java/io/FileNotFoundException
    //   913	919	1211	java/io/FileNotFoundException
    //   120	127	1222	finally
    //   197	218	1222	finally
    //   120	127	1233	java/lang/Exception
  }
  
  /* Error */
  public final byte[] ee(int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: ldc2_w 832
    //   3: sipush 11562
    //   6: invokestatic 53	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: iload_1
    //   10: iflt +7 -> 17
    //   13: iload_2
    //   14: ifge +14 -> 28
    //   17: ldc2_w 832
    //   20: sipush 11562
    //   23: invokestatic 302	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   26: aconst_null
    //   27: areturn
    //   28: aload_0
    //   29: getfield 385	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   32: getstatic 59	com/tencent/mm/storage/emotion/EmojiInfo:vCq	I
    //   35: if_icmpeq +23 -> 58
    //   38: aload_0
    //   39: getfield 385	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   42: getstatic 65	com/tencent/mm/storage/emotion/EmojiInfo:vCt	I
    //   45: if_icmpeq +13 -> 58
    //   48: aload_0
    //   49: getfield 385	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   52: getstatic 63	com/tencent/mm/storage/emotion/EmojiInfo:vCs	I
    //   55: if_icmpne +160 -> 215
    //   58: ldc_w 497
    //   61: ldc_w 835
    //   64: iconst_1
    //   65: anewarray 501	java/lang/Object
    //   68: dup
    //   69: iconst_0
    //   70: aload_0
    //   71: invokevirtual 561	com/tencent/mm/storage/emotion/EmojiInfo:getName	()Ljava/lang/String;
    //   74: aastore
    //   75: invokestatic 507	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   78: invokestatic 839	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   81: aload_0
    //   82: invokevirtual 561	com/tencent/mm/storage/emotion/EmojiInfo:getName	()Ljava/lang/String;
    //   85: invokestatic 782	com/tencent/mm/storage/emotion/EmojiInfo:bd	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   88: astore 6
    //   90: iload_1
    //   91: i2l
    //   92: lstore_3
    //   93: aload 6
    //   95: astore 5
    //   97: aload 6
    //   99: lload_3
    //   100: invokevirtual 843	java/io/InputStream:skip	(J)J
    //   103: pop2
    //   104: aload 6
    //   106: astore 5
    //   108: iload_2
    //   109: newarray <illegal type>
    //   111: astore 7
    //   113: aload 6
    //   115: astore 5
    //   117: aload 6
    //   119: aload 7
    //   121: iconst_0
    //   122: iload_2
    //   123: invokevirtual 847	java/io/InputStream:read	([BII)I
    //   126: pop
    //   127: aload 6
    //   129: ifnull +8 -> 137
    //   132: aload 6
    //   134: invokevirtual 791	java/io/InputStream:close	()V
    //   137: ldc2_w 832
    //   140: sipush 11562
    //   143: invokestatic 302	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   146: aload 7
    //   148: areturn
    //   149: astore 5
    //   151: ldc_w 497
    //   154: ldc_w 793
    //   157: iconst_1
    //   158: anewarray 501	java/lang/Object
    //   161: dup
    //   162: iconst_0
    //   163: aload 5
    //   165: invokestatic 797	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   168: aastore
    //   169: invokestatic 799	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: goto -35 -> 137
    //   175: astore 7
    //   177: aconst_null
    //   178: astore 6
    //   180: aload 6
    //   182: astore 5
    //   184: ldc_w 497
    //   187: ldc_w 793
    //   190: iconst_1
    //   191: anewarray 501	java/lang/Object
    //   194: dup
    //   195: iconst_0
    //   196: aload 7
    //   198: invokestatic 797	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   201: aastore
    //   202: invokestatic 799	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   205: aload 6
    //   207: ifnull +8 -> 215
    //   210: aload 6
    //   212: invokevirtual 791	java/io/InputStream:close	()V
    //   215: new 122	java/lang/StringBuilder
    //   218: dup
    //   219: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   222: aload_0
    //   223: getfield 345	com/tencent/mm/storage/emotion/EmojiInfo:nSe	Ljava/lang/String;
    //   226: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: aload_0
    //   230: invokevirtual 701	com/tencent/mm/storage/emotion/EmojiInfo:GS	()Ljava/lang/String;
    //   233: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   239: astore 5
    //   241: aload_0
    //   242: invokevirtual 751	com/tencent/mm/storage/emotion/EmojiInfo:bUR	()Z
    //   245: ifeq +42 -> 287
    //   248: new 122	java/lang/StringBuilder
    //   251: dup
    //   252: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   255: aload_0
    //   256: getfield 345	com/tencent/mm/storage/emotion/EmojiInfo:nSe	Ljava/lang/String;
    //   259: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: aload_0
    //   263: getfield 421	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
    //   266: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: getstatic 294	java/io/File:separator	Ljava/lang/String;
    //   272: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: aload_0
    //   276: invokevirtual 701	com/tencent/mm/storage/emotion/EmojiInfo:GS	()Ljava/lang/String;
    //   279: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   285: astore 5
    //   287: aload 5
    //   289: aload_0
    //   290: getfield 394	com/tencent/mm/storage/emotion/EmojiInfo:field_start	I
    //   293: iload_2
    //   294: invokestatic 851	com/tencent/mm/a/e:c	(Ljava/lang/String;II)[B
    //   297: astore 5
    //   299: ldc2_w 832
    //   302: sipush 11562
    //   305: invokestatic 302	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   308: aload 5
    //   310: areturn
    //   311: astore 5
    //   313: ldc_w 497
    //   316: ldc_w 793
    //   319: iconst_1
    //   320: anewarray 501	java/lang/Object
    //   323: dup
    //   324: iconst_0
    //   325: aload 5
    //   327: invokestatic 797	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   330: aastore
    //   331: invokestatic 799	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   334: goto -119 -> 215
    //   337: astore 6
    //   339: aconst_null
    //   340: astore 5
    //   342: aload 5
    //   344: ifnull +8 -> 352
    //   347: aload 5
    //   349: invokevirtual 791	java/io/InputStream:close	()V
    //   352: aload 6
    //   354: athrow
    //   355: astore 5
    //   357: ldc_w 497
    //   360: ldc_w 793
    //   363: iconst_1
    //   364: anewarray 501	java/lang/Object
    //   367: dup
    //   368: iconst_0
    //   369: aload 5
    //   371: invokestatic 797	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   374: aastore
    //   375: invokestatic 799	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   378: goto -26 -> 352
    //   381: astore 6
    //   383: goto -41 -> 342
    //   386: astore 7
    //   388: goto -208 -> 180
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	391	0	this	EmojiInfo
    //   0	391	1	paramInt1	int
    //   0	391	2	paramInt2	int
    //   92	8	3	l	long
    //   95	21	5	localInputStream1	InputStream
    //   149	15	5	localIOException1	java.io.IOException
    //   182	127	5	localObject1	Object
    //   311	15	5	localIOException2	java.io.IOException
    //   340	8	5	localObject2	Object
    //   355	15	5	localIOException3	java.io.IOException
    //   88	123	6	localInputStream2	InputStream
    //   337	16	6	localObject3	Object
    //   381	1	6	localObject4	Object
    //   111	36	7	arrayOfByte	byte[]
    //   175	22	7	localIOException4	java.io.IOException
    //   386	1	7	localIOException5	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   132	137	149	java/io/IOException
    //   58	90	175	java/io/IOException
    //   210	215	311	java/io/IOException
    //   58	90	337	finally
    //   347	352	355	java/io/IOException
    //   97	104	381	finally
    //   108	113	381	finally
    //   117	127	381	finally
    //   184	205	381	finally
    //   97	104	386	java/io/IOException
    //   108	113	386	java/io/IOException
    //   117	127	386	java/io/IOException
  }
  
  public boolean equals(Object paramObject)
  {
    GMTrace.i(1554643943424L, 11583);
    boolean bool = bK(paramObject);
    GMTrace.o(1554643943424L, 11583);
    return bool;
  }
  
  public final String getName()
  {
    GMTrace.i(1553838637056L, 11577);
    if (this.field_name == null)
    {
      GMTrace.o(1553838637056L, 11577);
      return "";
    }
    String str = this.field_name;
    GMTrace.o(1553838637056L, 11577);
    return str;
  }
  
  public final boolean isGif()
  {
    GMTrace.i(1553033330688L, 11571);
    if ((this.field_type == vCw) || (this.field_type == vCy))
    {
      GMTrace.o(1553033330688L, 11571);
      return true;
    }
    GMTrace.o(1553033330688L, 11571);
    return false;
  }
  
  public final void jI(String paramString)
  {
    GMTrace.i(18616669962240L, 138705);
    this.field_md5 = paramString;
    GMTrace.o(18616669962240L, 138705);
  }
  
  public final String rc()
  {
    GMTrace.i(1553972854784L, 11578);
    if (this.field_content == null)
    {
      GMTrace.o(1553972854784L, 11578);
      return "";
    }
    String str = this.field_content;
    GMTrace.o(1553972854784L, 11578);
    return str;
  }
  
  public final void reset()
  {
    GMTrace.i(1551691153408L, 11561);
    this.field_md5 = "";
    this.field_svrid = "";
    this.field_catalog = vCq;
    this.field_type = vCv;
    this.field_size = 0;
    this.field_start = 0;
    this.field_state = vCA;
    this.field_name = "";
    this.field_content = "";
    this.field_reserved1 = "";
    this.field_reserved2 = "";
    this.field_reserved3 = 0;
    this.field_reserved4 = 0;
    this.field_app_id = "";
    this.field_temp = 0;
    GMTrace.o(1551691153408L, 11561);
  }
  
  public final void setSize(int paramInt)
  {
    GMTrace.i(18617072615424L, 138708);
    this.field_size = paramInt;
    GMTrace.o(18617072615424L, 138708);
  }
  
  public final void setType(int paramInt)
  {
    GMTrace.i(18616938397696L, 138707);
    this.field_type = paramInt;
    GMTrace.o(18616938397696L, 138707);
  }
  
  public String toString()
  {
    GMTrace.i(1554912378880L, 11585);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("field_md5:").append(this.field_md5).append("\n");
    ((StringBuilder)localObject).append("field_svrid:").append(this.field_svrid).append("\n");
    ((StringBuilder)localObject).append("field_catalog:").append(this.field_catalog).append("\n");
    ((StringBuilder)localObject).append("field_type:").append(this.field_type).append("\n");
    ((StringBuilder)localObject).append("field_size:").append(this.field_size).append("\n");
    ((StringBuilder)localObject).append("field_start:").append(this.field_start).append("\n");
    ((StringBuilder)localObject).append("field_state:").append(this.field_state).append("\n");
    ((StringBuilder)localObject).append("field_name:").append(this.field_name).append("\n");
    ((StringBuilder)localObject).append("field_content:").append(this.field_content).append("\n");
    ((StringBuilder)localObject).append("field_reserved1:").append(this.field_reserved1).append("\n");
    ((StringBuilder)localObject).append("field_reserved2:").append(this.field_reserved2).append("\n");
    ((StringBuilder)localObject).append("field_reserved3:").append(this.field_reserved3).append("\n");
    ((StringBuilder)localObject).append("field_reserved4:").append(this.field_reserved4).append("\n");
    ((StringBuilder)localObject).append("field_app_id:").append(this.field_app_id).append("\n");
    ((StringBuilder)localObject).append("field_groupId:").append(this.field_groupId).append("\n");
    ((StringBuilder)localObject).append("field_lastUseTime:").append(this.field_lastUseTime).append("\n");
    ((StringBuilder)localObject).append("field_framesInfo:").append(this.field_framesInfo).append("\n");
    ((StringBuilder)localObject).append("field_idx:").append(this.field_idx).append("\n");
    ((StringBuilder)localObject).append("field_temp:").append(this.field_temp).append("\n");
    ((StringBuilder)localObject).append("field_source:").append(this.field_source).append("\n");
    ((StringBuilder)localObject).append("field_needupload:").append(this.field_needupload).append("\n");
    ((StringBuilder)localObject).append("field_designerID:").append(this.field_designerID).append("\n");
    ((StringBuilder)localObject).append("field_thumbUrl:").append(this.field_thumbUrl).append("\n");
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(1554912378880L, 11585);
    return (String)localObject;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(1554241290240L, 11580);
    c.a locala = fTp;
    GMTrace.o(1554241290240L, 11580);
    return locala;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(20129035321344L, 149973);
    paramParcel.writeString(this.nSe);
    paramParcel.writeString(this.field_md5);
    paramParcel.writeString(this.field_svrid);
    paramParcel.writeInt(this.field_catalog);
    paramParcel.writeInt(this.field_type);
    paramParcel.writeInt(this.field_size);
    paramParcel.writeInt(this.field_start);
    paramParcel.writeInt(this.field_state);
    paramParcel.writeString(this.field_name);
    paramParcel.writeString(this.field_content);
    paramParcel.writeString(this.field_reserved1);
    paramParcel.writeString(this.field_reserved2);
    paramParcel.writeInt(this.field_reserved3);
    paramParcel.writeInt(this.field_reserved4);
    paramParcel.writeString(this.field_app_id);
    paramParcel.writeString(this.field_groupId);
    paramParcel.writeLong(this.field_lastUseTime);
    paramParcel.writeString(this.field_framesInfo);
    paramParcel.writeInt(this.field_idx);
    paramParcel.writeInt(this.field_temp);
    paramParcel.writeInt(this.field_source);
    paramParcel.writeInt(this.field_needupload);
    paramParcel.writeString(this.field_designerID);
    paramParcel.writeString(this.field_thumbUrl);
    paramParcel.writeString(this.field_cdnUrl);
    paramParcel.writeString(this.field_encrypturl);
    paramParcel.writeString(this.field_aeskey);
    paramParcel.writeInt(this.field_width);
    paramParcel.writeInt(this.field_height);
    paramParcel.writeString(this.field_activityid);
    paramParcel.writeLong(this.vmr);
    GMTrace.o(20129035321344L, 149973);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\EmojiInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */