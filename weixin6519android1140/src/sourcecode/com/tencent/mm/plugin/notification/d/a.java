package com.tencent.mm.plugin.notification.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.notification.c.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  private static final String nyv;
  
  static
  {
    GMTrace.i(10728694087680L, 79935);
    nyv = com.tencent.mm.compatible.util.e.ghz + "FailMsgFileCache";
    GMTrace.o(10728694087680L, 79935);
  }
  
  public static void a(int paramInt, a parama)
  {
    GMTrace.i(10728291434496L, 79932);
    String str = null;
    if (paramInt == 1) {
      str = nyv + File.separator + "normalMsg";
    }
    while (bg.nm(str))
    {
      w.e("MicroMsg.FailMsgFileCache", "flushToDisk error, cannot find filename");
      GMTrace.o(10728291434496L, 79932);
      return;
      if (paramInt == 2) {
        str = nyv + File.separator + "snsMsg";
      }
    }
    w.d("MicroMsg.FailMsgFileCache", "flushToDisk, filename:%s", new Object[] { str });
    parama = parama.aUR();
    w.d("MicroMsg.FailMsgFileCache", "flushToDisk, cacheContent:%s", new Object[] { parama });
    if (bg.nm(parama))
    {
      w.d("MicroMsg.FailMsgFileCache", "flushToDisk, content is empty");
      GMTrace.o(10728291434496L, 79932);
      return;
    }
    com.tencent.mm.a.e.b(str, parama.getBytes(), parama.length());
    GMTrace.o(10728291434496L, 79932);
  }
  
  public static void init()
  {
    GMTrace.i(10728157216768L, 79931);
    w.d("MicroMsg.FailMsgFileCache", "init FailMsgFileCache");
    new File(nyv).mkdirs();
    GMTrace.o(10728157216768L, 79931);
  }
  
  public static a sb(int paramInt)
  {
    GMTrace.i(10728425652224L, 79933);
    String str;
    if (paramInt == 1) {
      str = nyv + File.separator + "normalMsg";
    }
    for (;;)
    {
      if (bg.nm(str))
      {
        w.e("MicroMsg.FailMsgFileCache", "extractFromDisk error, cannot find filename");
        GMTrace.o(10728425652224L, 79933);
        return null;
        if (paramInt == 2) {
          str = nyv + File.separator + "snsMsg";
        }
      }
      else
      {
        w.d("MicroMsg.FailMsgFileCache", "extractFromDisk, filename:%s", new Object[] { str });
        try
        {
          str = com.tencent.mm.a.e.be(str);
          w.d("MicroMsg.FailMsgFileCache", "extractFromDisk, cacheContent:%s", new Object[] { str });
          a locala = new a();
          locala.Eb(str);
          GMTrace.o(10728425652224L, 79933);
          return locala;
        }
        catch (IOException localIOException)
        {
          w.printErrStackTrace("MicroMsg.FailMsgFileCache", localIOException, "", new Object[0]);
          w.d("MicroMsg.FailMsgFileCache", "extractFromDisk error:%s", new Object[] { localIOException.toString() });
          GMTrace.o(10728425652224L, 79933);
          return null;
        }
      }
      Object localObject = null;
    }
  }
  
  public static void sc(int paramInt)
  {
    GMTrace.i(10728559869952L, 79934);
    String str = null;
    if (paramInt == 1) {
      str = nyv + File.separator + "normalMsg";
    }
    while (bg.nm(str))
    {
      w.e("MicroMsg.FailMsgFileCache", "removeFile error, cannot find filename");
      GMTrace.o(10728559869952L, 79934);
      return;
      if (paramInt == 2) {
        str = nyv + File.separator + "snsMsg";
      }
    }
    w.d("MicroMsg.FailMsgFileCache", "removeFile, filename:%s", new Object[] { str });
    if (com.tencent.mm.a.e.aZ(str)) {
      new File(str).delete();
    }
    GMTrace.o(10728559869952L, 79934);
  }
  
  public static final class a
  {
    public b nyw;
    public int nyx;
    public ArrayList<Long> nyy;
    public ArrayList<Long> nyz;
    
    public a()
    {
      GMTrace.i(10727083474944L, 79923);
      this.nyw = new b();
      this.nyy = new ArrayList();
      this.nyz = new ArrayList();
      GMTrace.o(10727083474944L, 79923);
    }
    
    public a(b paramb, int paramInt, ArrayList<Long> paramArrayList1, ArrayList<Long> paramArrayList2)
    {
      GMTrace.i(10727217692672L, 79924);
      this.nyw = new b();
      this.nyy = new ArrayList();
      this.nyz = new ArrayList();
      this.nyw = paramb;
      this.nyx = paramInt;
      this.nyy = paramArrayList1;
      this.nyz = paramArrayList2;
      GMTrace.o(10727217692672L, 79924);
    }
    
    public final void Eb(String paramString)
    {
      GMTrace.i(10727486128128L, 79926);
      w.d("MicroMsg.FailMsgFileCache", "CacheObj, createFromFileContent");
      for (;;)
      {
        try
        {
          paramString = new JSONObject(paramString);
          JSONArray localJSONArray1 = paramString.getJSONArray("msg_list");
          JSONArray localJSONArray2 = paramString.getJSONArray("fail_msg_list");
          JSONArray localJSONArray3 = paramString.getJSONArray("success_msg_list");
          int j = paramString.getInt("current_send_index");
          w.d("MicroMsg.FailMsgFileCache", "createFromFileContent, msgArray.size:%d, failArray.size:%d, successArray.size:%d, index:%d", new Object[] { Integer.valueOf(localJSONArray1.length()), Integer.valueOf(localJSONArray2.length()), Integer.valueOf(localJSONArray3.length()), Integer.valueOf(j) });
          this.nyw.clear();
          this.nyz.clear();
          this.nyy.clear();
          i = 0;
          if (i < localJSONArray1.length())
          {
            this.nyw.da(localJSONArray1.getLong(i));
            i += 1;
            continue;
            if (i >= localJSONArray2.length()) {
              break label283;
            }
            this.nyz.add(Long.valueOf(localJSONArray2.getLong(i)));
            i += 1;
            continue;
            if (i < localJSONArray3.length())
            {
              this.nyy.add(Long.valueOf(localJSONArray3.getLong(i)));
              i += 1;
              continue;
            }
            this.nyx = j;
            GMTrace.o(10727486128128L, 79926);
            return;
          }
        }
        catch (JSONException paramString)
        {
          w.printErrStackTrace("MicroMsg.FailMsgFileCache", paramString, "", new Object[0]);
          w.d("MicroMsg.FailMsgFileCache", "createFromFileContent error:%s", new Object[] { paramString.getMessage() });
          GMTrace.o(10727486128128L, 79926);
          return;
        }
        int i = 0;
        continue;
        label283:
        i = 0;
      }
    }
    
    public final String aUR()
    {
      GMTrace.i(10727351910400L, 79925);
      w.d("MicroMsg.FailMsgFileCache", "CacheObj, serializeToString");
      try
      {
        JSONObject localJSONObject = new JSONObject();
        localJSONArray = new JSONArray();
        int i = 0;
        while (i < this.nyw.nyu.size())
        {
          localJSONArray.put(this.nyw.get(i));
          i += 1;
        }
        w.d("MicroMsg.FailMsgFileCache", "serializeToString, msgArray.size:%d", new Object[] { Integer.valueOf(localJSONArray.length()) });
        localJSONObject.put("msg_list", localJSONArray);
        w.d("MicroMsg.FailMsgFileCache", "serializeToString, currentSendIndex:%d", new Object[] { Integer.valueOf(this.nyx) });
        localJSONObject.put("current_send_index", this.nyx);
        localJSONArray = new JSONArray();
        localIterator = this.nyy.iterator();
        while (localIterator.hasNext()) {
          localJSONArray.put((Long)localIterator.next());
        }
      }
      catch (JSONException localJSONException)
      {
        w.printErrStackTrace("MicroMsg.FailMsgFileCache", localJSONException, "", new Object[0]);
        GMTrace.o(10727351910400L, 79925);
        return null;
      }
      tmp204_201[0] = Integer.valueOf(localJSONArray.length());
      w.d("MicroMsg.FailMsgFileCache", "serializeToString, successArray.size:%d", tmp204_201);
      localJSONException.put("success_msg_list", localJSONArray);
      JSONArray localJSONArray = new JSONArray();
      Iterator localIterator = this.nyz.iterator();
      while (localIterator.hasNext()) {
        localJSONArray.put((Long)localIterator.next());
      }
      w.d("MicroMsg.FailMsgFileCache", "serializeToString, failArray.size:%d", new Object[] { Integer.valueOf(localJSONArray.length()) });
      localJSONException.put("fail_msg_list", localJSONArray);
      String str = localJSONException.toString();
      GMTrace.o(10727351910400L, 79925);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\notification\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */