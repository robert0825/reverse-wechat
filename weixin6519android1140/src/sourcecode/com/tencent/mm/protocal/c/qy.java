package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class qy
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public int etB;
  public String lPj;
  public String lRV;
  public String tRS;
  public qx ugT;
  public String ugV;
  public String ugW;
  public int ugX;
  public String ugY;
  
  public qy()
  {
    GMTrace.i(3830305521664L, 28538);
    GMTrace.o(3830305521664L, 28538);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3830439739392L, 28539);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ugT == null) {
        throw new b("Not all required fields were included: BannerImg");
      }
      if (this.ugT != null)
      {
        paramVarArgs.fm(1, this.ugT.aYq());
        this.ugT.a(paramVarArgs);
      }
      if (this.eBt != null) {
        paramVarArgs.e(2, this.eBt);
      }
      if (this.ugV != null) {
        paramVarArgs.e(3, this.ugV);
      }
      paramVarArgs.fk(4, this.etB);
      if (this.ugW != null) {
        paramVarArgs.e(5, this.ugW);
      }
      paramVarArgs.fk(6, this.ugX);
      if (this.lRV != null) {
        paramVarArgs.e(7, this.lRV);
      }
      if (this.lPj != null) {
        paramVarArgs.e(8, this.lPj);
      }
      if (this.tRS != null) {
        paramVarArgs.e(9, this.tRS);
      }
      if (this.ugY != null) {
        paramVarArgs.e(10, this.ugY);
      }
      GMTrace.o(3830439739392L, 28539);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.ugT != null) {
        i = b.a.a.a.fj(1, this.ugT.aYq()) + 0;
      }
      paramInt = i;
      if (this.eBt != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eBt);
      }
      i = paramInt;
      if (this.ugV != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ugV);
      }
      i += b.a.a.a.fh(4, this.etB);
      paramInt = i;
      if (this.ugW != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.ugW);
      }
      i = paramInt + b.a.a.a.fh(6, this.ugX);
      paramInt = i;
      if (this.lRV != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.lRV);
      }
      i = paramInt;
      if (this.lPj != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.lPj);
      }
      paramInt = i;
      if (this.tRS != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.tRS);
      }
      i = paramInt;
      if (this.ugY != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.ugY);
      }
      GMTrace.o(3830439739392L, 28539);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ugT == null) {
        throw new b("Not all required fields were included: BannerImg");
      }
      GMTrace.o(3830439739392L, 28539);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      qy localqy = (qy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3830439739392L, 28539);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new qx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((qx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localqy.ugT = ((qx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3830439739392L, 28539);
        return 0;
      case 2: 
        localqy.eBt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3830439739392L, 28539);
        return 0;
      case 3: 
        localqy.ugV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3830439739392L, 28539);
        return 0;
      case 4: 
        localqy.etB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830439739392L, 28539);
        return 0;
      case 5: 
        localqy.ugW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3830439739392L, 28539);
        return 0;
      case 6: 
        localqy.ugX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830439739392L, 28539);
        return 0;
      case 7: 
        localqy.lRV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3830439739392L, 28539);
        return 0;
      case 8: 
        localqy.lPj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3830439739392L, 28539);
        return 0;
      case 9: 
        localqy.tRS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3830439739392L, 28539);
        return 0;
      }
      localqy.ugY = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3830439739392L, 28539);
      return 0;
    }
    GMTrace.o(3830439739392L, 28539);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\qy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */