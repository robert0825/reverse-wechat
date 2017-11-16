package com.tencent.mm.plugin.report.kvdata;

import com.tencent.gmtrace.GMTrace;

public class SubDirInfo
  extends com.tencent.mm.bm.a
{
  public long dirCount_;
  public long fileCount_;
  public long fileLenInvalidCount;
  public int tag_;
  public long totalSize_;
  
  public SubDirInfo()
  {
    GMTrace.i(17507763093504L, 130443);
    GMTrace.o(17507763093504L, 130443);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17507897311232L, 130444);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tag_);
      paramVarArgs.T(2, this.totalSize_);
      paramVarArgs.T(3, this.dirCount_);
      paramVarArgs.T(4, this.fileCount_);
      paramVarArgs.T(5, this.fileLenInvalidCount);
      GMTrace.o(17507897311232L, 130444);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tag_);
      int i = b.a.a.a.S(2, this.totalSize_);
      int j = b.a.a.a.S(3, this.dirCount_);
      int k = b.a.a.a.S(4, this.fileCount_);
      int m = b.a.a.a.S(5, this.fileLenInvalidCount);
      GMTrace.o(17507897311232L, 130444);
      return paramInt + 0 + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(17507897311232L, 130444);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      SubDirInfo localSubDirInfo = (SubDirInfo)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(17507897311232L, 130444);
        return -1;
      case 1: 
        localSubDirInfo.tag_ = locala.yqV.nj();
        GMTrace.o(17507897311232L, 130444);
        return 0;
      case 2: 
        localSubDirInfo.totalSize_ = locala.yqV.nk();
        GMTrace.o(17507897311232L, 130444);
        return 0;
      case 3: 
        localSubDirInfo.dirCount_ = locala.yqV.nk();
        GMTrace.o(17507897311232L, 130444);
        return 0;
      case 4: 
        localSubDirInfo.fileCount_ = locala.yqV.nk();
        GMTrace.o(17507897311232L, 130444);
        return 0;
      }
      localSubDirInfo.fileLenInvalidCount = locala.yqV.nk();
      GMTrace.o(17507897311232L, 130444);
      return 0;
    }
    GMTrace.o(17507897311232L, 130444);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\kvdata\SubDirInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */