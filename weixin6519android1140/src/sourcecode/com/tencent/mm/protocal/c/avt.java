package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class avt
  extends com.tencent.mm.bm.a
{
  public String eTJ;
  public int uKV;
  public boolean uKW;
  public String uKX;
  public int uKY;
  public int uKZ;
  public LinkedList<avs> uLa;
  
  public avt()
  {
    GMTrace.i(18812225191936L, 140162);
    this.uLa = new LinkedList();
    GMTrace.o(18812225191936L, 140162);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18812359409664L, 140163);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eTJ != null) {
        paramVarArgs.e(1, this.eTJ);
      }
      paramVarArgs.fk(2, this.uKV);
      paramVarArgs.ah(3, this.uKW);
      if (this.uKX != null) {
        paramVarArgs.e(4, this.uKX);
      }
      paramVarArgs.fk(5, this.uKY);
      paramVarArgs.fk(6, this.uKZ);
      paramVarArgs.d(7, 8, this.uLa);
      GMTrace.o(18812359409664L, 140163);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.eTJ != null) {
        paramInt = b.a.a.b.b.a.f(1, this.eTJ) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uKV) + (b.a.a.b.b.a.cK(3) + 1);
      paramInt = i;
      if (this.uKX != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uKX);
      }
      i = b.a.a.a.fh(5, this.uKY);
      int j = b.a.a.a.fh(6, this.uKZ);
      int k = b.a.a.a.c(7, 8, this.uLa);
      GMTrace.o(18812359409664L, 140163);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uLa.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(18812359409664L, 140163);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      avt localavt = (avt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(18812359409664L, 140163);
        return -1;
      case 1: 
        localavt.eTJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(18812359409664L, 140163);
        return 0;
      case 2: 
        localavt.uKV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(18812359409664L, 140163);
        return 0;
      case 3: 
        localavt.uKW = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(18812359409664L, 140163);
        return 0;
      case 4: 
        localavt.uKX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(18812359409664L, 140163);
        return 0;
      case 5: 
        localavt.uKY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(18812359409664L, 140163);
        return 0;
      case 6: 
        localavt.uKZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(18812359409664L, 140163);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new avs();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((avs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localavt.uLa.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(18812359409664L, 140163);
      return 0;
    }
    GMTrace.o(18812359409664L, 140163);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\avt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */