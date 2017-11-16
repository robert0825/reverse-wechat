package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.text.Editable;
import android.text.Spanned;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.wenote.model.a.j;
import com.tencent.mm.plugin.wenote.model.a.k;
import com.tencent.mm.plugin.wenote.model.a.n;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c
{
  public static volatile c sdT;
  public ArrayList<com.tencent.mm.plugin.wenote.model.a.b> iFZ;
  public com.tencent.mm.plugin.wenote.model.nativenote.b.a sdU;
  public th sdV;
  public int sdW;
  public int sdX;
  public int sdY;
  public boolean sdZ;
  
  static
  {
    GMTrace.i(17231543009280L, 128385);
    sdT = null;
    GMTrace.o(17231543009280L, 128385);
  }
  
  private c()
  {
    GMTrace.i(17227784912896L, 128357);
    this.iFZ = null;
    this.sdU = null;
    this.sdV = null;
    this.sdW = 0;
    this.sdX = 0;
    this.sdY = 0;
    this.sdZ = false;
    GMTrace.o(17227784912896L, 128357);
  }
  
  private void a(com.tencent.mm.plugin.wenote.model.a.b paramb, boolean paramBoolean)
  {
    GMTrace.i(17231408791552L, 128384);
    if (paramb == null)
    {
      GMTrace.o(17231408791552L, 128384);
      return;
    }
    if (paramb.getType() == 1)
    {
      int i = com.tencent.mm.plugin.wenote.b.b.NN(((com.tencent.mm.plugin.wenote.model.a.h)paramb).content);
      if (paramBoolean)
      {
        this.sdX = (i + this.sdX);
        GMTrace.o(17231408791552L, 128384);
        return;
      }
      this.sdX -= i;
      GMTrace.o(17231408791552L, 128384);
      return;
    }
    if (paramBoolean)
    {
      this.sdY += 1;
      GMTrace.o(17231408791552L, 128384);
      return;
    }
    this.sdY -= 1;
    GMTrace.o(17231408791552L, 128384);
  }
  
  private void b(com.tencent.mm.plugin.wenote.model.a.b paramb)
  {
    GMTrace.i(17230871920640L, 128380);
    if (paramb == null)
    {
      GMTrace.o(17230871920640L, 128380);
      return;
    }
    n localn1 = (n)paramb;
    Object localObject;
    if (localn1.getType() > 1)
    {
      if (bg.nm(localn1.sde))
      {
        if ((this.sdW == 0) && (this.iFZ != null))
        {
          localObject = this.iFZ.iterator();
          while (((Iterator)localObject).hasNext())
          {
            n localn2 = (n)((Iterator)localObject).next();
            if (localn2.sde.startsWith("WeNote_"))
            {
              i = bg.getInt(localn2.sde.substring(7), -1);
              if (i > this.sdW) {}
              for (;;)
              {
                this.sdW = i;
                break;
                i = this.sdW;
              }
            }
          }
        }
        localObject = new StringBuilder("WeNote_");
        int i = this.sdW + 1;
        this.sdW = i;
        localn1.sde = i;
      }
      localObject = com.tencent.mm.plugin.wenote.model.b.bGM().sbA;
      if (localObject != null) {
        break label241;
      }
      w.e("MicroMsg.WNNote.NoteDataManager", "processItem,item is %s, but get wnnote base is null", new Object[] { paramb.toString() });
    }
    for (;;)
    {
      if (bg.nm(paramb.lhq)) {
        paramb.lhq = com.tencent.mm.plugin.wenote.model.f.NA(paramb.toString());
      }
      GMTrace.o(17230871920640L, 128380);
      return;
      label241:
      if (((com.tencent.mm.plugin.wenote.model.c)localObject).sbG == null) {
        w.e("MicroMsg.WNNote.NoteDataManager", "processItem,item is %s, but mEditorIdToDataItem is null", new Object[] { paramb.toString() });
      } else {
        ((com.tencent.mm.plugin.wenote.model.c)localObject).sbG.put(localn1.sde, localn1);
      }
    }
  }
  
  private boolean b(int paramInt, com.tencent.mm.plugin.wenote.model.a.b paramb)
  {
    boolean bool = true;
    GMTrace.i(17228590219264L, 128363);
    if ((paramb != null) && (this.iFZ != null) && (paramInt >= 0) && (paramInt <= this.iFZ.size()))
    {
      this.iFZ.add(paramInt, paramb);
      a(paramb, true);
    }
    for (;;)
    {
      GMTrace.o(17228590219264L, 128363);
      return bool;
      bool = false;
    }
  }
  
  public static c bHo()
  {
    GMTrace.i(17227919130624L, 128358);
    if (sdT == null) {}
    try
    {
      if (sdT == null) {
        sdT = new c();
      }
      c localc = sdT;
      GMTrace.o(17227919130624L, 128358);
      return localc;
    }
    finally {}
  }
  
  private void bHs()
  {
    GMTrace.i(17229663961088L, 128371);
    if (this.iFZ != null)
    {
      Iterator localIterator = this.iFZ.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.wenote.model.a.b localb = (com.tencent.mm.plugin.wenote.model.a.b)localIterator.next();
        localb.scH = false;
        localb.scN = false;
      }
    }
    GMTrace.o(17229663961088L, 128371);
  }
  
  private static String cw(String paramString, int paramInt)
  {
    GMTrace.i(17230335049728L, 128376);
    paramString = String.format("<div><object data-type=\"%d\" id=\"%s\" name=\"%s\" class=\"item item-\"></object></div>", new Object[] { Integer.valueOf(paramInt), paramString, paramString });
    GMTrace.o(17230335049728L, 128376);
    return paramString;
  }
  
  private boolean yE(int paramInt)
  {
    GMTrace.i(20640673300480L, 153785);
    if ((this.iFZ != null) && (paramInt >= 0) && (paramInt < this.iFZ.size()))
    {
      a((com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(paramInt), false);
      this.iFZ.remove(paramInt);
    }
    for (boolean bool = true;; bool = false)
    {
      GMTrace.o(20640673300480L, 153785);
      return bool;
    }
  }
  
  public final tt NH(String paramString)
  {
    GMTrace.i(17230469267456L, 128377);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.WNNote.NoteDataManager", "getFavProtoItem error ,htmlstr is null or nil");
      GMTrace.o(17230469267456L, 128377);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    for (;;)
    {
      Object localObject1;
      Object localObject2;
      try
      {
        if (i >= this.iFZ.size()) {
          break label783;
        }
        localObject1 = (com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(i);
        if (bg.nm(((com.tencent.mm.plugin.wenote.model.a.b)localObject1).lhq)) {
          ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).lhq = com.tencent.mm.plugin.wenote.model.f.NA(localObject1.toString());
        }
        if (((com.tencent.mm.plugin.wenote.model.a.b)localObject1).getType() == -1) {
          if ((localArrayList.size() > 0) && (((n)localArrayList.get(localArrayList.size() - 1)).type == 1))
          {
            localObject1 = new StringBuilder();
            localObject2 = (com.tencent.mm.plugin.wenote.model.a.h)localArrayList.get(localArrayList.size() - 1);
            ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).content += "\n";
          }
          else
          {
            localObject2 = new com.tencent.mm.plugin.wenote.model.a.h();
            ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).content = "\n";
            ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).lhq = ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).lhq;
            ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).sde = "-1";
            ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).type = 1;
            ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).sdd = null;
            localArrayList.add(localObject2);
          }
        }
      }
      finally {}
      if (((com.tencent.mm.plugin.wenote.model.a.b)localObject1).getType() >= -1)
      {
        if (((((com.tencent.mm.plugin.wenote.model.a.b)localObject1).getType() == 6) || (((com.tencent.mm.plugin.wenote.model.a.b)localObject1).getType() == 4)) && (bg.nm(((n)localObject1).eOR)))
        {
          localObject2 = new th();
          ((th)localObject2).Qt(((com.tencent.mm.plugin.wenote.model.a.b)localObject1).lhq);
          ((th)localObject2).Qq(((com.tencent.mm.plugin.wenote.model.a.b)localObject1).bGT());
          localObject2 = com.tencent.mm.plugin.wenote.model.f.n((th)localObject2);
          if (FileOp.aZ((String)localObject2))
          {
            w.e("MicroMsg.WNNote.NoteDataManager", "getFavProtoItem,type = %d, localfile exsit,but localpath is null or nil, set path here", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.wenote.model.a.b)localObject1).getType()) });
            ((n)localObject1).eOR = ((String)localObject2);
          }
        }
        if (((com.tencent.mm.plugin.wenote.model.a.b)localObject1).getType() != 1)
        {
          localArrayList.add((n)localObject1);
        }
        else
        {
          localObject1 = (com.tencent.mm.plugin.wenote.model.a.h)localObject1;
          if (bg.nm(((com.tencent.mm.plugin.wenote.model.a.h)localObject1).content))
          {
            if ((localArrayList.size() > 0) && (((n)localArrayList.get(localArrayList.size() - 1)).getType() == 1))
            {
              localObject1 = new StringBuilder();
              localObject2 = (com.tencent.mm.plugin.wenote.model.a.h)localArrayList.get(localArrayList.size() - 1);
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).content += "<br/>";
            }
            else
            {
              localObject2 = new com.tencent.mm.plugin.wenote.model.a.h();
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).content = "<br/>";
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).lhq = ((com.tencent.mm.plugin.wenote.model.a.h)localObject1).lhq;
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).sde = ((com.tencent.mm.plugin.wenote.model.a.h)localObject1).sde;
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).type = ((com.tencent.mm.plugin.wenote.model.a.h)localObject1).type;
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).sdd = null;
              localArrayList.add(localObject2);
            }
          }
          else
          {
            Object localObject3;
            if ((localArrayList.size() > 0) && (((n)localArrayList.get(localArrayList.size() - 1)).getType() == 1))
            {
              localObject2 = new StringBuilder();
              localObject3 = (com.tencent.mm.plugin.wenote.model.a.h)localArrayList.get(localArrayList.size() - 1);
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject3).content += ((com.tencent.mm.plugin.wenote.model.a.h)localObject1).content;
            }
            while ((i + 1 < this.iFZ.size()) && (((com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(i + 1)).getType() == 1) && (!bg.nm(((com.tencent.mm.plugin.wenote.model.a.h)this.iFZ.get(i + 1)).content)))
            {
              localObject1 = new StringBuilder();
              localObject2 = (com.tencent.mm.plugin.wenote.model.a.h)localArrayList.get(localArrayList.size() - 1);
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).content += "<br/>";
              break;
              localObject2 = new com.tencent.mm.plugin.wenote.model.a.h();
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).content = ((com.tencent.mm.plugin.wenote.model.a.h)localObject1).content;
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).lhq = ((com.tencent.mm.plugin.wenote.model.a.h)localObject1).lhq;
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).sde = ((com.tencent.mm.plugin.wenote.model.a.h)localObject1).sde;
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).type = ((com.tencent.mm.plugin.wenote.model.a.h)localObject1).type;
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).sdd = null;
              localArrayList.add(localObject2);
              continue;
              label783:
              paramString = Pattern.compile("<wx-", 2).matcher(paramString).replaceAll("<");
              localObject2 = Pattern.compile("</wx-", 2).matcher(paramString).replaceAll("</");
              paramString = null;
              i = 0;
              try
              {
                localObject1 = ((String)localObject2).getBytes("UTF-8");
                paramString = (String)localObject1;
              }
              catch (UnsupportedEncodingException localUnsupportedEncodingException)
              {
                for (;;)
                {
                  try
                  {
                    ((File)localObject3).createNewFile();
                    if ((i != 0) || (com.tencent.mm.a.e.b((String)localObject1, paramString, paramString.length) != 0)) {
                      break;
                    }
                    this.sdV.Qu((String)localObject1);
                    w.i("MicroMsg.WNNote.NoteDataManager", "do WNNoteBase.ConvertNote2FavProtoItem");
                    paramString = com.tencent.mm.plugin.wenote.model.c.a((String)localObject2, localArrayList, this.sdV);
                    GMTrace.o(17230469267456L, 128377);
                    return paramString;
                  }
                  catch (IOException paramString)
                  {
                    w.printErrStackTrace("MicroMsg.WNNote.NoteDataManager", paramString, "", new Object[0]);
                    GMTrace.o(17230469267456L, 128377);
                    return null;
                  }
                  localUnsupportedEncodingException = localUnsupportedEncodingException;
                  w.printErrStackTrace("MicroMsg.WNNote.NoteDataManager", localUnsupportedEncodingException, "", new Object[0]);
                  w.e("MicroMsg.WNNote.NoteDataManager", "writehtmlfile, use utf-8 encoding error,use default encoding,");
                  i = 1;
                }
              }
              this.sdV.zR(8);
              this.sdV.QD("WeNoteHtmlFile");
              this.sdV.kx(true);
              this.sdV.Qq(".htm");
              this.sdV.Qt(com.tencent.mm.plugin.wenote.model.f.NA(this.sdV.toString()));
              localObject1 = com.tencent.mm.plugin.wenote.model.f.n(this.sdV);
              w.i("MicroMsg.WNNote.NoteDataManager", "getFavProtoItem: save note html file, path is %s", new Object[] { localObject1 });
              localObject3 = new File((String)localObject1);
              if (((File)localObject3).exists()) {
                ((File)localObject3).delete();
              }
              if (!((File)localObject3).exists()) {}
              w.i("MicroMsg.WNNote.NoteDataManager", "writefile error,return");
              Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.duF), 1).show();
              GMTrace.o(17230469267456L, 128377);
              return null;
            }
          }
        }
      }
      i += 1;
    }
  }
  
  public final String NI(String paramString)
  {
    GMTrace.i(20641612824576L, 153792);
    label188:
    label196:
    label202:
    label205:
    label212:
    label222:
    label229:
    for (;;)
    {
      int i;
      try
      {
        if (this.iFZ == null) {
          break label202;
        }
        i = 0;
        if (i >= this.iFZ.size()) {
          break label229;
        }
        if (((com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(i)).getType() != 1) {
          break label196;
        }
        localObject = com.tencent.mm.plugin.wenote.b.a.NL(((com.tencent.mm.plugin.wenote.model.a.h)this.iFZ.get(i)).content).replace("&lt;", "<").replace("&gt;", ">").replace(" ", " ");
        if (bg.nm((String)localObject)) {
          break label196;
        }
        localObject = ((String)localObject).split("\n");
        j = 0;
        if (j >= localObject.length) {
          break label188;
        }
        if (bg.nm(localObject[j].trim())) {
          break label222;
        }
        localObject = localObject[j];
        j = 1;
      }
      finally {}
      Object localObject = paramString;
      if (paramString.length() > 1000) {
        localObject = paramString.substring(0, 1000);
      }
      GMTrace.o(20641612824576L, 153792);
      return (String)localObject;
      int j = 0;
      localObject = paramString;
      break label205;
      localObject = paramString;
      break label212;
      continue;
      paramString = (String)localObject;
      if (j == 0)
      {
        i += 1;
        paramString = (String)localObject;
        continue;
        j += 1;
      }
    }
  }
  
  public final boolean Q(int paramInt, boolean paramBoolean)
  {
    boolean bool2 = false;
    GMTrace.i(17228724436992L, 128364);
    boolean bool1 = bool2;
    for (;;)
    {
      try
      {
        if (this.iFZ != null)
        {
          bool1 = bool2;
          if (paramInt >= 0)
          {
            bool1 = bool2;
            if (paramInt < this.iFZ.size())
            {
              a((com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(paramInt), false);
              this.iFZ.remove(paramInt);
              bool1 = true;
            }
          }
        }
        if ((bool1) && (paramBoolean) && (this.sdU != null))
        {
          this.sdU.yy(paramInt);
          if (paramInt > 0) {
            this.sdU.dK(paramInt - 1, this.iFZ.size() - (paramInt - 1));
          }
        }
        else
        {
          GMTrace.o(17228724436992L, 128364);
          return bool1;
        }
      }
      finally {}
      this.sdU.dK(paramInt, this.iFZ.size() - paramInt);
    }
  }
  
  public final void R(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17229261307904L, 128368);
    for (;;)
    {
      try
      {
        if (this.iFZ == null)
        {
          GMTrace.o(17229261307904L, 128368);
          return;
        }
        if ((paramInt >= 0) && (paramInt < this.iFZ.size()))
        {
          localb = (com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(paramInt);
          if ((localb != null) && (localb.scO != paramBoolean))
          {
            localb.scO = paramBoolean;
            if (this.sdU != null) {
              this.sdU.yw(paramInt);
            }
          }
          GMTrace.o(17229261307904L, 128368);
          return;
        }
        if (paramInt != -1) {
          continue;
        }
        paramInt = 0;
        if (paramInt >= this.iFZ.size()) {
          continue;
        }
        com.tencent.mm.plugin.wenote.model.a.b localb = (com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(paramInt);
        if ((localb != null) && (localb.scO != paramBoolean))
        {
          localb.scO = paramBoolean;
          if (this.sdU != null) {
            this.sdU.yw(paramInt);
          }
        }
      }
      finally {}
      paramInt += 1;
    }
  }
  
  public final void S(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17229798178816L, 128372);
    for (;;)
    {
      int i;
      try
      {
        if ((this.iFZ == null) || (paramInt < 0) || (paramInt >= this.iFZ.size()))
        {
          GMTrace.o(17229798178816L, 128372);
          return;
        }
        i = 0;
        if (i < this.iFZ.size()) {
          if (i == paramInt)
          {
            ((com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(i)).scH = true;
            ((com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(i)).scN = paramBoolean;
          }
          else
          {
            ((com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(i)).scH = false;
            ((com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(i)).scN = false;
          }
        }
      }
      finally {}
      GMTrace.o(17229798178816L, 128372);
      return;
      i += 1;
    }
  }
  
  public final int a(com.tencent.mm.plugin.wenote.model.a.b paramb, WXRTEditText paramWXRTEditText, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    GMTrace.i(20640807518208L, 153786);
    if (paramb == null)
    {
      GMTrace.o(20640807518208L, 153786);
      return -1;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramb);
    int i = a(localArrayList, paramWXRTEditText, true, true, paramBoolean1, paramBoolean2, paramBoolean3);
    GMTrace.o(20640807518208L, 153786);
    return i;
  }
  
  public final int a(ArrayList<com.tencent.mm.plugin.wenote.model.a.b> paramArrayList, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(20641075953664L, 153788);
    if ((paramArrayList == null) || (paramArrayList.size() <= 0) || (this.iFZ == null) || (paramInt2 < 0) || (paramInt3 < 0) || (paramInt4 < 0) || (paramInt4 < paramInt3))
    {
      w.e("MicroMsg.WNNote.NoteDataManager", "pasteItemList,error,return");
      GMTrace.o(20641075953664L, 153788);
      return -1;
    }
    if (com.tencent.mm.plugin.wenote.model.b.bGM().sbA == null)
    {
      w.e("MicroMsg.WNNote.NoteDataManager", "pasteItemList, but get wnnote base is null, return");
      GMTrace.o(20641075953664L, 153788);
      return -1;
    }
    Object localObject1 = (com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.get(paramArrayList.size() - 1);
    if (localObject1 == null)
    {
      w.e("MicroMsg.WNNote.NoteDataManager", "pasteItemList, lastInsertItem is null");
      GMTrace.o(20641075953664L, 153788);
      return -1;
    }
    ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).scJ = -1;
    ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).scH = true;
    ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).scN = false;
    Object localObject3 = yD(paramInt2);
    if (localObject3 == null)
    {
      w.e("MicroMsg.WNNote.NoteDataManager", "pasteItemList, item is null");
      GMTrace.o(20641075953664L, 153788);
      return -1;
    }
    for (;;)
    {
      label503:
      label508:
      int j;
      int i;
      try
      {
        bHs();
        if ((paramInt1 != 0) || (((com.tencent.mm.plugin.wenote.model.a.b)localObject3).getType() != 1)) {
          break label897;
        }
        Object localObject2 = com.tencent.mm.plugin.wenote.model.nativenote.a.a.NF(((com.tencent.mm.plugin.wenote.model.a.h)localObject3).content);
        if ((localObject2 == null) || (paramInt3 > ((Spanned)localObject2).length()) || (paramInt4 > ((Spanned)localObject2).length()))
        {
          if (localObject2 == null)
          {
            paramInt1 = -1;
            w.e("MicroMsg.WNNote.NoteDataManager", "pasteItemList error, oriText:%d  startOff:%d  endOff:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
            GMTrace.o(20641075953664L, 153788);
            return -1;
          }
          paramInt1 = ((Spanned)localObject2).length();
          continue;
        }
        localObject1 = ((Spanned)localObject2).subSequence(0, paramInt3);
        CharSequence localCharSequence = ((Spanned)localObject2).subSequence(paramInt4, ((Spanned)localObject2).length());
        localObject2 = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a((Spanned)localObject1);
        localObject1 = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a((Spanned)localCharSequence);
        localObject3 = (com.tencent.mm.plugin.wenote.model.a.h)localObject3;
        if (!bg.nm((String)localObject2))
        {
          if (!((String)localObject2).endsWith("<br/>")) {
            break label880;
          }
          localObject2 = ((String)localObject2).substring(0, ((String)localObject2).length() - 5);
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject3).content = ((String)localObject2);
          paramInt2 += 1;
          paramInt1 = paramInt2;
          if (bg.nm((String)localObject1)) {
            break label883;
          }
          localObject3 = new com.tencent.mm.plugin.wenote.model.a.h();
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject3).type = 1;
          localObject2 = localObject1;
          if (((String)localObject1).startsWith("<br/>")) {
            localObject2 = ((String)localObject1).substring(5, ((String)localObject1).length());
          }
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject3).content = ((String)localObject2);
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject3).scJ = 0;
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject3).scH = false;
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject3).scN = false;
          b(paramInt2, (com.tencent.mm.plugin.wenote.model.a.b)localObject3);
          paramInt1 = 1;
          paramInt3 = paramInt2;
          paramArrayList = paramArrayList.iterator();
          j = paramInt3;
          paramInt4 = paramInt1;
          i = paramInt2;
          if (paramArrayList.hasNext())
          {
            localObject1 = (com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.next();
            b((com.tencent.mm.plugin.wenote.model.a.b)localObject1);
            if (!b(paramInt3, (com.tencent.mm.plugin.wenote.model.a.b)localObject1)) {
              break label877;
            }
            paramInt3 += 1;
            break label877;
          }
        }
        else
        {
          if (!bg.nm((String)localObject1))
          {
            localObject2 = localObject1;
            if (((String)localObject1).startsWith("<br/>")) {
              localObject2 = ((String)localObject1).substring(5, ((String)localObject1).length());
            }
            ((com.tencent.mm.plugin.wenote.model.a.h)localObject3).content = ((String)localObject2);
            paramInt1 = 0;
            paramInt3 = paramInt2;
            continue;
          }
          yE(paramInt2);
          paramInt1 = paramInt2;
          if (this.sdU == null) {
            break label883;
          }
          this.sdU.yy(paramInt2);
          paramInt1 = paramInt2;
          break label883;
          label645:
          paramArrayList = paramArrayList.iterator();
          paramInt2 = paramInt1;
          if (!paramArrayList.hasNext()) {
            break label912;
          }
          localObject1 = (com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.next();
          b((com.tencent.mm.plugin.wenote.model.a.b)localObject1);
          if (!b(paramInt2, (com.tencent.mm.plugin.wenote.model.a.b)localObject1)) {
            break label869;
          }
          paramInt2 += 1;
          break label909;
        }
        if ((j - 1 >= 0) && (j - 1 < bHo().size()))
        {
          paramInt1 = j - 1;
          if (this.sdU != null)
          {
            paramInt3 = j - i;
            paramInt2 = paramInt3;
            if (paramInt4 != 0) {
              paramInt2 = paramInt3 + 1;
            }
            if ((i >= 0) && (paramInt2 > 0)) {
              this.sdU.dJ(i, paramInt2);
            }
            if (i <= 0) {
              break label841;
            }
            this.sdU.dK(i - 1, bHo().size() - (i - 1));
            this.sdU.yz(paramInt1);
          }
          bHx();
          GMTrace.o(20641075953664L, 153788);
          return paramInt1;
        }
      }
      finally {}
      paramInt1 = bHo().size() - 1;
      continue;
      label841:
      if (i == 0)
      {
        this.sdU.dK(i, bHo().size() - i);
        continue;
        label869:
        break label909;
        label877:
        label880:
        label883:
        label897:
        do
        {
          paramInt1 = paramInt2;
          break label645;
          break label508;
          break;
          paramInt4 = 0;
          paramInt3 = paramInt1;
          paramInt2 = paramInt1;
          paramInt1 = paramInt4;
          break label503;
        } while (paramInt1 == 1);
        paramInt1 = paramInt2 + 1;
        continue;
        label909:
        continue;
        label912:
        paramInt4 = 0;
        j = paramInt2;
        i = paramInt1;
      }
    }
  }
  
  public final int a(ArrayList<com.tencent.mm.plugin.wenote.model.a.b> paramArrayList, WXRTEditText paramWXRTEditText, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
    GMTrace.i(20640941735936L, 153787);
    if ((paramArrayList == null) || (paramArrayList.size() <= 0) || (this.iFZ == null))
    {
      w.e("MicroMsg.WNNote.NoteDataManager", "insertItemList,error,return");
      GMTrace.o(20640941735936L, 153787);
      return -1;
    }
    if (com.tencent.mm.plugin.wenote.model.b.bGM().sbA == null)
    {
      w.e("MicroMsg.WNNote.NoteDataManager", "insertItemList, but get wnnote base is null, return");
      GMTrace.o(20640941735936L, 153787);
      return -1;
    }
    if ((paramBoolean3) && (ab(paramArrayList)) && (this.sdU != null))
    {
      this.sdU.bGZ();
      GMTrace.o(20640941735936L, 153787);
      return -1;
    }
    Object localObject1;
    if (paramBoolean1)
    {
      localObject1 = (com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.get(paramArrayList.size() - 1);
      ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).scJ = -1;
      ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).scH = true;
      ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).scN = false;
      if ((paramWXRTEditText != null) && (paramWXRTEditText.seY))
      {
        if (paramWXRTEditText.seM != 2) {
          break label320;
        }
        ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).scQ = 2;
        paramWXRTEditText.seY = false;
        ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).scR = paramWXRTEditText.scR;
        paramWXRTEditText.scR = 0;
      }
    }
    label206:
    int n;
    int m;
    if ((paramWXRTEditText == null) || (paramWXRTEditText.bHM() != 0))
    {
      n = 0;
      m = 0;
      if (paramWXRTEditText != null) {
        break label446;
      }
    }
    for (;;)
    {
      int i;
      try
      {
        k = size();
        bHs();
        paramArrayList = paramArrayList.iterator();
        j = k;
        i = j;
        m = k;
        int i1 = n;
        if (paramArrayList.hasNext())
        {
          paramWXRTEditText = (com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.next();
          b(paramWXRTEditText);
          if ((paramWXRTEditText == null) || (this.iFZ == null)) {
            break label1290;
          }
          this.iFZ.add(paramWXRTEditText);
          a(paramWXRTEditText, true);
          i = 1;
          if (i == 0) {
            break label1296;
          }
          i = j + 1;
          j = i;
          continue;
          label320:
          if (paramWXRTEditText.seM != 1) {
            break;
          }
          ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).scQ = 1;
          break;
          if ((paramWXRTEditText.seM == 2) || (paramWXRTEditText.getSelectionStart() != 0) || (paramArrayList == null) || (paramArrayList.size() <= 0)) {
            break label206;
          }
          i = ((com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.get(0)).getType();
          if ((i != 2) && (i != 6) && (i != 5) && (i != 3) && (i != 4)) {
            break label206;
          }
          localObject1 = new com.tencent.mm.plugin.wenote.model.a.h();
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject1).content = "";
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject1).scH = false;
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject1).scN = false;
          paramArrayList.add(0, localObject1);
          break label206;
          label446:
          i = paramWXRTEditText.bHM();
          Object localObject2 = yD(i);
          if (localObject2 == null)
          {
            GMTrace.o(20640941735936L, 153787);
            return -1;
          }
          bHs();
          if ((paramWXRTEditText.seM == 0) && (((com.tencent.mm.plugin.wenote.model.a.b)localObject2).getType() == 1))
          {
            localObject1 = paramWXRTEditText.bHL();
            Object localObject3 = paramWXRTEditText.getText();
            paramWXRTEditText = ((Editable)localObject3).subSequence(0, ((e)localObject1).Vw);
            localObject3 = ((Editable)localObject3).subSequence(((e)localObject1).vt, ((Editable)localObject3).length());
            localObject1 = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a((Spanned)paramWXRTEditText);
            paramWXRTEditText = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a((Spanned)localObject3);
            localObject2 = (com.tencent.mm.plugin.wenote.model.a.h)localObject2;
            if (!bg.nm((String)localObject1))
            {
              if (!((String)localObject1).endsWith("<br/>")) {
                break label1310;
              }
              localObject1 = ((String)localObject1).substring(0, ((String)localObject1).length() - 5);
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).content = ((String)localObject1);
              i += 1;
              j = i;
              if (bg.nm(paramWXRTEditText)) {
                break label1313;
              }
              localObject2 = new com.tencent.mm.plugin.wenote.model.a.h();
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).type = 1;
              localObject1 = paramWXRTEditText;
              if (paramWXRTEditText.startsWith("<br/>")) {
                localObject1 = paramWXRTEditText.substring(5, paramWXRTEditText.length());
              }
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).content = ((String)localObject1);
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).scJ = 0;
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).scH = false;
              ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).scN = false;
              b(i, (com.tencent.mm.plugin.wenote.model.a.b)localObject2);
              n = 1;
              j = i;
              paramArrayList = paramArrayList.iterator();
              k = i;
              i = k;
              m = j;
              i1 = n;
              if (paramArrayList.hasNext())
              {
                paramWXRTEditText = (com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.next();
                b(paramWXRTEditText);
                if (!b(k, paramWXRTEditText)) {
                  break label1283;
                }
                i = k + 1;
                break label1303;
              }
            }
            else
            {
              if (!bg.nm(paramWXRTEditText))
              {
                localObject1 = paramWXRTEditText;
                if (paramWXRTEditText.startsWith("<br/>")) {
                  localObject1 = paramWXRTEditText.substring(5, paramWXRTEditText.length());
                }
                ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).content = ((String)localObject1);
                j = i;
                n = m;
                continue;
              }
              yE(i);
              j = i;
              if (this.sdU == null) {
                break label1313;
              }
              this.sdU.yy(i);
              j = i;
              break label1313;
            }
          }
          else
          {
            if (paramWXRTEditText.seM == 1) {
              break label1276;
            }
            j = i + 1;
            paramArrayList = paramArrayList.iterator();
            k = j;
            i = k;
            m = j;
            i1 = n;
            if (paramArrayList.hasNext())
            {
              paramWXRTEditText = (com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.next();
              b(paramWXRTEditText);
              if (!b(k, paramWXRTEditText)) {
                break label1269;
              }
              i = k + 1;
              break label1332;
            }
          }
        }
        if ((i - 1 >= 0) && (i - 1 < bHo().size()))
        {
          j = i - 1;
          k = j;
          n = i;
          if (paramBoolean5)
          {
            j += 1;
            i += 1;
            bHs();
            if (j >= bHo().size()) {
              break label1187;
            }
            paramArrayList = bHo().yD(j);
            k = j;
            n = i;
            if (paramArrayList != null)
            {
              paramArrayList.scJ = 0;
              paramArrayList.scH = true;
              paramArrayList.scN = false;
              n = i;
              k = j;
            }
          }
          if (this.sdU != null)
          {
            j = n - m;
            i = j;
            if (i1 != 0) {
              i = j + 1;
            }
            if ((m >= 0) && (i > 0)) {
              this.sdU.dJ(m, i);
            }
            if (m <= 0) {
              break label1241;
            }
            this.sdU.dK(m - 1, bHo().size() - (m - 1));
            if (paramBoolean4) {
              this.sdU.bGY();
            }
            this.sdU.yz(k);
          }
          bHx();
          GMTrace.o(20640941735936L, 153787);
          return k;
        }
      }
      finally {}
      int j = bHo().size() - 1;
      continue;
      label1187:
      paramArrayList = new com.tencent.mm.plugin.wenote.model.a.h();
      paramArrayList.type = 1;
      paramArrayList.content = "";
      paramArrayList.scJ = 0;
      paramArrayList.scH = true;
      paramArrayList.scN = false;
      b(j, paramArrayList);
      int k = j;
      n = i;
      continue;
      label1241:
      if (m == 0)
      {
        this.sdU.dK(m, bHo().size() - m);
        continue;
        label1269:
        i = k;
        break label1332;
        label1276:
        j = i;
        continue;
        label1283:
        i = k;
        break label1303;
        label1290:
        i = 0;
        continue;
        label1296:
        i = j;
        continue;
        label1303:
        k = i;
        continue;
        label1310:
        continue;
        label1313:
        k = j;
        i = j;
        j = k;
        n = m;
        continue;
        label1332:
        k = i;
      }
    }
  }
  
  public final void a(String paramString, com.tencent.mm.plugin.wenote.model.a.b paramb)
  {
    int i = 0;
    GMTrace.i(17228858654720L, 128365);
    for (;;)
    {
      try
      {
        if (this.iFZ == null)
        {
          GMTrace.o(17228858654720L, 128365);
          return;
          i += 1;
        }
        if (i < this.iFZ.size())
        {
          if (!((com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(i)).bGS().equals(paramString)) {
            continue;
          }
          a((com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(i), false);
          this.iFZ.set(i, paramb);
          a(paramb, true);
          if ((i != -1) && (this.sdU != null)) {
            this.sdU.yw(i);
          }
          GMTrace.o(17228858654720L, 128365);
          return;
        }
      }
      finally {}
      i = -1;
    }
  }
  
  public final boolean a(int paramInt, com.tencent.mm.plugin.wenote.model.a.b paramb)
  {
    boolean bool = true;
    GMTrace.i(20640539082752L, 153784);
    for (;;)
    {
      try
      {
        if ((this.iFZ == null) || (paramInt < 0) || (paramInt > this.iFZ.size())) {
          break label138;
        }
        this.iFZ.add(paramInt, paramb);
        a(paramb, true);
        if ((bool) && (this.sdU != null))
        {
          this.sdU.yx(paramInt);
          if (paramInt > 0) {
            this.sdU.dK(paramInt - 1, this.iFZ.size() - (paramInt - 1));
          }
        }
        else
        {
          GMTrace.o(20640539082752L, 153784);
          return bool;
        }
      }
      finally {}
      this.sdU.dK(paramInt, this.iFZ.size() - paramInt);
      continue;
      label138:
      bool = false;
    }
  }
  
  public final boolean a(int paramInt, ArrayList<com.tencent.mm.plugin.wenote.model.a.b> paramArrayList)
  {
    boolean bool = false;
    GMTrace.i(20640404865024L, 153783);
    if ((paramArrayList == null) || (paramArrayList.size() <= 0))
    {
      GMTrace.o(20640404865024L, 153783);
      return false;
    }
    for (;;)
    {
      int m;
      int j;
      int k;
      try
      {
        if (this.iFZ == null) {
          break label174;
        }
        m = 0;
        i = 0;
        if ((m >= paramArrayList.size()) || (paramInt < 0) || (paramInt > this.iFZ.size())) {
          break label194;
        }
        com.tencent.mm.plugin.wenote.model.a.b localb = (com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.get(m);
        j = i;
        k = paramInt;
        if (localb == null) {
          break label179;
        }
        b(localb);
        this.iFZ.add(paramInt, localb);
        j = i + 1;
        k = paramInt + 1;
        a(localb, true);
      }
      finally {}
      if ((bool) && (this.sdU != null)) {
        this.sdU.dJ(paramInt - i, i);
      }
      GMTrace.o(20640404865024L, 153783);
      return bool;
      label174:
      int i = 0;
      continue;
      label179:
      m += 1;
      paramInt = k;
      i = j;
      continue;
      label194:
      bool = true;
    }
  }
  
  public final boolean a(com.tencent.mm.plugin.wenote.model.a.b paramb)
  {
    boolean bool = true;
    GMTrace.i(17228321783808L, 128361);
    if (paramb != null) {}
    for (;;)
    {
      try
      {
        if (this.iFZ != null)
        {
          this.iFZ.add(paramb);
          a(paramb, true);
          GMTrace.o(17228321783808L, 128361);
          return bool;
        }
      }
      finally {}
      bool = false;
    }
  }
  
  public final boolean ab(ArrayList<com.tencent.mm.plugin.wenote.model.a.b> paramArrayList)
  {
    GMTrace.i(17231140356096L, 128382);
    StringBuilder localStringBuilder = new StringBuilder();
    paramArrayList = paramArrayList.iterator();
    int i = 0;
    while (paramArrayList.hasNext())
    {
      com.tencent.mm.plugin.wenote.model.a.b localb = (com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.next();
      if (localb.getType() != 1) {
        i += 1;
      } else {
        localStringBuilder.append(((com.tencent.mm.plugin.wenote.model.a.h)localb).content);
      }
    }
    boolean bool = dM(com.tencent.mm.plugin.wenote.b.b.NN(localStringBuilder.toString()), i);
    GMTrace.o(17231140356096L, 128382);
    return bool;
  }
  
  public final void bHp()
  {
    GMTrace.i(17229127090176L, 128367);
    if (this.iFZ != null) {}
    for (int i = this.iFZ.size();; i = 0)
    {
      w.i("MicroMsg.WNNote.NoteDataManager", "clear mDataList, size:%d", new Object[] { Integer.valueOf(i) });
      try
      {
        if (this.iFZ != null) {
          this.iFZ.clear();
        }
        this.sdY = 0;
        this.sdX = 0;
        GMTrace.o(17229127090176L, 128367);
        return;
      }
      finally {}
    }
  }
  
  public final int bHq()
  {
    GMTrace.i(17229395525632L, 128369);
    for (;;)
    {
      try
      {
        if (this.iFZ != null)
        {
          i = 0;
          if (i < this.iFZ.size())
          {
            if (((com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(i)).scH)
            {
              GMTrace.o(17229395525632L, 128369);
              return i;
            }
            i += 1;
            continue;
          }
        }
        int i = -1;
      }
      finally {}
    }
  }
  
  public final void bHr()
  {
    GMTrace.i(17229529743360L, 128370);
    try
    {
      if (this.iFZ != null)
      {
        Iterator localIterator = this.iFZ.iterator();
        while (localIterator.hasNext())
        {
          com.tencent.mm.plugin.wenote.model.a.b localb = (com.tencent.mm.plugin.wenote.model.a.b)localIterator.next();
          localb.scH = false;
          localb.scN = false;
        }
      }
    }
    finally {}
    GMTrace.o(17229529743360L, 128370);
  }
  
  public final int bHt()
  {
    GMTrace.i(17229932396544L, 128373);
    for (;;)
    {
      try
      {
        if (this.iFZ != null)
        {
          i = 0;
          if (i < this.iFZ.size())
          {
            if ((((com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(i)).getType() == 4) && (((k)this.iFZ.get(i)).scV.booleanValue()))
            {
              GMTrace.o(17229932396544L, 128373);
              return i;
            }
            i += 1;
            continue;
          }
        }
        int i = -1;
      }
      finally {}
    }
  }
  
  public final String bHu()
  {
    GMTrace.i(17230066614272L, 128374);
    for (;;)
    {
      try
      {
        if ((this.sdW != 0) || (this.iFZ == null)) {
          break;
        }
        Iterator localIterator = this.iFZ.iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        n localn = (n)localIterator.next();
        if (localn.sde.startsWith("WeNote_"))
        {
          i = bg.getInt(localn.sde.substring(7), -1);
          if (i > this.sdW) {
            this.sdW = i;
          } else {
            i = this.sdW;
          }
        }
      }
      finally {}
    }
    Object localObject2 = new StringBuilder("WeNote_");
    int i = this.sdW + 1;
    this.sdW = i;
    localObject2 = i;
    GMTrace.o(17230066614272L, 128374);
    return (String)localObject2;
  }
  
  public final String bHv()
  {
    GMTrace.i(17230200832000L, 128375);
    String str = "";
    for (;;)
    {
      int i;
      try
      {
        if ((this.iFZ == null) || (this.iFZ.size() <= 0))
        {
          GMTrace.o(17230200832000L, 128375);
          return "";
        }
        i = 0;
        com.tencent.mm.plugin.wenote.model.a.b localb;
        if (i < this.iFZ.size())
        {
          localb = (com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(i);
          localObject3 = str;
        }
        switch (localb.getType())
        {
        case 1: 
          localObject3 = (com.tencent.mm.plugin.wenote.model.a.h)localb;
          if (bg.nm(((com.tencent.mm.plugin.wenote.model.a.h)localObject3).content))
          {
            str = str + "<br/>";
          }
          else
          {
            str = str + ((com.tencent.mm.plugin.wenote.model.a.h)localObject3).content;
            localObject3 = str;
            if (i + 1 < this.iFZ.size())
            {
              localObject3 = str;
              if (((com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(i + 1)).getType() == 1)
              {
                localObject3 = str;
                if (!bg.nm(((com.tencent.mm.plugin.wenote.model.a.h)this.iFZ.get(i + 1)).content)) {
                  str = str + "<br/>";
                }
              }
            }
          }
          break;
        case 2: 
          localObject3 = (com.tencent.mm.plugin.wenote.model.a.e)localb;
          str = str + cw(((com.tencent.mm.plugin.wenote.model.a.e)localObject3).sde, 2);
          break;
        case 6: 
          localObject3 = (j)localb;
          str = str + cw(((j)localObject3).sde, 6);
          break;
        case 4: 
          localObject3 = (k)localb;
          str = str + cw(((k)localObject3).sde, 4);
          break;
        case 3: 
          localObject3 = (com.tencent.mm.plugin.wenote.model.a.f)localb;
          str = str + cw(((com.tencent.mm.plugin.wenote.model.a.f)localObject3).sde, 3);
          break;
        case 5: 
          localObject3 = (com.tencent.mm.plugin.wenote.model.a.c)localb;
          str = str + cw(((com.tencent.mm.plugin.wenote.model.a.c)localObject3).sde, 5);
          break;
        case -1: 
          str = str + "<hr/>";
          break label508;
          str = str.replaceAll("\n", "<br/>");
          GMTrace.o(17230200832000L, 128375);
          return str;
        }
      }
      finally {}
      Object localObject3 = localObject1;
      Object localObject2 = localObject3;
      label508:
      i += 1;
    }
  }
  
  public final ArrayList<com.tencent.mm.plugin.wenote.model.a.b> bHw()
  {
    GMTrace.i(17231006138368L, 128381);
    if (this.iFZ == null)
    {
      GMTrace.o(17231006138368L, 128381);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    try
    {
      Iterator localIterator = this.iFZ.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(com.tencent.mm.plugin.wenote.b.b.c((com.tencent.mm.plugin.wenote.model.a.b)localIterator.next()));
      }
    }
    finally {}
    GMTrace.o(17231006138368L, 128381);
    return localArrayList1;
  }
  
  public final void bHx()
  {
    GMTrace.i(20641344389120L, 153790);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20642686566400L, 153800);
        int i;
        try
        {
          if (c.this.iFZ == null)
          {
            GMTrace.o(20642686566400L, 153800);
            return;
          }
          StringBuilder localStringBuilder = new StringBuilder();
          Iterator localIterator = c.this.iFZ.iterator();
          i = 0;
          while (localIterator.hasNext())
          {
            com.tencent.mm.plugin.wenote.model.a.b localb = (com.tencent.mm.plugin.wenote.model.a.b)localIterator.next();
            if (localb.getType() != 1) {
              i += 1;
            } else {
              localStringBuilder.append(((com.tencent.mm.plugin.wenote.model.a.h)localb).content);
            }
          }
          c.this.sdX = com.tencent.mm.plugin.wenote.b.b.NN(((StringBuilder)localObject).toString());
        }
        finally {}
        c.this.sdY = i;
        GMTrace.o(20642686566400L, 153800);
      }
    });
    GMTrace.o(20641344389120L, 153790);
  }
  
  public final int bHy()
  {
    GMTrace.i(20641747042304L, 153793);
    try
    {
      if (this.iFZ == null)
      {
        GMTrace.o(20641747042304L, 153793);
        return -1;
      }
      int i = 0;
      while (i < this.iFZ.size())
      {
        com.tencent.mm.plugin.wenote.model.a.b localb = (com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(i);
        if ((localb != null) && (localb.getType() != -3) && (localb.getType() != -2))
        {
          GMTrace.o(20641747042304L, 153793);
          return i;
        }
        i += 1;
      }
      GMTrace.o(20641747042304L, 153793);
      return -1;
    }
    finally {}
  }
  
  public final int bHz()
  {
    GMTrace.i(20641881260032L, 153794);
    try
    {
      if (this.iFZ == null)
      {
        GMTrace.o(20641881260032L, 153794);
        return -1;
      }
      int i = this.iFZ.size() - 1;
      while (i >= 0)
      {
        com.tencent.mm.plugin.wenote.model.a.b localb = (com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(i);
        if ((localb != null) && (localb.getType() != -3) && (localb.getType() != -2))
        {
          GMTrace.o(20641881260032L, 153794);
          return i;
        }
        i -= 1;
      }
      GMTrace.o(20641881260032L, 153794);
      return -1;
    }
    finally {}
  }
  
  public final boolean dM(int paramInt1, int paramInt2)
  {
    GMTrace.i(20641210171392L, 153789);
    if (paramInt1 < 0) {}
    for (int i = 0;; i = 1)
    {
      if (paramInt2 < 0) {}
      for (int j = 0;; j = 1)
      {
        if ((i != 0) && (this.sdX + paramInt1 > 16384))
        {
          GMTrace.o(20641210171392L, 153789);
          return true;
        }
        if ((j != 0) && (this.sdY + paramInt2 > 30))
        {
          GMTrace.o(20641210171392L, 153789);
          return true;
        }
        GMTrace.o(20641210171392L, 153789);
        return false;
      }
    }
  }
  
  public final void dN(int paramInt1, int paramInt2)
  {
    GMTrace.i(20641478606848L, 153791);
    w.i("MicroMsg.WNNote.NoteDataManager", "checkMergeTextDataItem");
    for (;;)
    {
      Object localObject3;
      int i;
      Spanned localSpanned2;
      try
      {
        if (this.iFZ == null)
        {
          GMTrace.o(20641478606848L, 153791);
          return;
        }
        int j = paramInt1;
        if (paramInt1 <= 0) {
          j = 0;
        }
        if (paramInt2 < this.iFZ.size()) {
          break label407;
        }
        paramInt2 = this.iFZ.size() - 1;
        paramInt1 = -1;
        if (paramInt2 <= j) {
          break label360;
        }
        Object localObject1 = (com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(paramInt2);
        localObject3 = (com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(paramInt2 - 1);
        i = paramInt1;
        if (localObject1 == null) {
          break label412;
        }
        i = paramInt1;
        if (((com.tencent.mm.plugin.wenote.model.a.b)localObject1).getType() != 1) {
          break label412;
        }
        i = paramInt1;
        if (localObject3 == null) {
          break label412;
        }
        i = paramInt1;
        if (((com.tencent.mm.plugin.wenote.model.a.b)localObject3).getType() != 1) {
          break label412;
        }
        paramInt1 = paramInt2 - 1;
        localObject1 = (com.tencent.mm.plugin.wenote.model.a.h)localObject1;
        localObject3 = (com.tencent.mm.plugin.wenote.model.a.h)localObject3;
        Spanned localSpanned1 = com.tencent.mm.plugin.wenote.model.nativenote.a.a.NF(((com.tencent.mm.plugin.wenote.model.a.h)localObject1).content);
        localSpanned2 = com.tencent.mm.plugin.wenote.model.nativenote.a.a.NF(((com.tencent.mm.plugin.wenote.model.a.h)localObject3).content);
        ((com.tencent.mm.plugin.wenote.model.a.h)localObject3).content = (((com.tencent.mm.plugin.wenote.model.a.h)localObject3).content + "<br/>" + ((com.tencent.mm.plugin.wenote.model.a.h)localObject1).content);
        if (((com.tencent.mm.plugin.wenote.model.a.h)localObject1).scH)
        {
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject3).scH = true;
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject3).scN = false;
          if ((((com.tencent.mm.plugin.wenote.model.a.h)localObject1).scJ == -1) || (((com.tencent.mm.plugin.wenote.model.a.h)localObject1).scJ >= localSpanned1.length()))
          {
            ((com.tencent.mm.plugin.wenote.model.a.h)localObject3).scJ = -1;
            yE(paramInt2);
            i = paramInt1;
            if (this.sdU == null) {
              break label412;
            }
            this.sdU.yy(paramInt2);
            i = paramInt1;
            break label412;
          }
          i = localSpanned2.length();
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject1).scJ += i + 1;
          continue;
        }
        if (!((com.tencent.mm.plugin.wenote.model.a.h)localObject3).scH) {
          continue;
        }
      }
      finally {}
      if (((com.tencent.mm.plugin.wenote.model.a.h)localObject3).scJ == -1)
      {
        ((com.tencent.mm.plugin.wenote.model.a.h)localObject3).scJ = localSpanned2.length();
        continue;
        label360:
        if ((paramInt1 != -1) && (this.sdU != null)) {
          this.sdU.dK(paramInt1, this.iFZ.size() - paramInt1);
        }
        bHx();
        GMTrace.o(20641478606848L, 153791);
        return;
        label407:
        paramInt1 = -1;
        continue;
        label412:
        paramInt2 -= 1;
        paramInt1 = i;
      }
    }
  }
  
  public final int size()
  {
    GMTrace.i(17228053348352L, 128359);
    if (this.iFZ != null)
    {
      int i = this.iFZ.size();
      GMTrace.o(17228053348352L, 128359);
      return i;
    }
    GMTrace.o(17228053348352L, 128359);
    return 0;
  }
  
  public final com.tencent.mm.plugin.wenote.model.a.b yD(int paramInt)
  {
    GMTrace.i(17228187566080L, 128360);
    if ((this.iFZ != null) && (paramInt >= 0) && (paramInt < this.iFZ.size()))
    {
      com.tencent.mm.plugin.wenote.model.a.b localb = (com.tencent.mm.plugin.wenote.model.a.b)this.iFZ.get(paramInt);
      GMTrace.o(17228187566080L, 128360);
      return localb;
    }
    GMTrace.o(17228187566080L, 128360);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\manager\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */