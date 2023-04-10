# defect-manager
Advanced Defect Management Service


## Github
### Name of the local git branch is changed to "main" from "master"!!
Related Articles</br>
* https://www.zdnet.com/article/github-to-replace-master-with-alternative-term-to-avoid-slavery-references/ 
* https://jarv.is/notes/github-rename-master/

Must rename your local master git branch!
git branch -m master main

[깃 사용 방법 (필독!!)]
1. git clone [remote address] -> 로컬에 복사(git remote -v 쳐보면 git clone때문에 remote 주소가 등록됨)
2. git branch -m master main (master -> main 으로 rename)
3. git pull origin main -> origin의 코드를 로컬 main 브랜치를 up-to-date 시킴
4. git checkout -b inyeobkim-dev -> 새로운 브랜치에서 작업은 필수! (브랜치 명명은 이름 + dev)
5. 작업 진행
6. git status
7. git add .
8. git commit -m "수정된 사항 메시지 작성"
9. git push orign inyeobkim-dev -> inyeobkim-dev 브랜치를 remote origin 으로 푸쉬! (main 브랜치로 작업 브랜치를 merge 하지말고 작업 브랜치를 바로 push 해주세요)
10. git branch -D inyeobkim-dev -> 작업 브랜치 삭제

협업자들끼리 확인한 뒤 다같이 merge 할 예정

그 외 명령어
1. git branch -d <branch_name> --> deleting local branch
2. git push -d origin <branch_name> --> deleting remote tracking branch
3. git branch -D dev (force delete without considering merge result: --delete --force)
4. git branch -a (list all branches including local and remote tracking)
5. git checkout -b <branch_name> (create a new branch of branch_name and switch to it)

# Development Resources
* https://trello.com/en (Project Management Tool) -> Make sure to add your name and a due date when making a new card
* https://docs.google.com/document/d/134MmpJO3CIvDpNYukts_IlSy3LWm9_-zJSPI-eJ_Myc/edit - Google Doc for the meeting minutes
* https://slack.com/ - for the group project

<img width="886" alt="Screenshot 2023-04-11 at 12 48 45 AM" src="https://user-images.githubusercontent.com/60948817/230939078-5c78dac8-c036-4b12-ad98-4c766b581b20.png">

