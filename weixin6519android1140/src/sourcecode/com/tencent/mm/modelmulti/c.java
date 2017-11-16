package com.tencent.mm.modelmulti;

import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;

public abstract interface c
{
  public abstract void a(int paramInt, a parama);
  
  public static final class a
  {
    long eJe;
    long fileLenInvalidCount;
    final String gLQ;
    long gLR;
    long gLS;
    long gLT;
    int gLU;
    ArrayList<c.b> gLV;
    ArrayList<c.c> gLW;
    boolean gLX;
    
    a(String paramString)
    {
      GMTrace.i(396881821696L, 2957);
      this.gLV = new ArrayList(20);
      this.gLW = new ArrayList(20);
      this.gLX = false;
      this.gLQ = paramString;
      GMTrace.o(396881821696L, 2957);
    }
    
    public final String toString()
    {
      GMTrace.i(397016039424L, 2958);
      String str = String.format("FileResult hash(%d) root[%s], canceled[%b], dirCount[%d], fileCount[%d], totalSize[%d], fileLenInvalidCount[%d], subDirResult[%d], tempAccDirResult[%d], totalTime[%d], depth[%d]", new Object[] { Integer.valueOf(hashCode()), this.gLQ, Boolean.valueOf(this.gLX), Long.valueOf(this.gLR), Long.valueOf(this.gLS), Long.valueOf(this.eJe), Long.valueOf(this.fileLenInvalidCount), Integer.valueOf(this.gLV.size()), Integer.valueOf(this.gLW.size()), Long.valueOf(this.gLT), Integer.valueOf(this.gLU) });
      GMTrace.o(397016039424L, 2958);
      return str;
    }
  }
  
  public static final class b
  {
    long eJe;
    long fileLenInvalidCount;
    final String gLQ;
    long gLR;
    long gLS;
    boolean gLX;
    final int tag;
    
    b(String paramString, int paramInt)
    {
      GMTrace.i(409498288128L, 3051);
      this.gLX = false;
      this.gLQ = paramString;
      this.tag = paramInt;
      GMTrace.o(409498288128L, 3051);
    }
    
    public final String toString()
    {
      GMTrace.i(409632505856L, 3052);
      String str = String.format("SubDirResult hash(%d) root[%d][%s], canceled[%b], dirCount[%d], fileCount[%d], totalSize[%d], fileLenInvalidCount[%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.tag), this.gLQ, Boolean.valueOf(this.gLX), Long.valueOf(this.gLR), Long.valueOf(this.gLS), Long.valueOf(this.eJe), Long.valueOf(this.fileLenInvalidCount) });
      GMTrace.o(409632505856L, 3052);
      return str;
    }
  }
  
  public static final class c
  {
    long eJe;
    final String gLQ;
    long gLR;
    long gLS;
    boolean gLX;
    long gLY;
    
    c(String paramString)
    {
      GMTrace.i(405874409472L, 3024);
      this.gLX = false;
      this.gLQ = paramString;
      GMTrace.o(405874409472L, 3024);
    }
    
    public final String toString()
    {
      GMTrace.i(406008627200L, 3025);
      String str = String.format("TempAccDirResult hash(%d) root[%s], canceled[%b], dirCount[%d], fileCount[%d], totalSize[%d], fileLenInvaildCount[%d]", new Object[] { Integer.valueOf(hashCode()), this.gLQ, Boolean.valueOf(this.gLX), Long.valueOf(this.gLR), Long.valueOf(this.gLS), Long.valueOf(this.eJe), Long.valueOf(this.gLY) });
      GMTrace.o(406008627200L, 3025);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelmulti\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */