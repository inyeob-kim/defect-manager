# defect-manager
Advanced Defect Management Service


Name of the local git branch is changed to "main" from "master"!!
Related Articles

https://www.zdnet.com/article/github-to-replace-master-with-alternative-term-to-avoid-slavery-references/
https://jarv.is/notes/github-rename-master/
Must rename your local master git branch! git branch -m master main

[How to use git (MUST READ)]

git clone [remote address] 
git pull origin main -> origin의 코드를 로컬 main 브랜치를 up-to-date 시킴
git checkout -b inyeobkim-dev -> 새로운 브랜치에서 작업은 필수! (브랜치 명명은 이름 + dev)
git push orign inyeobkim-dev -> inyeobkim-dev 브랜치를 remote origin 으로 푸쉬! (main 브랜치로 작업 브랜치를 merge 하지말고 작업 브랜치를 바로 push 해주세요)
협업자들끼리 확인한 뒤 다같이 merge 할 예정
그 외 명령어

git branch -d <branch_name> --> deleting local branch
git push -d origin <branch_name> --> deleting remote tracking branch
git branch -D dev (force delete without considering merge result: --delete --force)
git branch -a (list all branches including local and remote tracking)
git checkout -b <branch_name> (create a new branch of branch_name and switch to it)
