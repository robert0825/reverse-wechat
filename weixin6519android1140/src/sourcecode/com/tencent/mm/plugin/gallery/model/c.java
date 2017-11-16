package com.tencent.mm.plugin.gallery.model;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.f;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class c
{
  private static int aHs;
  private static c lBi;
  public static boolean lBj;
  public static boolean lBk;
  public static boolean lBl;
  public static boolean lBm;
  private l lBd;
  private a lBe;
  private e lBf;
  private ArrayList<GalleryItem.MediaItem> lBg;
  private LinkedHashSet<GalleryItem.MediaItem> lBh;
  private HashSet<GalleryItem.MediaItem> lBn;
  private ArrayList<Bundle> lBo;
  private HashMap<Integer, Boolean> lBp;
  
  static
  {
    GMTrace.i(11919473770496L, 88807);
    lBi = null;
    lBj = false;
    lBk = false;
    lBl = false;
    lBm = false;
    aHs = 0;
    GMTrace.o(11919473770496L, 88807);
  }
  
  private c()
  {
    GMTrace.i(11917460504576L, 88792);
    this.lBg = null;
    this.lBh = new LinkedHashSet();
    this.lBn = new HashSet();
    this.lBo = new ArrayList();
    this.lBp = new HashMap();
    if (this.lBe == null) {
      this.lBe = new a();
    }
    if (this.lBd == null) {
      this.lBd = new l();
    }
    if (this.lBf == null) {
      this.lBf = new e();
    }
    GMTrace.o(11917460504576L, 88792);
  }
  
  public static void a(com.tencent.mm.plugin.gallery.stub.a parama, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(11919339552768L, 88806);
    w.i("MicroMsg.GalleryCore", "[handlePhotoEditInfo] selectSize:%s isSendRaw:%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (parama == null)
    {
      w.e("MicroMsg.GalleryCore", "invoker is null");
      GMTrace.o(11919339552768L, 88806);
      return;
    }
    int i;
    if (aCJ().lBd.aDo() == 3) {
      i = 1;
    }
    for (;;)
    {
      int j;
      label88:
      label212:
      Object localObject;
      int n;
      int i1;
      int i2;
      int i3;
      boolean bool2;
      int m;
      boolean bool3;
      label348:
      int k;
      if (aCJ().lBn != null)
      {
        j = aCJ().lBn.size();
        w.i("MicroMsg.GalleryCore", "[reportPhotoEdit] fromScene:%s,selectSize:%s,editSize:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(j) });
        if (j > 0) {
          parama.Z(13858, i + "," + paramInt + "," + j + ",0");
        }
        boolean bool1 = parama.eK(true);
        w.i("MicroMsg.GalleryCore", "[handlePhotoEditInfo] imageState:%s", new Object[] { Boolean.valueOf(bool1) });
        Iterator localIterator = aCJ().lBo.iterator();
        label356:
        do
        {
          if (!localIterator.hasNext()) {
            break label617;
          }
          localObject = (Bundle)localIterator.next();
          String str = ((Bundle)localObject).getString("after_photo_edit");
          if (!bool1)
          {
            w.i("MicroMsg.GalleryCore", "[handlePhotoEditInfo] delete file:%s", new Object[] { str });
            FileOp.deleteFile(str);
            com.tencent.mm.platformtools.d.b(str, ab.getContext());
          }
          n = ((Bundle)localObject).getInt("report_info_emotion_count");
          i1 = ((Bundle)localObject).getInt("report_info_text_count");
          i2 = ((Bundle)localObject).getInt("report_info_mosaic_count");
          i3 = ((Bundle)localObject).getInt("report_info_doodle_count");
          bool2 = ((Bundle)localObject).getBoolean("report_info_iscrop");
          m = ((Bundle)localObject).getInt("report_info_undo_count");
          bool3 = ((Bundle)localObject).getBoolean("report_info_is_rotation");
          if (!bool2) {
            break;
          }
          paramInt = 1;
          if (!bool3) {
            break label601;
          }
          k = 1;
          w.i("MicroMsg.GalleryCore", "[reportPhotoEdit] emojiCount:%s,textCount:%s,mosaicCount:%s,penCount:%s,isCrop:%s,undoCount:%s,isRotation:%s", new Object[] { Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(paramInt), Integer.valueOf(m), Integer.valueOf(k) });
        } while (j <= 0);
      }
      for (;;)
      {
        try
        {
          localObject = new StringBuilder().append(i).append(",").append(paramBoolean).append(",").append(n).append(",").append(i1).append(",").append(i2).append(",").append(i3).append(",");
          if (!bool2) {
            break label607;
          }
          paramInt = 1;
          localObject = ((StringBuilder)localObject).append(paramInt).append(",").append(m).append(",2");
          if (!bool3) {
            break label612;
          }
          paramInt = 1;
          parama.Z(13857, paramInt);
        }
        catch (RemoteException localRemoteException)
        {
          w.printErrStackTrace("MicroMsg.GalleryCore", localRemoteException, "", new Object[0]);
        }
        break label212;
        if (aCJ().lBd.aDo() != 4) {
          break label626;
        }
        i = 2;
        break;
        j = 0;
        break label88;
        paramInt = 0;
        break label348;
        label601:
        k = 0;
        break label356;
        label607:
        paramInt = 0;
        continue;
        label612:
        paramInt = 0;
      }
      label617:
      GMTrace.o(11919339552768L, 88806);
      return;
      label626:
      i = 0;
    }
  }
  
  public static void a(com.tencent.mm.plugin.gallery.stub.a parama, String paramString, int[] paramArrayOfInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int j = 2;
    GMTrace.i(15077885345792L, 112339);
    int k = aCJ().lBd.aDo();
    int i;
    switch (k)
    {
    case 5: 
    case 6: 
    default: 
      i = 0;
    }
    for (;;)
    {
      w.i("MicroMsg.GalleryCore", "[handleSelectImagePreviewReport] source:%s", new Object[] { Integer.valueOf(k) });
      if (parama != null) {
        break;
      }
      w.e("MicroMsg.GalleryCore", "invoker is null");
      GMTrace.o(15077885345792L, 112339);
      return;
      i = 1;
      continue;
      i = j;
      if (!bg.nm(paramString))
      {
        i = j;
        if (paramString.equals(ab.getContext().getString(R.l.dsQ)))
        {
          i = 6;
          continue;
          i = 3;
        }
      }
    }
    try
    {
      parama.Z(14205, i + "," + i + "," + paramArrayOfInt[0] + "," + paramArrayOfInt[1] + "," + paramArrayOfInt[2] + "," + paramArrayOfInt[3] + "," + paramBoolean1 + "," + paramBoolean2 + "," + lBj + "," + lBk + "," + lBl + "," + lBm);
      lBj = false;
      lBk = false;
      lBl = false;
      lBm = false;
      GMTrace.o(15077885345792L, 112339);
      return;
    }
    catch (RemoteException parama)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.GalleryCore", parama, "", new Object[0]);
      }
    }
  }
  
  private static c aCJ()
  {
    GMTrace.i(11917594722304L, 88793);
    if (lBi == null) {
      lBi = new c();
    }
    c localc = lBi;
    GMTrace.o(11917594722304L, 88793);
    return localc;
  }
  
  public static a aCK()
  {
    GMTrace.i(11917728940032L, 88794);
    a locala = aCJ().lBe;
    GMTrace.o(11917728940032L, 88794);
    return locala;
  }
  
  public static l aCL()
  {
    GMTrace.i(11917863157760L, 88795);
    l locall = aCJ().lBd;
    GMTrace.o(11917863157760L, 88795);
    return locall;
  }
  
  public static e aCM()
  {
    GMTrace.i(11917997375488L, 88796);
    e locale = aCJ().lBf;
    GMTrace.o(11917997375488L, 88796);
    return locale;
  }
  
  public static ArrayList<GalleryItem.MediaItem> aCN()
  {
    GMTrace.i(15617440612352L, 116359);
    ArrayList localArrayList = aCJ().lBg;
    GMTrace.o(15617440612352L, 116359);
    return localArrayList;
  }
  
  public static HashSet<GalleryItem.MediaItem> aCO()
  {
    GMTrace.i(11918534246400L, 88800);
    HashSet localHashSet = aCJ().lBn;
    GMTrace.o(11918534246400L, 88800);
    return localHashSet;
  }
  
  public static ArrayList<Bundle> aCP()
  {
    GMTrace.i(11918668464128L, 88801);
    ArrayList localArrayList = aCJ().lBo;
    GMTrace.o(11918668464128L, 88801);
    return localArrayList;
  }
  
  public static LinkedHashSet<GalleryItem.MediaItem> aCQ()
  {
    GMTrace.i(15077751128064L, 112338);
    LinkedHashSet localLinkedHashSet = aCJ().lBh;
    GMTrace.o(15077751128064L, 112338);
    return localLinkedHashSet;
  }
  
  public static void aCR()
  {
    GMTrace.i(11919071117312L, 88804);
    aCJ().lBp.clear();
    GMTrace.o(11919071117312L, 88804);
  }
  
  public static int aCS()
  {
    GMTrace.i(11919205335040L, 88805);
    int i = aCJ().lBp.size();
    GMTrace.o(11919205335040L, 88805);
    return i;
  }
  
  public static void initialize()
  {
    GMTrace.i(11918131593216L, 88797);
    try
    {
      aHs += 1;
      GMTrace.o(11918131593216L, 88797);
      return;
    }
    finally {}
  }
  
  public static void oe(int paramInt)
  {
    GMTrace.i(11918936899584L, 88803);
    aCJ().lBp.put(Integer.valueOf(paramInt), Boolean.valueOf(true));
    GMTrace.o(11918936899584L, 88803);
  }
  
  public static void release(boolean paramBoolean)
  {
    GMTrace.i(11918265810944L, 88798);
    try
    {
      if (aHs > 0) {
        aHs -= 1;
      }
      if ((paramBoolean) && (aHs == 0))
      {
        aCJ().lBd = null;
        if (aCJ().lBe != null)
        {
          localObject1 = aCJ().lBe.lAO;
          if (((b)localObject1).lAZ != null)
          {
            ((b)localObject1).lAZ.a(new b.4((b)localObject1));
            ((b)localObject1).lAZ = null;
          }
          if (((b)localObject1).lBa != null)
          {
            d locald = ((b)localObject1).lBa;
            locald.aCU();
            locald.aCV();
            locald.aCX();
            ((b)localObject1).lBa = null;
          }
          aCJ().lBe = null;
        }
        Object localObject1 = aCJ().lBf;
        if (((e)localObject1).lBu != null)
        {
          ((e)localObject1).lBu.quit();
          ((e)localObject1).lBu = null;
        }
        ((e)localObject1).lBx = null;
        if (((e)localObject1).lBv != null)
        {
          ((e)localObject1).lBv.quit();
          ((e)localObject1).lBv = null;
        }
        ((e)localObject1).lBy = null;
        if (((e)localObject1).lBw != null)
        {
          ((e)localObject1).lBw.quit();
          ((e)localObject1).lBw = null;
        }
        ((e)localObject1).lBz = null;
        aCJ().lBf = null;
        lBi = null;
      }
      GMTrace.o(11918265810944L, 88798);
      return;
    }
    finally {}
  }
  
  public static void z(ArrayList<GalleryItem.MediaItem> paramArrayList)
  {
    GMTrace.i(11918802681856L, 88802);
    aCJ().lBg = paramArrayList;
    GMTrace.o(11918802681856L, 88802);
  }
  
  public static GalleryItem.MediaItem ze(String paramString)
  {
    GMTrace.i(11917326286848L, 88791);
    paramString = GalleryItem.MediaItem.a(0, 0L, paramString, "", "");
    if (aCJ().lBg != null)
    {
      int i = aCJ().lBg.indexOf(paramString);
      if (i >= 0)
      {
        paramString = (GalleryItem.MediaItem)aCJ().lBg.get(i);
        GMTrace.o(11917326286848L, 88791);
        return paramString;
      }
    }
    GMTrace.o(11917326286848L, 88791);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */