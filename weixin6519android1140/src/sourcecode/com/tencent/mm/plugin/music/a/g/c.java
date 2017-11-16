package com.tencent.mm.plugin.music.a.g;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends i<b>
{
  public e fTZ;
  public f<String, b> nsm;
  
  public c(e parame)
  {
    super(parame, b.fTp, "PieceMusicInfo", null);
    GMTrace.i(15010642264064L, 111838);
    this.fTZ = parame;
    this.nsm = new f(20);
    GMTrace.o(15010642264064L, 111838);
  }
  
  public final b DP(String paramString)
  {
    GMTrace.i(15010776481792L, 111839);
    if (this.nsm.get(paramString) != null)
    {
      paramString = (b)this.nsm.get(paramString);
      GMTrace.o(15010776481792L, 111839);
      return paramString;
    }
    Object localObject = String.format("Select * From PieceMusicInfo Where musicId=?", new Object[0]);
    localObject = this.fTZ.a((String)localObject, new String[] { paramString }, 2);
    if ((localObject != null) && (((Cursor)localObject).moveToFirst()))
    {
      b localb = new b();
      localb.b((Cursor)localObject);
      ((Cursor)localObject).close();
      this.nsm.put(paramString, localb);
      GMTrace.o(15010776481792L, 111839);
      return localb;
    }
    if (localObject != null) {
      ((Cursor)localObject).close();
    }
    GMTrace.o(15010776481792L, 111839);
    return null;
  }
  
  public final void p(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(15010910699520L, 111840);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("indexBitData", paramArrayOfByte);
    int i = this.fTZ.update("PieceMusicInfo", localContentValues, "musicId=?", new String[] { paramString });
    if (i <= 0) {
      w.i("MicroMsg.PieceMusicInfoStorage", "updateMusicFileIndexBitCache raw=%d musicId=%s", new Object[] { Integer.valueOf(i), paramString });
    }
    paramString = (b)this.nsm.get(paramString);
    if (paramString != null) {
      paramString.field_indexBitData = paramArrayOfByte;
    }
    GMTrace.o(15010910699520L, 111840);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\g\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */