package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bgx
  extends com.tencent.mm.bm.a
{
  public int uSA;
  public LinkedList<Integer> uSB;
  public int uSC;
  public LinkedList<Integer> uSD;
  public int uSr;
  public int uSs;
  public int uSt;
  public boe uSu;
  public int uSv;
  public int uSw;
  public int uSx;
  public int uSy;
  public LinkedList<Integer> uSz;
  
  public bgx()
  {
    GMTrace.i(3748835360768L, 27931);
    this.uSz = new LinkedList();
    this.uSB = new LinkedList();
    this.uSD = new LinkedList();
    GMTrace.o(3748835360768L, 27931);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3748969578496L, 27932);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uSu == null) {
        throw new b.a.a.b("Not all required fields were included: Addr");
      }
      paramVarArgs.fk(1, this.uSr);
      paramVarArgs.fk(2, this.uSs);
      paramVarArgs.fk(3, this.uSt);
      if (this.uSu != null)
      {
        paramVarArgs.fm(4, this.uSu.aYq());
        this.uSu.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.uSv);
      paramVarArgs.fk(6, this.uSw);
      paramVarArgs.fk(7, this.uSx);
      paramVarArgs.fk(8, this.uSy);
      paramVarArgs.c(9, this.uSz);
      paramVarArgs.fk(10, this.uSA);
      paramVarArgs.c(11, this.uSB);
      paramVarArgs.fk(12, this.uSC);
      paramVarArgs.c(13, this.uSD);
      GMTrace.o(3748969578496L, 27932);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uSr) + 0 + b.a.a.a.fh(2, this.uSs) + b.a.a.a.fh(3, this.uSt);
      paramInt = i;
      if (this.uSu != null) {
        paramInt = i + b.a.a.a.fj(4, this.uSu.aYq());
      }
      i = b.a.a.a.fh(5, this.uSv);
      int j = b.a.a.a.fh(6, this.uSw);
      int k = b.a.a.a.fh(7, this.uSx);
      int m = b.a.a.a.fh(8, this.uSy);
      int n = b.a.a.a.b(9, this.uSz);
      int i1 = b.a.a.a.fh(10, this.uSA);
      int i2 = b.a.a.a.b(11, this.uSB);
      int i3 = b.a.a.a.fh(12, this.uSC);
      int i4 = b.a.a.a.b(13, this.uSD);
      GMTrace.o(3748969578496L, 27932);
      return paramInt + i + j + k + m + n + i1 + i2 + i3 + i4;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uSz.clear();
      this.uSB.clear();
      this.uSD.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uSu == null) {
        throw new b.a.a.b("Not all required fields were included: Addr");
      }
      GMTrace.o(3748969578496L, 27932);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bgx localbgx = (bgx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3748969578496L, 27932);
        return -1;
      case 1: 
        localbgx.uSr = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3748969578496L, 27932);
        return 0;
      case 2: 
        localbgx.uSs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3748969578496L, 27932);
        return 0;
      case 3: 
        localbgx.uSt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3748969578496L, 27932);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new boe();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((boe)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbgx.uSu = ((boe)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3748969578496L, 27932);
        return 0;
      case 5: 
        localbgx.uSv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3748969578496L, 27932);
        return 0;
      case 6: 
        localbgx.uSw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3748969578496L, 27932);
        return 0;
      case 7: 
        localbgx.uSx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3748969578496L, 27932);
        return 0;
      case 8: 
        localbgx.uSy = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3748969578496L, 27932);
        return 0;
      case 9: 
        localbgx.uSz = new b.a.a.a.a(((b.a.a.a.a)localObject1).csV().tJp, unknownTagHandler).csS();
        GMTrace.o(3748969578496L, 27932);
        return 0;
      case 10: 
        localbgx.uSA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3748969578496L, 27932);
        return 0;
      case 11: 
        localbgx.uSB = new b.a.a.a.a(((b.a.a.a.a)localObject1).csV().tJp, unknownTagHandler).csS();
        GMTrace.o(3748969578496L, 27932);
        return 0;
      case 12: 
        localbgx.uSC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3748969578496L, 27932);
        return 0;
      }
      localbgx.uSD = new b.a.a.a.a(((b.a.a.a.a)localObject1).csV().tJp, unknownTagHandler).csS();
      GMTrace.o(3748969578496L, 27932);
      return 0;
    }
    GMTrace.o(3748969578496L, 27932);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bgx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */