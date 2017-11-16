package com.tencent.mm.plugin.fts.a;

import com.tencent.mm.kernel.b.c;
import com.tencent.mm.plugin.fts.a.a.a;

public abstract interface l
  extends c
{
  public abstract void addSOSHistory(String paramString);
  
  public abstract void cancelSearchTask(a parama);
  
  public abstract void deleteSOSHistory();
  
  public abstract void deleteSOSHistory(String paramString);
  
  public abstract f getFTSIndexDB();
  
  public abstract g getFTSIndexStorage(int paramInt);
  
  public abstract h getFTSMainDB();
  
  public abstract k getFTSTaskDaemon();
  
  public abstract boolean isFTSContextReady();
  
  public abstract boolean isFTSIndexReady();
  
  public abstract void registerIndexStorage(g paramg);
  
  public abstract void registerNativeLogic(int paramInt, i parami);
  
  public abstract a search(int paramInt, com.tencent.mm.plugin.fts.a.a.f paramf);
  
  public abstract int stringCompareUtfBinary(String paramString1, String paramString2);
  
  public abstract void unregisterIndexStorage(int paramInt);
  
  public abstract void unregisterNativeLogic(int paramInt);
  
  public abstract void updateTopHitsRank(String paramString, com.tencent.mm.plugin.fts.a.a.i parami, int paramInt);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\fts\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */