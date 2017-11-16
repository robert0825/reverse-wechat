package com.tencent.mm.plugin.report.kvdata;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public class WeChatSDInfo
  extends com.tencent.mm.bm.a
{
  public int depth_;
  public long dirCount_;
  public long fileCount_;
  public long fileLenInvalidCount_;
  public LinkedList<SubDirInfo> subDirList_;
  public int subDirResultsSize_;
  public long tempAccDirCount_;
  public int tempAccDirResultsSize_;
  public long tempAccFileCount_;
  public long tempAccFileLenInvalidCount_;
  public long tempAccTotalSize_;
  public long totalSize_;
  public long totalTime_;
  
  public WeChatSDInfo()
  {
    GMTrace.i(17508568399872L, 130449);
    this.subDirList_ = new LinkedList();
    GMTrace.o(17508568399872L, 130449);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17508702617600L, 130450);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.totalSize_);
      paramVarArgs.T(2, this.dirCount_);
      paramVarArgs.T(3, this.fileCount_);
      paramVarArgs.T(4, this.fileLenInvalidCount_);
      paramVarArgs.fk(5, this.subDirResultsSize_);
      paramVarArgs.T(6, this.totalTime_);
      paramVarArgs.fk(7, this.depth_);
      paramVarArgs.T(8, this.tempAccTotalSize_);
      paramVarArgs.fk(9, this.tempAccDirResultsSize_);
      paramVarArgs.T(10, this.tempAccDirCount_);
      paramVarArgs.T(11, this.tempAccFileCount_);
      paramVarArgs.T(12, this.tempAccFileLenInvalidCount_);
      paramVarArgs.d(13, 8, this.subDirList_);
      GMTrace.o(17508702617600L, 130450);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.S(1, this.totalSize_);
      i = b.a.a.a.S(2, this.dirCount_);
      int j = b.a.a.a.S(3, this.fileCount_);
      int k = b.a.a.a.S(4, this.fileLenInvalidCount_);
      int m = b.a.a.a.fh(5, this.subDirResultsSize_);
      int n = b.a.a.a.S(6, this.totalTime_);
      int i1 = b.a.a.a.fh(7, this.depth_);
      int i2 = b.a.a.a.S(8, this.tempAccTotalSize_);
      int i3 = b.a.a.a.fh(9, this.tempAccDirResultsSize_);
      int i4 = b.a.a.a.S(10, this.tempAccDirCount_);
      int i5 = b.a.a.a.S(11, this.tempAccFileCount_);
      int i6 = b.a.a.a.S(12, this.tempAccFileLenInvalidCount_);
      int i7 = b.a.a.a.c(13, 8, this.subDirList_);
      GMTrace.o(17508702617600L, 130450);
      return paramInt + 0 + i + j + k + m + n + i1 + i2 + i3 + i4 + i5 + i6 + i7;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.subDirList_.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(17508702617600L, 130450);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      WeChatSDInfo localWeChatSDInfo = (WeChatSDInfo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(17508702617600L, 130450);
        return -1;
      case 1: 
        localWeChatSDInfo.totalSize_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17508702617600L, 130450);
        return 0;
      case 2: 
        localWeChatSDInfo.dirCount_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17508702617600L, 130450);
        return 0;
      case 3: 
        localWeChatSDInfo.fileCount_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17508702617600L, 130450);
        return 0;
      case 4: 
        localWeChatSDInfo.fileLenInvalidCount_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17508702617600L, 130450);
        return 0;
      case 5: 
        localWeChatSDInfo.subDirResultsSize_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17508702617600L, 130450);
        return 0;
      case 6: 
        localWeChatSDInfo.totalTime_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17508702617600L, 130450);
        return 0;
      case 7: 
        localWeChatSDInfo.depth_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17508702617600L, 130450);
        return 0;
      case 8: 
        localWeChatSDInfo.tempAccTotalSize_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17508702617600L, 130450);
        return 0;
      case 9: 
        localWeChatSDInfo.tempAccDirResultsSize_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17508702617600L, 130450);
        return 0;
      case 10: 
        localWeChatSDInfo.tempAccDirCount_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17508702617600L, 130450);
        return 0;
      case 11: 
        localWeChatSDInfo.tempAccFileCount_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17508702617600L, 130450);
        return 0;
      case 12: 
        localWeChatSDInfo.tempAccFileLenInvalidCount_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17508702617600L, 130450);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new SubDirInfo();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((SubDirInfo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localWeChatSDInfo.subDirList_.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(17508702617600L, 130450);
      return 0;
    }
    GMTrace.o(17508702617600L, 130450);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\kvdata\WeChatSDInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */